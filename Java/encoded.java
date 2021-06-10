import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class encoded {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			String s = file.nextLine();
			int l=(int) Math.sqrt(s.length());
	
		
			char[] i[] = new char[l][l];
			int t =0;
			for(int x=0;x<i.length;x++) {
				for(int y=0;y<i[x].length;y++) {
					i[x][y]=s.charAt(t++);
					
				}
			}
			
		
			for(int x=i.length-1;x>=0;x--) {
				for(int y=0;y<i.length;y++) {
					System.out.print(i[y][x]);
				}
			}
			System.out.println();
		}	
	}

	public static void main(String[] args) throws Exception {
		new encoded().run();
	}

}