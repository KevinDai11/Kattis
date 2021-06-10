import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;

import java.awt.Point;

import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class cetvrta {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		Point one = new Point(file.nextInt(),file.nextInt());
		Point two = new Point(file.nextInt(),file.nextInt());
		Point three = new Point(file.nextInt(),file.nextInt());
		int x, y;
		if(one.getX()==two.getX()) {
			x=(int) three.getX();
		}
		else if(one.getX()==three.getX()){
			x=(int)two.getX();
		}
		else {
			x=(int)one.getX();
		}
		if(one.getY()==two.getY()) {
			y=(int) three.getY();
		}else if(one.getY()==three.getY()){
			y=(int) two.getY();
		}else
		{
			y=(int) one.getY();
		}
		System.out.println(x+ " " + y);
			
		
	}

	public static void main(String[] args) throws Exception {
		new cetvrta().run();
	}

}