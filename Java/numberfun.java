import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class numberfun {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			double a = file.nextInt();
			double b=file.nextInt();
			double c=file.nextInt();
			
			int add=0;
			int sub=0;
			int mul=0;
			int di=0;
			int asd =0;
			if(a+b==c) {
				add++;
				asd++;
			}
			if(a-b==c || b-a==c) {
				sub++;
				asd++;
			}
			if(a*b==c) {
				mul++;
				asd++;
			}
			if(a/b==c || b/a==c) {
				di++;
				asd++;
			}
			
			System.out.println(asd==1 && add> 0 || sub >0 || mul>0 || di>0 ? "Possible" : "Impossible");
		}
	}

	public static void main(String[] args) throws Exception {
		new numberfun().run();
	}

}