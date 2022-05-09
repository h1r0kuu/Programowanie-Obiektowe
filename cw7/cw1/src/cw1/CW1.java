package cw1;

class S {
	
}

class T <T> {
	public T el;

	public T(T el) {
		super();
		this.el = el;
	}
}

public class CW1 {
	public static void main(String[] args) {
		S das = new S();
		T<S> t = new T<S>(das);
		System.out.println(t.el);
		
		T<Integer> t2 = new T<Integer>(5);
		System.out.println(t2.el);
		
		
		T<String> t3 = new T<String>("das");
		System.out.println(t3.el);
		
	}
}
