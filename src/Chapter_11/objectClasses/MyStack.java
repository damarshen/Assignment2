package Chapter_11.objectClasses;

public class MyStack extends java.util.ArrayList {
	
	private java.util.ArrayList<Object> list;
	
	public MyStack() {
		list = new java.util.ArrayList<Object>();
	}
	
	public void push(Object a) {
		list.add(0, a);
	}
	
	public Object peek() {
		return list.get(0);
	}

	public Object pop() {
		Object a = list.get(0);
		list.remove(0);
		return a;
	}
	
	public String toString() {
		return "stack: " + list.toString();
	}
}
