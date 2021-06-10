import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class zanzibar {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			ArrayList<Integer> a = new ArrayList<>();
			while(true) {
				int n =file.nextInt();
				if(n==0) {
					break;				}
				a.add(n);
			}
			int sum=0;
			for(int x=1;x<a.size();x++) {
				if(a.get(x)>a.get(x-1)*2) {
					sum+=a.get(x)-a.get(x-1)*2;
				}
			}
			System.out.println(sum);
		}
	}

	public static void main(String[] args) throws Exception {
		new zanzibar().run();
	}

}