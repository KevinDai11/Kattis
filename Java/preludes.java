import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class preludes {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<>();
		a.add("A#");
		a.add("C#");
		a.add("D#");
		a.add("F#");
		a.add("G#");
		ArrayList<String> b = new ArrayList<>();
		b.add("Bb");
		b.add("Db");
		b.add("Eb");
		b.add("Gb");
		b.add("Ab");
		int c=1;
		while(file.hasNextLine()) {
			out.print("Case "+c+++": ");
			String s[] = file.nextLine().split(" ");
			if(s[0].length()>1) {
				if(s[0].contains("#")) {
					out.println(b.get(a.indexOf(s[0]))+" "+s[1]);
				}
				else {
					out.println(a.get(b.indexOf(s[0]))+" " +s[1]);
				}
			}
			else {
				out.println("UNIQUE");
			}
			
		}
	}

	public static void main(String[] args) throws Exception {
		new preludes().run();
	}

}