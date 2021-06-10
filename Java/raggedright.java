import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class raggedright {
	public void run() throws Exception {
		//Scanner file = new Scanner(new File("raggedright.dat"));	
		Scanner file = new Scanner(System.in);
		String t=  "";
		ArrayList<String> l = new ArrayList<>();
		while(file.hasNextLine()) {
			String k = file.nextLine();
	
			l.add(k);
			t=k.length()>t.length() ? k : t;	
		}
		int s =0;

		for(int x=0;x<l.size()-1;x++) {
			
			if(l.get(x).equals(t)) {
				continue;
			}
			s+=Math.pow(t.length()-l.get(x).length(),2);
			
		}
		System.out.print(s);
		file.close();
	}

	public static void main(String[] args) throws Exception {
		new raggedright().run();
	}

}