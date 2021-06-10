import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class spavanac {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int hour = file.nextInt();
		int min = file.nextInt();
		min-=45;
		if(min<0) {
			hour--;
			min=60+min;
		}
		if(hour<0) {
			hour=23;
		}
		System.out.println(hour +" " + min);
	}

	public static void main(String[] args) throws Exception {
		new spavanac().run();
	}

}