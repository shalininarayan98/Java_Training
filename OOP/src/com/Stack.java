package com;

public class Stack {
	//LIFO
	
	//12345|
	//push and pop 
	
	private int arr[]; //non primitive data type but haven't allocated any memory
	private int top;   // do not initialise variables here- so can create multiple 
	private int max;
	
	
	Stack(int max) {  //initialise inside the constructor 
		
		this.top=-1;
		this.max=max;
		this.arr=new int[max]; //allocates memory to the array 
		
	}
	
	public void display() {
		
		//run loop for 0 to the top- to show content of array till the top
		//top = 3
		//displays stack
		for (int i=0; i<=top;i++) {
			
			System.out.println(this.arr[i]);
		}
		
	}
	
	public void push(int element) {
		//pushes
		
		
		if(this.top==this.max-1) {
			//checks if stack is full
			System.out.println("Sorry stack is full!");
			
		}
		
		else {
			//increments then puts it on top
			this.arr[++this.top]=element;
		}		
		
	}

	
	public int pop() {
		//this.top--;
		//use that variable then decrement it, decrement too early 
		//and you won't be decrementing the right element 
		
		if(this.top==-1) {
			System.out.println("Sorry stack is empty!");
			return -1;
		}
		
		else {
			return this.arr[this.top--];
		}
	}
}

