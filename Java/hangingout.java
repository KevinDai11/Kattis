import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class hangingout {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int max = file.nextInt();
		int times = file.nextInt();
		file.nextLine();
		int count=0;
		int current=0;
		for (int asdf = 0; asdf < times; asdf++) {
			if(file.next().equals("enter")) {
				int p = file.nextInt();
				if(p+current>max) {
					count++;
				}else {
					current+=p;
				}
			}
			else {
				current-=file.nextInt();
				
			}if(file.hasNextLine())
			file.nextLine();
		}
		System.out.println(count);
	}

	public static void main(String[] args) throws Exception {
		new hangingout().run();
	}

}