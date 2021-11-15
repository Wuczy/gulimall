package com.wczy.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wczy.common.utils.PageUtils;
import com.wczy.gulimall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author wczy
 * @email wuchengzhi368@gmail.com
 * @date 2021-11-15 20:45:38
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

