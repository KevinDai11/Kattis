import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class cudoviste {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int r = file.nextInt();
		int c= file.nextInt();
		file.nextLine();
		char[][] a  = new char[r][c];
		for(int x=0;x<r;x++) {
			a[x]=file.nextLine().toCharArray();
		}
		int z= 0;
		int o = 0;
		int t =0;
		int e =0;
		int f=0;
		for(int x=0;x<r-1;x++) {
			for(int y=0;y<c-1;y++) {
				if(a[x][y]=='#' || a[x+1][y]=='#' || a[x][y+1]=='#' || a[x+1][y+1]=='#') {
					continue;
				}
				int s = 0;
				if(a[x][y]=='X') {
					s++;
				}
				if(a[x+1][y]=='X') {
					s++;
				}
				if(a[x][y+1]=='X') {
					s++;
				}
				if(a[x+1][y+1]=='X') {
					s++;
				}
				if(s==0) {
					z++;
				}else if(s==1) {
					o++;
				}else if(s==2) {
					t++;
				}
				else if(s==3) {
					e++;
				}else {
					f++;
				}
			}
		}
		System.out.println(z);
		System.out.println(o);
		System.out.println(t);
		System.out.println(e);
		System.out.println(f); 
	}

	public static void main(String[] args) throws Exception {
		new cudoviste().run();
	}

}