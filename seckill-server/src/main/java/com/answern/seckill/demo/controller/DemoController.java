package com.answern.seckill.demo.controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class DemoController {

	@RequestMapping
	public String hello() {
		return "Hello seckill Server";
	}
}
