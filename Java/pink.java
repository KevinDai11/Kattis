import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class pink {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();
		int count=0;
		for (int asdf = 0; asdf < times; asdf++) {
			String s = file.nextLine().toLowerCase();
			if(s.contains("pink") || s.contains("rose")) {
				count++;
			}
		}
		System.out.println(count==0? "I must watch Star Wars with my daughter" : count);
		
	}

	public static void main(String[] args) throws Exception {
		new pink().run();
	}

}