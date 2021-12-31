package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author Arthur
 * @email 136409310@qq.com
 * @date 2021-12-29 15:26:01
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
