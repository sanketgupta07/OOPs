/**
 * 
 */
package com.nestedclass;

/**
 * @author Sanket Gupta
 *
 */

/**
* Outer Class
*/

class OuterClass{
	
	int out = 10;
	
	private void showMsgOuter(){
		System.out.println("This from Outer Class - Non static");
	}
	
	private static void staticOuter(){
		System.out.println("This from Outer Class - static method");
	}
	
	class InnerClass{
		int in = 15;
		
		public void innerMsg (){
			System.out.println("This is from Inner Class: out+ in="+(out+in));
			showMsgOuter();
			staticOuter();			
		}
	}
}

public class InnerClassDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.innerMsg();
	}

}
