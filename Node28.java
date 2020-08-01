package A;

public class Node28 <T, E> {

	private T info;
	private E info1;
	
	public void setInfo(T info, E info1) {
		this.info = info;
		this.info1 = info1;
	}

	public T getinfo() {
		return info;	
	}

	public E getinfo1() {
		return info1;	
	}


	public String toString() {
		return "info = " + info + " , info1 = " + info1;
	}
}