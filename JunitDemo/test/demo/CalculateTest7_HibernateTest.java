package demo;

import org.hibernate.Session;
import org.junit.Test;

public class CalculateTest7_HibernateTest {

	@Test
	public void test() {
		Session session =  HibernateSessionFactory.getSession();
		System.out.println(session);
	}

}
