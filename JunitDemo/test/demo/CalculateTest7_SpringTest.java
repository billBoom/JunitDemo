package demo;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculateTest7_SpringTest {

	private static ApplicationContext context = null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("/applicationContext.xml");
	}

	@Test
	public void test() {
		Date date = (Date) context.getBean("date");
		System.out.println(date);
	}

}
