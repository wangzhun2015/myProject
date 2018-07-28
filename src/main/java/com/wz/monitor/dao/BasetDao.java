package com.wz.monitor.dao;

import java.util.List;

public interface BasetDao <T>{
public   List<T>  findList(T t);
public void insert(T t);
public void update(T t);
public void delete(T t);
public int findTotalCount(T t);
}
