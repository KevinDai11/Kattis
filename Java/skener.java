import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class skener {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int r = file.nextInt();
		int c=  file.nextInt();
		int zr= file.nextInt();
		int zc = file.nextInt();
		file.nextLine();
		char[][] a = new char[r][c];
		char[][] n = new char[r*zr][c*zc];
		for(int x=0;x<r;x++) {
			a[x]=file.nextLine().toCharArray();
		}
		
		int ra = 0;
		int ca = 0;
		int cc=0;
		int cr=0;
		for(int x=0;x<n.length;x++) {
			for(int y=0;y<n[x].length;y++) {
				n[x][y]=a[ra][ca];
				cc++;
				if(cc%zc==0) {
					ca++;
					if(ca>=a[ra].length) {
						ca=0;
					}
					cc=0;
				}
			}
		cr++;	
		if(cr%zr==0) {
				
				ra++;
			if(ra>=a.length) {
				ra=0;
			}
			cr=0;
			}
		}
		for(char[] asd:n) {
			System.out.println(Arrays.toString(asd).replaceAll("[\\[\\], ]", ""));
		}
	}

	public static void main(String[] args) throws Exception {
		new skener().run();
	}

}