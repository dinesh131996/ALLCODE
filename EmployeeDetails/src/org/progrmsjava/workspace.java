package org.progrmsjava;

public class workspace {
public workspace() {
System.out.println("dinesh");
}
public workspace(int a){
	System.out.println(a);
}
public static void main(String[] args) {
	
}	
	
}
class name extends workspace {
	public name(int a) {
		//super(10);
System.out.println("name"+a);
	}
	
}
class king{
	public king() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		workspace s = new name(10);
		
	}
}