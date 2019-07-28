import java.util.*;

class ListofList {
	public static void main(String[] args) {
		
		ArrayList<Integer> ls1 = new ArrayList<Integer>();
		ls1.add(1);
		ls1.add(2);
		ls1.add(3);
		ls1.add(4);
		ArrayList<Integer> ls2 = new ArrayList<Integer>();
		ls2.add(5);
		ls2.add(6);
		ls2.add(7);
		ls2.add(8);
		ArrayList<Integer> ls3 = new ArrayList<Integer>();
		ls3.add(9);
		ls3.add(10);
		ls3.add(11);
		ls3.add(12);
		ArrayList<Integer> ls4 = new ArrayList<Integer>();
		ls4.add(13);
		ls4.add(14);
		ls4.add(15);
		ls4.add(16);
		
		ArrayList<ArrayList<Integer>> lsls = new ArrayList<ArrayList<Integer>>();
		
		lsls.add(ls1);
		lsls.add(ls2);
		lsls.add(ls3);
		lsls.add(ls4);
		
		for (int i = 0; i < lsls.size(); i++) {
			System.out.println(lsls.get(i));
		}
		
	}
}