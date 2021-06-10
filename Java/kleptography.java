import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class kleptography {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		String k = "abcdefghijklmnopqrstuvwxyz";
		int n = file.nextInt();
		int m = file.nextInt();
		file.nextLine();
		String plain = file.nextLine();
		String coded = file.nextLine();
		String[] final1 = new String[m];
		int y=0;
		for(int x=m-n;x<m;x++) {
			final1[x]=plain.substring(y,y+1);
			y++;
		}
		
		for(int x=m-n-1;x>=0;x--) {
			int t = k.indexOf(coded.substring(x+n,x+n+1));
			int o = k.indexOf(final1[x+n]);
			int temp = t-o;
			
			if(temp<0) {
				temp+=26;
			}
			
			final1[x]=k.substring(temp,temp+1);
		}
		
		for(int x=0;x<final1.length;x++) {
			System.out.print(final1[x]+"");
		}
		
		
	}

	public static void main(String[] args) throws Exception {
		new kleptography().run();
	}

}