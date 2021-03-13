# MycodeForRevision
// basic operations on stack total 4 class 
package Stack;

public class StackusingArray {
	private int[] data;
	private int topIndex; // this is index of the top elemnst in stack

//	public StackusingArray() { // ye constrcutor hai isme size stack ka 10 diya hai agar isko user k hand me
//								// dena hai control then we will create another constructot
//		data = new int[10]; // assume array size is 10
//		topIndex = -1; // there is no element is stack so -1
//	}

	public StackusingArray(int size) { // o(1)
		data = new int[size];
		topIndex = -1;
	}

	public int size() { // o(1)
		return topIndex + 1; // 0 se start hai
		// jaha tak top index jayega waha tak size jayega
	}

	public void push(int element) throws StackFullException { // throws stackfullexception ye hai fn declaration o(1)
		// ho check if stack is full
		if (topIndex == data.length - 1) {
			// throw and exception
			StackFullException e = new StackFullException();
			throw e; /// isko type karne k baad throws declaration dala

			// 0r use this only
			// throw new StackFullException();
		}
		data[topIndex + 1] = element;
		topIndex++; // add hone k baad badh jayega or we can write this data[++topIndex]=element

	}

	public int top() throws StackEmptyException { // o(1)
		if (topIndex == -1) {
			// throws stack empty execption warna -1 excess akrega or array index out of
			// bounf jayega -1 koi index nahi hota hai
			throw new StackEmptyException();
		}

		return data[topIndex];

	}

	public int pop() throws StackEmptyException { // o(1)
		if (topIndex == -1) {
			// throws stack empty execption warna -1 excess akrega or array index out of
			// bounf jayega -1 koi index nahi hota hai
			throw new StackEmptyException();
		}
		int temp = data[topIndex];
		topIndex--; // ye top index ko ek kam karega or agar koi push karega bhi to vo naya wala
					// elemant replace karega old ko top dlete karne ki jarurt nahi
		return temp;

	}

	public boolean isEmpty() { // o(1)
		if (topIndex == -1) {
			return true;
		} else {
			return false;
		}
		// or write this
		// return topIndex == -1;
	}
}
//////////////////////////////////////////////////////////////////

package Stack;

public class StackUse {

	public static void main(String[] args) throws StackFullException, StackEmptyException {
		StackusingArray stack = new StackusingArray(100);
		stack.push(10);
		// System.out.println(stack.pop());
		// System.out.println(stack.top());
		// System.out.println(stack.size());
		stack.pop();
		System.out.println(stack.isEmpty());
		// stack.pop();

	}

}
/////////////////////////////////////////////////////////////////////////////////////////////
package Stack;

public class StackFullException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; // just to keep track of exception

}
///////////////////////
package Stack;

public class StackEmptyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; // just to track

}
