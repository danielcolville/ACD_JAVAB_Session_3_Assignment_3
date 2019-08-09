package session3;

public class ChainChild extends ConstrChain {
	String name;
	int number;
	char grade;
	public ChainChild() {
		super();
	}
	public ChainChild(String name,int number, char grade) {
		super(name,number);
		this.grade=grade;
	}
}
