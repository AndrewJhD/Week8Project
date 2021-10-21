package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Job;
import dmacc.beans.Person;

public class BeanConfiguration {
	@Bean
	public Person contact() {
		Person bean = new Person();
		bean.setAge(18);
		bean.setName("Bob");
		bean.setRelationship("single");
		return bean;
	}
	@Bean
	public Job job() {
	Job bean = new Job("123 Main Street", "DesMoines", "IA");
	return bean;
	}
}
