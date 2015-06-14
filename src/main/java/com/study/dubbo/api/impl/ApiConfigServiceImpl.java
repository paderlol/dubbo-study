/**
 * 
 */
package com.study.dubbo.api.impl;

import com.study.dubbo.api.ApiConfigService;

/**
 * Api配置Service
 * @author Lenovo
 *
 */
public class ApiConfigServiceImpl implements ApiConfigService {

	
	@Override
	public void say() {
		System.out.println("Api配置的注册的服务被调用"+this.getClass().getName());

	}

}
