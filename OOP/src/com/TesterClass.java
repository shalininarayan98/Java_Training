package com;

public class TesterClass {
	
	public static void main(String[] args) {
		
		Stack s1= new Stack(9);
		
		s1.push(5);
		s1.push(10);
		s1.push(15);
		s1.display();
		s1.pop();
		s1.display();
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
	}

}
