package demo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.BlockJUnit4ClassRunner;



public class CalculateTest3_fullProcess {
	
	/*
	 * 1.@BeforeClassde修饰的方法会在所有方法被调用前被执行，
	 * 而且该方法是静态的，所以当测试类被加载后接着就会运行它，
	 * 而且在内存中它只会存在一份实例，它比较适合加载配置文件。
	 * 一个测试类中只能一个@BeforeClass修饰的方法。
	 * 2.@AfterClass所修饰的方法通常用来对资源的清理，如关闭数据库的连接。
	 * 一个测试类中可以有多个@AfterClass修饰的方法。
	 * 3.@Before和@After会在每个测试方法的前后各执行一次
	 */

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("this is @BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("this is @AfterClass");
	}
	
	@AfterClass
	public static void tearDownAfterClass2() throws Exception {
		System.out.println("this is @AfterClass2");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("this is @Before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("this is @After");
	}

	@Test
	public void testAdd() {
		System.out.println("this is @Test:testAdd");
	}

	@Test
	public void testSubtract() {
		System.out.println("this is @Test:testSubtract");
	}

}
