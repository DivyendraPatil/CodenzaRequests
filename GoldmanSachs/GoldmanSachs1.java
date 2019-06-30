import java.io.*;
import java.util.*;
class Untitled {
	public static void main(String[] args) {
		String s = "10.0.0.2 - nancy [10/Dec/2000:12:34:58 -0500] \"GET /c.gif HTTP/1.0\" 200 234";
		String ip = s.split(" ")[0];
		System.out.println(ip);
	}
}

/*
int won't divide in floating divinding by 2.0 will give right
5/2 = 2


5/2.0 = 2.5

typecast

space is ignored between them

how do i test?

i will validate and sanitize inputs

i can code in start of method for all inputs to my parameters
should i write
not from document but word1 and word2
should we allow? it is question whether we need to allow user to do that? is it requirement of method to do that

i will they are not null or empty

the words are not empty has some alpha


"10.0.0.1 - frank [10/Dec/2000:12:34:56 -0500] \"GET /a.gif HTTP/1.0\" 200 234",
	"10.0.0.2 - frank [10/Dec/2000:12:34:57 -0500] \"GET /b.gif HTTP/1.0\" 200 234",
	"10.0.0.2 - nancy [10/Dec/2000:12:34:58 -0500] \"GET /c.gif HTTP/1.0\" 200 234",
	"",
	" - frank [10/Dec/2000:12:34:56 -0500] \"GET /a.gif HTTP/1.0\" 200 234",
	"10.0.0.2"
	
	'
	String s = "10.0.0.2 - nancy [10/Dec/2000:12:34:58 -0500] \"GET /c.gif HTTP/1.0\" 200 234";
	
	//StringBuilder str = new StringBuilder();
	String ip = s.split(" ")[0];
	
	
	
	
	*/
	
	