import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class symmetricorder {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int c=0;
		while(true) {
			int n = file.nextInt();
			if(n==0) {
				break;
			}
			System.out.println("SET "+ ++c);
			file.nextLine();
			ArrayList<String> list = new ArrayList<>();
			while(n-->0) {
				list.add(file.nextLine());
			}
			
			for(int x=0;x<list.size();x++) {
				System.out.println(list.remove(x));
			}
			Collections.reverse(list);
			for(String x: list) {
				System.out.println(x);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new symmetricorder().run();
	}

}