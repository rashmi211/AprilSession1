package practicetest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class2_TestNg2 {
		

		@BeforeTest
		public void test2() {
			System.out.println("method under before test annotation of class2");
		}
		
		@BeforeClass
		public void classtag() {
			System.out.println("Run before class2 of testNg");
		}
		
		@Test(priority=1)
		public void method() {
			System.out.println("Default method of class2");
		}
		
		@Parameters({"i","j"})
		@Test(priority=2)
		public void method1(int k,int l) {
			System.out.println("1st method of class2 multiply "+(k*l));
		}
		
		@DataProvider(parallel=true)
		public Object[][] data() {
			Object ob[][]=new Object[][] {{1,"rashi"},{2,"shruti"},{3,"moni"}};
			return ob;
		}
		
		@Test(dataProvider="data",priority=3)
		public void method2(int a,String name) {
			System.out.println("Roll number "+a+" name is "+name);
		}
		
		@Test(priority=4)
		public void method3() {
			System.out.println("3rd method of class2");
		}
		
		@AfterClass
		public void endclasstag() {
			System.out.println("ending at class2");
		}
		
		@AfterTest
		public void test3() {
			System.out.println("method under after test annotation of class2");
		}
	}

