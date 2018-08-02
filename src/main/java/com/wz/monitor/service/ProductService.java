package com.wz.monitor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wz.monitor.dao.ProductDao;
import com.wz.monitor.entity.Product;

@Service
public class ProductService extends BaseService<ProductDao, Product>  {
	@Autowired
	private ProductDao dao;
	public List<Product> findByType(Product entity){
		return dao.findByType(entity);
	}
}
