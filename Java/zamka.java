import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class zamka {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int l = file.nextInt();
		file.nextLine();
		int d = file.nextInt();
		file.nextLine();
		int x = file.nextInt();
		
		
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int asdf = l; asdf <= d; asdf++) {
			if(chop(asdf)==x) {
				a.add(asdf);
			}
		}
		System.out.println(a.get(0));
		System.out.println(a.get(a.size()-1));
	}

	
	
	public int chop(int kev){
		int sum = 0;
		while(kev>0) {
			sum +=kev%10;
			kev/=10;
		}
		return sum;
		
		
		
	}
	public static void main(String[] args) throws Exception {
		new zamka().run();
	}

}