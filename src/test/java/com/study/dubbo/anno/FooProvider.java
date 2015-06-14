/**
 * 
 */
package com.study.dubbo.anno;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Lenovo
 *
 */
public class FooProvider {

	public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"/provider-anno.xml"});
        context.start();
        
        System.in.read(); // 按任意键退出
    }
}
