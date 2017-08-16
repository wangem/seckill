package com.answern.seckill.core.redis;

import java.awt.PageAttributes.MediaType;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.answern.seckill.core.demo.controller.RedisCacheController;
 

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration  
public class TestRedis {

	private MockMvc mvc;
	
	@Before
	public void setUp() {
		mvc = MockMvcBuilders.standaloneSetup(new RedisCacheController()).build();

	}
 
    @Test
    public void main() throws Exception {
        System.out.println("test 看看能不能用啊 ");
    }
    
//    @Test
//    public void redisCacheControllerTest (){
//    	try {
//			mvc.perform(MockMvcRequestBuilders.get("/redis/test"));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//    }
 
}