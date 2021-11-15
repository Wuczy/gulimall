package com.wczy.gulimall.product;


import com.wczy.gulimall.product.entity.AttrEntity;
import com.wczy.gulimall.product.service.AttrService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

	@Autowired
	AttrService attrService;

	@Test
	public void contextLoads() {
		AttrEntity attrEntity = new AttrEntity();
		attrEntity.setAttrName("222");
		attrService.save(attrEntity);
	}

}
