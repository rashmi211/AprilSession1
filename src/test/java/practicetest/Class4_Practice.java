package practicetest;

import org.testng.annotations.Test;

public class Class4_Practice {
	
	@Test
	public void test1() {
		System.out.println("Hi " +Thread.currentThread().getId());
	}
	
	@Test
	public void test2() {
		System.out.println("Hi 1 " +Thread.currentThread().getId());
	}
	
	@Test
	public void test3() {
		System.out.println("Hi 2 "+Thread.currentThread().getId());
	}
	
	@Test
	public void test4() {
		System.out.println("Hi 3 "+Thread.currentThread().getId());
	}
	
	@Test
	public void test5() {
		System.out.println("Hi 4 "+Thread.currentThread().getId());
	}

	
}
