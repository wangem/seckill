package com.answern.seckill.core.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.answern.seckill.core.demo.bin.Goods;
import com.answern.seckill.core.demo.dao.GoodsDao;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class MybatisService {
	@Autowired
	private GoodsDao goodsMapper;
	
	public String index() {
		Goods selectByPrimaryKey = goodsMapper.selectByPrimaryKey(1);
		String name = selectByPrimaryKey.getName();
		System.out.println(selectByPrimaryKey.getName());
		 return name;  

	}
	
	public  List<Goods> selectAll() {
		PageHelper.startPage(1, 2);
		 List<Goods> selectAll = goodsMapper.selectAll();
		 
		System.out.println(selectAll);
		return selectAll;  
		
	}
	public  Page<Goods> findByPage(int pageNum, int pageSize) { 
		PageHelper.startPage(pageNum, pageSize);
		Page<Goods> selectAll = goodsMapper.findByPage();
		
		System.out.println(selectAll);
		return selectAll;  
		
	}
}
