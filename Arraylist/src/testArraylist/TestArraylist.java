package testArraylist;

import java.util.ArrayList;

public class TestArraylist {

	public static void main(String[] args) {
		// ArrayList non typ�e
//		test1();
		// ArrayList typ�e String
//		test2();
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add("lol");
		
		System.out.println(al.get(1));
		al.remove(1);
		System.out.println(al.get(1));
	}

	// ArrayList non typ�e
	static void test1(){
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add("lol");
		for(Object x:al)
			System.out.println(x);
		System.out.println(al.get(1));
	}
	
	// ArrayList typ�e String
	static void test2(){
		ArrayList<String> al = new ArrayList<String>();
		al.add("ititi");
		al.add("loulouu");
		al.add("lol");
		for(String s:al)
			System.out.println(s);
	}
	

}
