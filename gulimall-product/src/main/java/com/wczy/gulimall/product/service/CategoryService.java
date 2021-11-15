package com.wczy.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wczy.common.utils.PageUtils;
import com.wczy.gulimall.product.entity.CategoryEntity;
import com.wczy.gulimall.product.entity.dto.CategoryDto;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author wczy
 * @email wuchengzhi368@gmail.com
 * @date 2021-11-15 19:07:28
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    /**
     * 查询所有商品分类信息
     * @return 以树形结构返回商品分类信息
     */
    List<CategoryDto> listWithTree();
}

