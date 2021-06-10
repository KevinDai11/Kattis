import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class falsesense {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		TreeMap<String, String> map= new TreeMap<>();
		map.put("A", ".-");
		map.put("B", "-...");
		map.put("C", "-.-.");
		map.put("D", "-..");
		map.put("E", ".");
		map.put("F", "..-.");
		map.put("G", "--.");
		map.put("H", "....");
		map.put("I", "..");
		map.put("J", ".---");
		map.put("K", "-.-");
		map.put("L", ".-..");
		map.put("M", "--");
		map.put("N", "-.");
		map.put("O", "---");
		map.put("P", ".--.");
		map.put("Q", "--.-");
		map.put("R", ".-.");
		map.put("S", "...");
		map.put("T", "-");
		map.put("U", "..-");
		map.put("V", "...-");
		map.put("W", ".--");
		map.put("X", "-..-");
		map.put("Y", "-.--");
		map.put("Z", "--..");
		map.put("_", "..--");
		map.put(",", ".-.-");
		map.put(".", "---.");
		map.put("?", "----");
		
		HashMap<String, String> r = new HashMap<>();
		for(String s : map.keySet()) {
			r.put(map.get(s), s);
		}
		
		while(file.hasNextLine()) {
			String s = file.nextLine();
			String code ="";
			String n = "";
			for(int x=0;x<s.length();x++) {
				code+=map.get(s.substring(x,x+1));
				
				n+=map.get(s.substring(x,x+1)).length();
			}
			
			StringBuilder sb = new StringBuilder();
			sb.append(n);
			sb.reverse();
			n=sb.toString();
			String ret = "";
			int c=0;
			for(int x=0;x<n.length();x++) {
				
				ret+=r.get(code.substring(c,c+Integer.parseInt(n.substring(x,x+1))));
				c+=Integer.parseInt(n.substring(x,x+1));
			}
			System.out.println(ret);
		}
	}

	public static void main(String[] args) throws Exception {
		new falsesense().run();
	}

}