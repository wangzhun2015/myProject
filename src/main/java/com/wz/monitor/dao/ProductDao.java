package com.wz.monitor.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wz.monitor.entity.Product;
@Mapper
public interface ProductDao  extends BasetDao<Product>{

	public List<Product> findByType(Product entity);
}
