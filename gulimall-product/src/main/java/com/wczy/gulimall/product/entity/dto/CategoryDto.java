package com.wczy.gulimall.product.entity.dto;

import com.wczy.gulimall.product.entity.CategoryEntity;
import lombok.Data;

import java.util.List;

/**
 * 商品分类dto
 */
@Data
public class CategoryDto extends CategoryEntity {
    /**
     * 子分类信息
     */
    private List<CategoryDto> categoryDtoList;
}
