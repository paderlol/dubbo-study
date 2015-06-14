/**
 * 
 */
package com.study.dubbo.annotation.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.study.dubbo.annotation.FooService;

/**
 * 注解配置dubbo服务端接口
 * @author Lenovo
 *
 */
@Service(group="foo",version="1.0")
public class FooServiceImpl implements FooService {

	/**
	 * 服务接口实现
	 */
	@Override
	public void say() {
		System.out.println("注解实现服务");

	}

}
