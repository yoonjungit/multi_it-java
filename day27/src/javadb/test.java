package javadb;

public class test {
	public static int add(int x, int y){
	    return x+y;
	    }

	    public static void add2(int x, int y){
	    System.out.println(x+y);
	    }

	public static void main(String[] args) {
	    System.out.println(add(2, 3)); //5  
	    add2(2, 3); //5
	}	    
}
