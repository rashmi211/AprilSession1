package practicetest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Class1_TestNg {
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
	}
	
	@BeforeTest
	public void test() {
		System.out.println("method under beforetest annotation of class1");
	}
	
	@BeforeClass
	public void classtag() {
		System.out.println("Run before class1 of testNg");
	}
	
	@Test
	public void method() {
		System.out.println("Default method of class1");
	}
	
	@Parameters({"i","j"})
	@Test(priority=3)
	public void method1(int a,int b) {
		System.out.println(a+b);
	}
	
	@Test(priority=2)
	public void method2() {
		System.out.println("2nd method of class1");
	}
	
	@Test(priority=1)
	public void method3() {
		System.out.println("3rd method of class1");
	}
	
	@AfterClass
	public void endclasstag() {
		System.out.println("ending at class1");
	}
	
	@AfterTest
	public void test1() {
		System.out.println("method under aftertest annotation of class1");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");
	}
	

}
