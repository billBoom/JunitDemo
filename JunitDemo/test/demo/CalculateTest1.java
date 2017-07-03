package demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculateTest1 {
	
	/*
	 * 1.测试用例不是用来证明你是对的，而是用来证明你没有错
	 * 2.测试用例用来达到想要的预期结果，但对于逻辑错误无能为力
	 */
	
	/*
	 * 1.测试方法上必须使用@Test进行修饰
	 * 2.测试方法必须使用public void 进行修饰，并且不能带任何的参数
	 * 3.新建一个源代码目录来存放我们的测试代码
	 * 4.测试类的包应该和被测试类保持一致
	 * 5.测试单元中的每个方法必须可以独立测试，测试方法间不能有任何的依赖
	 * 6.测试类使用Test作为类名的后缀（规范，非必须）
	 * 7.测试方法使用test作为方法名的前缀（规范，非必须）
	 */

	@Test
	public void testAdd() {
		assertEquals(100, new Calculate().add(0, 100));
	}

}
