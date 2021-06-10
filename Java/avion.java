import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class avion {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = 5;
		ArrayList<Integer> t = new ArrayList<>();
		for (int asdf = 1; asdf <= times; asdf++) {
			if(file.nextLine().contains("FBI")) {
				t.add(asdf);
			}
		}
		if(t.size()==0) {
			System.out.println("HE GOT AWAY!");
		}else {
			for(int s : t) {
				System.out.print(s+" ");
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new avion().run();
	}

}