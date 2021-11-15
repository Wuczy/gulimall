package com.wczy.gulimall.order.dao;

import com.wczy.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author wczy
 * @email wuchengzhi368@gmail.com
 * @date 2021-11-15 21:03:08
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
