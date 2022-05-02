package com.happyffeng.spring.demo;

/**
 * TODO(用一句话描述这个类的作用)
 *
 * @author ffeng
 * @Date: 2022/4/22 6:13 下午
 */

public class MyBean {
	private String name = "Adom";

	public MyBean(String name) {
		this.name = name;
	}

	public MyBean() {
	}

	@Override
	public String toString() {
		return "MyBean{" +
				"name='" + name + '\'' +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
