package com.answern.seckill.core.demo.dao;

 

import java.util.List;

import com.answern.seckill.core.demo.bin.Goods;
import com.github.pagehelper.Page;

public interface GoodsDao {

	Goods selectByPrimaryKey(Integer id);
	
	List<Goods> selectAll();
	Page<Goods> findByPage();
}
 