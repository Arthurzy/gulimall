package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Arthur
 * @email 136409310@qq.com
 * @date 2021-12-28 16:10:11
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
