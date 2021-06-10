import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class everywhere {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		for(int h=0;h<times;h++) {
	int a = file.nextInt();
	file.nextLine();
	HashSet<String> b= new HashSet<>();
	for(int x=0;x<a;x++) {
		b.add(file.nextLine());
	}
	System.out.println(b.size());
}
	}

	public static void main(String[] args) throws Exception {
		new everywhere().run();
	}

}