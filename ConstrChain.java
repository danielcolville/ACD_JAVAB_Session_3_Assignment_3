package session3;

public class ConstrChain {
	String name;
	int number;
	
	ConstrChain() {
		this("",0);
		System.out.println("Super class no-arg");
		
	}
	ConstrChain(String name,int number) {
		this.name=name;
		this.number=number;
		System.out.println("Super class two arg constructor");
	}
	public static void main(String[] args) {
		ConstrChain ch= new ConstrChain();
		ConstrChain ch2=new ChainChild();
		ConstrChain ch3=new ChainChild("John",5,'A');
	}
}

