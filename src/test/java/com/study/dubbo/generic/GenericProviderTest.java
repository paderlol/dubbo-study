/**
 * 
 */
package com.study.dubbo.generic;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Lenovo
 *
 */
public class GenericProviderTest {

	
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"/provider-generic.xml"});
        context.start();
        
        System.in.read(); // 按任意键退出
	}
}
