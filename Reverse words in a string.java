import java.util.*;

class Untitled {
	public static void main(String[] args) {
		String str = "Hello World I am Human";
		
		// Using StringBuilder
		StringBuilder sb = new StringBuilder();
		int j=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				sb.insert(0,str.substring(j,i));
				j=i;
			}
		}
		sb.insert(0,str.substring(j,str.length()));
		System.out.print(sb);
		
		// Using List
		List <String> ls = new ArrayList<String>();
		int j=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				ls.add(str.substring(j,i));
				j=i;
			}
		}
		ls.add(str.substring(j,str.length()));
		System.out.print(ls.toString());
		Collections.reverse(ls);
		System.out.print(ls.toString());
		
	}
}

/*
import java.util.*;
import java.io.*;

class Untitled {
	public static void main(String[] args) {
		String str = "Hello I am Human";
		// Original: Hello I am Human
		// Expected: Human am I Hello
	
		// Using string builder
		
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				sb.insert(0,str.substring(j,i)+" ");
				j = i+1;
			} else if (i==str.length()-1) {
				sb.insert(0,str.substring(j,i+1)+" ");
			}
		}		
		System.out.print(sb.toString().trim());
		
		
		// Using two string Builders
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		char c='\0';
		for(int i =str.length()-1;i>=0;--i){
			c=str.charAt(i);
			if (c==' ') {
				sb2.append(sb1);
				sb2.append(c);
				sb1 = new StringBuilder();
			}else {
				sb1.insert(0,c);
			}
		}
		sb2.append(sb1);
		System.out.print(sb2.toString());
		
		// Using List & StringBuilder
		StringBuilder sb3 = new StringBuilder(str.length());
		List<String> ls = new ArrayList<>();
		int j=0;
		for (int i = 0; i < str.length(); ++i) {
			if(str.charAt(i)==' '){
				ls.add(str.substring(j,i));
				j = i+1;
			} else if (i==str.length()-1) {
				ls.add(str.substring(j,i+1));
			}
		}
		for (int i = ls.size()-1; i >=0; --i) {
			sb3.append(ls.get(i));
			if(i!=0)
				sb3.append(" ");
		}
		System.out.println(sb3.toString());
	}
}
