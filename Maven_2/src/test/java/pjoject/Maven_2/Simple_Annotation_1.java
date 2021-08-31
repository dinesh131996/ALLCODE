package pjoject.Maven_2;

import org.testng.annotations.*;

public class Simple_Annotation_1 {
@BeforeSuite
private void setup() {
	
System.out.println("setup");
}

@BeforeTest
private void url() {
	
System.out.println("url");
}
@BeforeClass
private void login() {
	
	System.out.println("login");
}
@BeforeMethod
private void homepage() {
	
	System.out.println("homepage");
}
@Test
private void searchlaptop() {
	
	System.out.println("search laptop");
}
@Test(enabled = false)
private void searchMobile() {
	
	System.out.println("search mobile");
}
@AfterMethod
private void bookthelap() {
	
	System.out.println("booked the lap");
}
@AfterClass
private void logout() {
	
	System.out.println("logout");
}
@AfterTest
private void closethebrowser() {
	
	System.out.println("close the browser");
}
@AfterSuite
private void deletecookies() {
	
	System.out.println("delcookies");
}
}
