import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class stat {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int c=1;
		while(file.hasNextLine()) {
			int n = file.nextInt();
			ArrayList<Integer> a = new ArrayList<>();
			for(int x=0;x<n;x++) {
				a.add(file.nextInt());
			}
			if(file.hasNextLine()) {
				file.nextLine();
			}
			Collections.sort(a);
			System.out.println("Case " + c+": "+a.get(0)+" " + a.get(a.size()-1)+ " " + (a.get(a.size()-1)-a.get(0)));
			c++;
		}
	}

	public static void main(String[] args) throws Exception {
		new stat().run();
	}

}