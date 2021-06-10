import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class kornislav {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int a = file.nextInt();
		int b=  file.nextInt();
		int c = file.nextInt();
		int d= file.nextInt();
	ArrayList<Integer> l = new  ArrayList<>();
	l.add(a);
	l.add(b);
	l.add(c);
	l.add(d);
	int max=  Collections.max(l);
	int min = Collections.min(l);
	l.remove(new Integer(max));
	max=Collections.max(l);
	System.out.println(max*min);
		
	}

	public static void main(String[] args) throws Exception {
		new kornislav().run();
	}

}