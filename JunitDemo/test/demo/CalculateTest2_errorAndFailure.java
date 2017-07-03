package demo;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CalculateTest2_errorAndFailure extends Calculate {
	
	/*
	 * 1.failure一般由单元测试使用的断言方法判断失误所引起的，即程序输出的结果和我们的预期结果不一致，这表示测试点出现了问题
	 * 2.error是由代码的异常引起的，它可以产生于测试代码本身的错误，也可以是被测试代码中的一个隐藏的bug
	 * 3.测试用例不是用来证明你是对的，而是用来证明你没有错
	 */
	
	@Test
	public void testDivide() {
		assertEquals(0, new Calculate().divide(0, 0));
	}
	
	@Test
	public void testDivide2() {
		assertEquals(1, new Calculate().divide(0, 1));
	}

}
