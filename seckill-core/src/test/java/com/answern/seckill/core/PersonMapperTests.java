package com.answern.seckill.core;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.answern.seckill.core.demo.bin.Goods;
import com.answern.seckill.core.demo.model.PageInfo;
import com.answern.seckill.core.demo.service.MybatisService;
import com.github.pagehelper.Page;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonMapperTests {

	private Logger logger = LoggerFactory.getLogger(PersonMapperTests.class);

	@Autowired
	private MybatisService personService;

 

	@Test
	public void testFindAll() {
		 List<Goods> selectAll = personService.selectAll();

		Assert.assertNotNull(selectAll);
		logger.debug(selectAll.toString());
	}

	@Test
	public void testFindByPage() {
		Page<Goods> persons = personService.findByPage(1, 2);
		// 需要把Page包装成PageInfo对象才能序列化。该插件也默认实现了一个PageInfo
		PageInfo<Goods> pageInfo = new PageInfo<>(persons);
		
		Assert.assertNotNull(persons);
		logger.debug(pageInfo.toString());
//		logger.debug(JSON.toJSONString(pageInfo));
	}

	@Test
	public void testCacheByPage() {
		long begin = System.currentTimeMillis();
		Page<Goods> persons = personService.findByPage(1, 2);
		long ing = System.currentTimeMillis();
		personService.selectAll();
		long end = System.currentTimeMillis();
		logger.debug("第一次请求时间：" + (ing - begin) + "ms");
		logger.debug("第二次请求时间:" + (end - ing) + "ms");

		Assert.assertNotNull(persons);
		logger.debug(persons.toString());
//		logger.debug(JSON.toJSONString(persons));
	}

}