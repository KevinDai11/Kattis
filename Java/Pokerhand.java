import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class Pokerhand {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		String[] s = file.nextLine().split(" ");
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		for(String a : s) {
			if(m.get(a.substring(0,1))==null) {
				m.put(a.substring(0,1), 0);
			}
			m.put(a.substring(0,1), m.get(a.substring(0,1))+1);
		}
		int max=0;
		for(String a : m.keySet()) {
			max=Math.max(max, m.get(a));
		}
		System.out.println(max);
	}

	public static void main(String[] args) throws Exception {
		new Pokerhand().run();
	}

}