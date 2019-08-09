package session3;

public class ConstrChain {
	String name;
	int number;
	
	ConstrChain() {
		this("",0);
		System.out.println("Superclass no arg constructor");
	}
	ConstrChain(String name,int number) {
		System.out.println("Two argument superclass constructor");
		this.name=name;
		this.number=number;
	}
	public static void main(String[] args) {
		ConstrChain ch=new ConstrChain();
		ChainChild CC=new ChainChild();
	}
}
