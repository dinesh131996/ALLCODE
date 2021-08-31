package com.first;

import org.testng.annotations.Test;

public class Priority_Test {
@Test(groups = "nno")
private void launch() {
System.out.println("launch");
}
@Test(groups = "nno")
private void login() {
	System.out.println("login");
}
@Test(groups="game")
private void searchLaptop() {
	System.out.println("laptop");
}
@Test(groups = "nno")
private void searchMobiles() {
	System.out.println("mobile");
}
@Test(groups = "game")
private void logout() {
	System.out.println("logout");
}
}
