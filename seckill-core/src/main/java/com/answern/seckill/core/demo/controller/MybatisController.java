package com.answern.seckill.core.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.answern.seckill.core.demo.bin.Goods;
import com.answern.seckill.core.demo.service.MybatisService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/mybatis")
public class MybatisController {
	
 
	@Autowired
	private MybatisService mybatisService;
	@RequestMapping("/test")  
	public String index() {
	 
		 return mybatisService.index();  

	}
	@RequestMapping("/testALL")  
	public  PageInfo<Goods> testALL() {
		PageHelper.startPage(1, 2);
		 List<Goods> selectAll = mybatisService.selectAll();
		 
		System.out.println(selectAll);
		return new PageInfo<Goods> (selectAll);  
		
	}
	@RequestMapping("/testPage")  
	public  PageInfo<Goods> indexPage() { 
		Page<Goods> findByPage = mybatisService.findByPage(1, 2);
		
		System.out.println(findByPage);
		return new PageInfo<Goods> (findByPage);  
		
	}
}
