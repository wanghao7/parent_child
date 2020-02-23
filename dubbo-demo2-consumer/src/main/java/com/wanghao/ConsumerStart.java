package com.wanghao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wanghao.service.CounterService;

public class ConsumerStart {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContent.xml");
		CounterService bean = context.getBean(CounterService.class);//获取接口类对象 从盒子里拿出来
		int i = 1;
		int j = 3;
		int add = bean.add(1, 3);
		System.err.print(add);
	}
}
