package com.wczy.gulimall.product.dao;

import com.wczy.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wczy
 * @email wuchengzhi368@gmail.com
 * @date 2021-11-15 19:07:28
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
