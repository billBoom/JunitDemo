package demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class CalculateTest4_Anotation extends Calculate {
	
	/*
	 * @Test:将一个普通方法修饰成一个测试方法
	 * 		@Test(expected=XX.class)
	 * 		@Test(timeout=毫秒)
	 * @BeforeClass：它在所有的方法运行前被执行，static修饰
	 * @AfterClass:它在所有的方法运行后被执行，static修饰
	 * @Before：会在每一个测试方法被运行前执行一次
	 * @After：会在每一个测试方法被运行后执行一次
	 * @Ignore：所修饰的测试方法会被测试运行容器忽略
	 * @Runwith：可以更改测试运行器 org.junit.runner.Runner；例：@RunWith(SpringJUnit4ClassRunner.class)  ，用Spring测试执行类测试spring
	 */
	
	@Test(expected=ArithmeticException.class)//表示预期结果将是一个算数错误
	public void testDivide() {
		assertEquals(0, new Calculate().divide(0, 0));
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	

}
