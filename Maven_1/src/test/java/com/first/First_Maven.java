package com.first;

import com.firstproject.org.Maven_Project.Base_class;

public class First_Maven {
public static void main(String[] args) {
	Base_class.browser("firefox");
	Base_class.get_url("https://www.youtube.com/");
	Base_class.send_keys("id", "search", "ena sona q song");
	Base_class.click("id", "search-icon-legacy");
}
}
