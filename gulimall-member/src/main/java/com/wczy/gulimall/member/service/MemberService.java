package com.wczy.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wczy.common.utils.PageUtils;
import com.wczy.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author wczy
 * @email wuchengzhi368@gmail.com
 * @date 2021-11-15 20:50:15
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

