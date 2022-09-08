package com.happyffeng.spring.demo;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


/**
 * TODO(用一句话描述这个类的作用)
 *
 * @Date: 2022/4/22 6:15 下午
 */

public class MyBeanTest {
	@Test
	public void testMyBean(){
		BeanFactory bf = new XmlBeanFactory( new ClassPathResource("spring-config.xml"));
		MyBean myTestBean = (MyBean) bf.getBean("myBean");
		System.out.println("测试结果: "+myTestBean.getName());

	}
}
