import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class compoundwords {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		ArrayList<String> l =new ArrayList<>();
		while(file.hasNextLine()) {
			String[] s = file.nextLine().split(" ");
			for(String n :s ) {
				l.add(n);
			}
		}
		TreeSet<String> t= new TreeSet<>();
		for(int x=0;x<l.size();x++) {
			for(int y=0;y<l.size();y++) {
				if(x==y) {
					continue;
				}
				t.add(l.get(x)+l.get(y));
			}
		}
		for(String s : t) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) throws Exception {
		new compoundwords().run();
	}

}