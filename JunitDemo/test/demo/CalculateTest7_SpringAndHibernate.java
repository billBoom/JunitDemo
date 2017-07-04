package demo;

import static org.junit.Assert.*;

import org.hibernate.impl.SessionFactoryImpl;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculateTest7_SpringAndHibernate {

	private static ApplicationContext context;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void test() {
		SessionFactoryImpl bean =  (SessionFactoryImpl) context.getBean("sessionFactory");
		System.out.println(bean);
	}

}
