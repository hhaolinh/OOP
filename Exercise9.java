package uk.ac.cam.hh645.OOP;
 

public class Exercise9{
	public static void main(String[] args) {
		
	}
}

class Stack{
	private int maxsize;
	private int top;
	private int[] stack;

	public Stack(int maxsize){
		this.maxsize = maxsize;
		this.top = 0;
		this.stack = new int[maxsize];
	}
	public void show(){
		for(int i = 0; i < top; i++){
			System.out.print(this.stack[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
	public void push(int val){
		if (this.top >= this.maxsize){
			System.out.println("stack full");
		}else{
			this.stack[this.top] = val;
			this.top += 1;
		}
	}
	public int pop(){
		if (this.top <= 0){
			System.out.println("stack empty");
			return -1;
		}else{
			this.top -= 1;
			return this.stack[this.top];
		}
	}
	public int length(){
		return this.top;
	}
}
