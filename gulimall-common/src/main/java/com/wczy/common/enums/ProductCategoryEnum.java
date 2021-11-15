package com.wczy.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ProductCategoryEnum {
    FIRST_CATEGORY(1,"一级分类"),
    SECOND_CATEGORY(2,"二级分类"),
    THIRD_CATEGORY(3,"三级分类"),

    ;
    private Integer code;
    private String desc;

}
