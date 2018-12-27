package com.sunlight001.test;

import com.sunlight001.annotation.Service;

@Service
public class TestServiceImpl implements TestService {

	@Override
	public void printParam(String param) {
        System.out.println("接收到的参数为： "+param);
	}

}
