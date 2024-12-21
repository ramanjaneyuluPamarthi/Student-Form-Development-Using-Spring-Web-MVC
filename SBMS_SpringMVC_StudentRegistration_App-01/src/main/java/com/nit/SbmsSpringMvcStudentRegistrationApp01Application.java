package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SbmsSpringMvcStudentRegistrationApp01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SbmsSpringMvcStudentRegistrationApp01Application.class, args);
		/*CourseRepo bean = run.getBean(CourseRepo.class);
		List<CourseEntity> all = bean.findAll();
		all.forEach(e->System.out.println(e));*/
	}

}
