import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class speedlimit {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		while(file.hasNextLine()) {
			int times = file.nextInt();
			if(times==-1) {
				break;
			}
			file.nextLine();
			ArrayList<Integer> mph = new ArrayList<>();
			ArrayList<Integer> time = new ArrayList<>();
			for(int x=0;x<times;x++) {
				mph.add(file.nextInt());
				time.add(file.nextInt());
	file.nextLine();
			}
			int sum =0;
			for(int x=0;x<mph.size();x++) {
				if(x==0) {
					sum+=mph.get(x)*time.get(x);
				}
				else {
					sum+=mph.get(x)*(time.get(x)-time.get(x-1));
				}
			}
			System.out.println(sum +" miles");
		}
	}

	public static void main(String[] args) throws Exception {
		new speedlimit().run();
	}

}