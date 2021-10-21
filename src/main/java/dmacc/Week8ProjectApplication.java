package dmacc;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.controller.BeanConfiguration;
import dmacc.repository.PersonRepository;
import dmacc.beans.Job;
import dmacc.beans.Person;


@SpringBootApplication
public class Week8ProjectApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Week8ProjectApplication.class, args);
		
		/*
		 * ApplicationContext appContext = new
		 * AnnotationConfigApplicationContext(BeanConfiguration.class);
		 * 
		 * Person p = appContext.getBean("person", Person.class);
		 * 
		 * System.out.println(p.toString());
		 */
	}
	@Autowired
	PersonRepository repo;
	
	public void run(String...args) throws Exception{
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Person c = appContext.getBean("person", Person.class);
		c.setName("Bob");
		repo.save(c);

		Person d = new Person("Andrew", 18, "Single");
		Job a = new Job("987 Elm Court", "Altoona", "IA");
		d.setJob(a);
		repo.save(d);
		
		List<Person> allMyPeople = repo.findAll();
		for(Person people: allMyPeople) {
			System.out.println(people.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}
}
