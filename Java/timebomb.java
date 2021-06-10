import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class timebomb {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		String a = f.nextLine();
		String r= "";
		int ans = 0;
		char[][] n = new char[a.length()][5];
		for(int x=0;x<n[0].length;x++) {
			if(x!=0) {
				a=f.nextLine();
			}
			for(int z=0;z<n.length;z++) {
				n[z][x]=a.charAt(z);
			}
		}
		for(int x=0;x<n.length;x+=4) {
			r+=getN(n,x);
		}
		if(r.contains("X")) {
			out.println("BOOM!!");
		}
		else {
			ans = Integer.parseInt(r);
			if(ans%6==0) {
				out.println("BEER!!");
			}
			else {
				out.println("BOOM!!");
			}
		}
		out.flush();
	}
public static char getN(char[][] n, int m) {
	String a ="";
	String b ="";
	String c ="";
	String d="";
	String e="";
	for(int x=m;x<m+3;x++) {
		a+=n[x][0];
		b+=n[x][1];
		c+=n[x][2];
		d+=n[x][3];
		e+=n[x][4];
	}
	if (a.equals("***") &&
            b.equals("* *") &&
            c.equals("* *") &&
            d.equals("* *") &&
            e.equals("***")
            )
        return '0';
        
        // One 1
        if (a.equals("  *") &&
            b.equals("  *") &&
            c.equals("  *") &&
            d.equals("  *") &&
            e.equals("  *")
            )
        return '1';
                

        if (a.equals("***") &&
            b.equals("  *") &&
            c.equals("***") &&
            d.equals("*  ") &&
            e.equals("***")
            )
        return '2';
                

        if (a.equals("***") &&
            b.equals("  *") &&
            c.equals("***") &&
            d.equals("  *") &&
            e.equals("***")
            )
        return '3';
        

        if (a.equals("* *") &&
            b.equals("* *") &&
            c.equals("***") &&
            d.equals("  *") &&
            e.equals("  *")
            )
        return '4';
        

        if (a.equals("***") &&
            b.equals("*  ") &&
            c.equals("***") &&
            d.equals("  *") &&
            e.equals("***")
            )
        return '5';
        

        if (a.equals("***") &&
            b.equals("*  ") &&
            c.equals("***") &&
            d.equals("* *") &&
            e.equals("***")
            )
        return '6';
        
  
        if (a.equals("***") &&
            b.equals("  *") &&
            c.equals("  *") &&
            d.equals("  *") &&
            e.equals("  *")
            )
        return '7';
        
 
        if (a.equals("***") &&
            b.equals("* *") &&
            c.equals("***") &&
            d.equals("* *") &&
            e.equals("***")
            )
        return '8';
        
  
        if (a.equals("***") &&
            b.equals("* *") &&
            c.equals("***") &&
            d.equals("  *") &&
            e.equals("***")
            )
        return '9';
        
        return 'X';
}
	public static void main(String[] args) throws Exception {
		new timebomb().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("timebomb.dat")));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

}