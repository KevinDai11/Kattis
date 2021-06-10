import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class goatrope {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		double x= file.nextInt();
		double y = file.nextInt();
		int x1 = file.nextInt();
		int y1= file.nextInt();
		int x2=file.nextInt();
		int y2=file.nextInt();
		
		if(y>=y1 && y<=y2) {
			System.out.println( Math.min(Math.abs(x-x1), Math.abs(x-x2)) );
		}
		else if ( x>=x1 &&x<=x2) {
			System.out.println( Math.min(Math.abs(y-y1), Math.abs(y-y2)) );
		}
		else {
			System.out.println(Math.sqrt(Math.pow(Math.min(Math.abs(y-y1), Math.abs(y-y2)), 2)+Math.pow(Math.min(Math.abs(x-x1), Math.abs(x-x2)), 2)));
		}
	}

	public static void main(String[] args) throws Exception {
		new goatrope().run();
	}

}