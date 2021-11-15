package com.wczy.gulimall.order.dao;

import com.wczy.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author wczy
 * @email wuchengzhi368@gmail.com
 * @date 2021-11-15 21:03:08
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
