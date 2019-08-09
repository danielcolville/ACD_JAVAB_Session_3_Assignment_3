package session3;

public class ChainChild extends ConstrChain {
	char grade;
	public ChainChild() {
		super();
		System.out.println("Super class no-arg constructor");
	}
	public ChainChild(String name,int number, char grade) {
		super(name,number);
		this.grade=grade;
		System.out.println("Sub-class three argument constructor");
	}
}

