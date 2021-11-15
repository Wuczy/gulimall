package com.wczy.gulimall.coupon.dao;

import com.wczy.gulimall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author wczy
 * @email wuchengzhi368@gmail.com
 * @date 2021-11-15 20:45:38
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
