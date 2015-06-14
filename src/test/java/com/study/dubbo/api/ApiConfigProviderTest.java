/**
 * 
 */
package com.study.dubbo.api;

import java.io.IOException;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.study.dubbo.api.impl.ApiConfigServiceImpl;

/**
 * @author Lenovo
 *
 */
public class ApiConfigProviderTest {
	/**
	 * 注册中心方式
	 */
	private static final String ZOOKEEPER = "zookeeper";
	/**
	 * 注册中心地址
	 */
	private static final String REG_ADDR = "120.25.250.61:2181";

	public static void main(String[] args) throws IOException {
		ApiConfigService apiConfigService = new ApiConfigServiceImpl();
		// 当前应用配置
		ApplicationConfig application = new ApplicationConfig();
		application.setName("xxx");
		 
		// 连接注册中心配置
		//zookeeper://10.20.153.10:2181
		RegistryConfig registry = new RegistryConfig();
		registry.setAddress(REG_ADDR);
		registry.setProtocol(ZOOKEEPER);
		 
		// 服务提供者协议配置
		ProtocolConfig protocol = new ProtocolConfig();
		protocol.setName("dubbo"); //默认是dubbo
		 
		// 注意：ServiceConfig为重对象，内部封装了与注册中心的连接，以及开启服务端口		 
		// 服务提供者暴露服务配置
		ServiceConfig<ApiConfigService> service = new ServiceConfig<ApiConfigService>(); // 此实例很重，封装了与注册中心的连接，请自行缓存，否则可能造成内存和连接泄漏
		service.setApplication(application);
		service.setRegistry(registry); // 多个注册中心可以用setRegistries()
		service.setProtocol(protocol); // 多个协议可以用setProtocols()
		service.setInterface(ApiConfigService.class);
		service.setRef(apiConfigService);
		service.setVersion("1.0.0");
		service.setGroup("api");
		// 暴露及注册服务
		service.export();
		System.in.read();
	}
}
