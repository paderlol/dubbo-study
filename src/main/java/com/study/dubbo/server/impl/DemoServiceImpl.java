/**
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: bubugao </p>
 */
package com.study.dubbo.server.impl;

import java.util.Date;

import com.study.dubbo.server.DemoService;

/** 
 * Description: TODO {一句话描述类是干什么的}<br/>
 *
 * @author zhanglong
 * @date: 2015年6月1日 下午4:07:43
 * @version 1.0
 * @since JDK 1.7
 */
public class DemoServiceImpl implements DemoService {

    /** 
     * TODO(这里用一句话描述这个方法的作用). <br/> 
     * 
     * @author zhanglong
     * @date: 2015年6月1日 下午4:07:43
     * @version 1.0
     *
     */
    @Override
    public void sayHello() {
        System.out.println("Hello World!");
    }

	@Override
	public String notifyCall(String msg) {
		System.out.println("调用notifyCall方法");
		return new Date().toString();
	}

}
