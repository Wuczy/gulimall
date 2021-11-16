package com.wczy.gulimall.product;


import com.alibaba.fastjson.JSON;
import com.wczy.gulimall.product.entity.dto.CategoryDto;
import com.wczy.gulimall.product.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

	@Autowired
	CategoryService categoryService;

	@Test
	public void listWithTree() {
		List<CategoryDto> categoryDtos = categoryService.listWithTree();
		System.out.println(JSON.toJSONString(categoryDtos));
	}

}
