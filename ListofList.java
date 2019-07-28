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
		
		ArrayList<ArrayList<Integer>> lsls1 = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> lsls2 = new ArrayList<ArrayList<Integer>>();
	
		lsls1.add(ls4);
		lsls1.add(ls3);
		lsls2.add(ls2);
		lsls2.add(ls1);
		
		for (int i = 0; i < lsls1.size(); i++) {
			System.out.println(lsls1.get(i));
			System.out.println(lsls2.get(i));
		}
		
		ArrayList<ArrayList<Integer>> lsls3 = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < lsls1.size(); i++) {
			ArrayList<Integer> ls5 = new ArrayList<Integer>();
			ls5.addAll(lsls1.get(i));
			ls5.addAll(lsls2.get(i));
			lsls3.add(ls5);
		}
			
		System.out.println(lsls3);
		for (int i = 0; i < lsls3.size(); i++) {
			Collections.sort(lsls3.get(i));
		}
		System.out.println(lsls3);
	}
}