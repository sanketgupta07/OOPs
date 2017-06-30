/**
 * 
 */
package com.nestedclass;

/**
 * @author Sanket Gupta
 *
 */

class Outer{
	
	int out = 10;
	
	private void showMsgOuter(){
		System.out.println("This from Outer Class - Non static");
	}
	
	private static void staticOuter(){
		System.out.println("This from Outer Class - static method");
	}
	
	/**
	 * Static nested Class: it can access only static member and methods of the ouer class. 
	 * It is like another class just used by outer class.
	 * @author Sanket Gupta
	 *
	 */
	static class StaticNestedClass{
		int in = 15;
		
		public void innerMsg (){
//			out is not accessible.
//			System.out.println("This is from Inner Class: out+ in="+(out+in));
//			showMsgOuter() is not accessible
//			showMsgOuter();
			System.out.println("This is from Inner Class: in="+in);
			staticOuter();			
		}
	}
}

public class NestedStaticClassDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Outer.StaticNestedClass nestedObj = new Outer.StaticNestedClass();
		nestedObj.innerMsg();

	}

}
