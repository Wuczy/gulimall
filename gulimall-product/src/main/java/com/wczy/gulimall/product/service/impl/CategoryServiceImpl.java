package com.wczy.gulimall.product.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wczy.common.enums.ProductCategoryEnum;
import com.wczy.common.utils.PageUtils;
import com.wczy.common.utils.Query;
import com.wczy.gulimall.product.dao.CategoryDao;
import com.wczy.gulimall.product.entity.CategoryEntity;
import com.wczy.gulimall.product.entity.dto.CategoryDto;
import com.wczy.gulimall.product.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryDto> listWithTree() {
        List<CategoryEntity> categoryEntityList = this.list();
        if (CollUtil.isEmpty(categoryEntityList)) {
            return null;
        }
        //按分类级别分组
        Map<Long, List<CategoryEntity>> relationalMap = categoryEntityList.stream()
                .collect(Collectors.groupingBy(CategoryEntity::getParentCid));
        return categoryEntityList.stream()
                //得到一级分类
                .filter(category -> ProductCategoryEnum.FIRST_CATEGORY.getCode().equals(category.getCatLevel()))
                .map(firstCategory -> {
                    CategoryDto firstCategoryDto = new CategoryDto();
                    BeanUtil.copyProperties(firstCategory, firstCategoryDto);
                    //得到二级分类
                    List<CategoryEntity> secondList = relationalMap.get(firstCategoryDto.getCatId());
                    List<CategoryDto> secondDtoList = secondList.stream()
                            .map(secondCategory -> {
                                CategoryDto secondCategoryDto = new CategoryDto();
                                BeanUtil.copyProperties(secondCategory, secondCategoryDto);
                                //得到三级分类
                                List<CategoryEntity> thirdList = relationalMap.get(secondCategoryDto.getCatId());
                                List<CategoryDto> thirdDtoList = BeanUtil.copyToList(thirdList, CategoryDto.class).stream()
                                        .sorted(Comparator.comparing(CategoryDto::getSort))
                                        .collect(Collectors.toList());
                                secondCategoryDto.setCategoryDtoList(thirdDtoList);
                                return secondCategoryDto;
                            })
                            .sorted(Comparator.comparing(CategoryDto::getSort))
                            .collect(Collectors.toList());
                    firstCategoryDto.setCategoryDtoList(secondDtoList);
                    return firstCategoryDto;
                })
                .sorted(Comparator.comparing(CategoryDto::getSort))
                .collect(Collectors.toList());
    }

}