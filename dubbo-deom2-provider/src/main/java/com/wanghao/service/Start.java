package com.wanghao.service;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:ApplicationContent.xml");
		context.start();
		System.in.read();//需要处于阻塞状态
	}
}
