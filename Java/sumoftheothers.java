import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class sumoftheothers {
	public void run() throws Exception {
		//Scanner file = new Scanner(new File("sumoftheothers.dat"));	
		Scanner file = new Scanner(System.in);
		while(file.hasNextLine()) {
			String[] s = file.nextLine().split(" ");
			for(int x=0;x<s.length;x++) {
				int t = Integer.parseInt(s[x]);
				int sum=0;
				for(int z=0;z<s.length;z++) {
					if(z==x){
						continue;
					}
					sum+=Integer.parseInt(s[z]);
				}
				if(sum==t) {
				System.out.println(t);
				break;}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new sumoftheothers().run();
	}

}