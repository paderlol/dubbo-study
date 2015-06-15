/**
 * 
 */
package com.study.dubbo.generic;

import com.alibaba.dubbo.config.annotation.Service;
import com.study.dubbo.model.Person;

/**
 * @author Lenovo
 *
 */
@Service(group="generic",version="1.0.0")
public class GenericDemoServiceImpl implements GenericDemoService {

	@Override
	public Person doSomething(Person person) {
		
		return person;
	}

}
