package session3;

public class ChainChild extends ConstrChain {
	String name;
	int number;
	char grade;
	public ChainChild() {
		super();
		System.out.println("Child's no arg constructor");
	}
	public ChainChild(String name,int number, char grade) {
		super(name,number);
		System.out.println("Child's main constructor");
		this.grade=grade;
	}
}
