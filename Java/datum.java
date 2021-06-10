import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class datum {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int d = file.nextInt();
		int m = file.nextInt();
		GregorianCalendar a = new GregorianCalendar(2009, --m, d);
		SimpleDateFormat b = new SimpleDateFormat("EEEE");
		System.out.println(b.format(a.getTime()));
		
	}

	public static void main(String[] args) throws Exception {
		new datum().run();
	}

}