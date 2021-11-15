package com.wczy.gulimall.member.dao;

import com.wczy.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wczy
 * @email wuchengzhi368@gmail.com
 * @date 2021-11-15 20:50:15
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
