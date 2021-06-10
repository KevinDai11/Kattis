import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class drm {
	public void run() throws Exception {
		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		String t= f.next();
		String r = t.substring(0,t.length()/2);
		String c = t.substring(t.length()/2);
		String code = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int val= 0;
		int val2=0;
		for(int x=0;x<r.length();x++) {
			val+=code.indexOf(r.charAt(x));
			val2+=code.indexOf(c.charAt(x));
		}
		String nr="";
		String nc="";
		
		for(int x=0;x<r.length();x++) {
			int v = code.indexOf(r.charAt(x))+val;
			if(v>25) {
				v%=26;
				if(v<0) {
					v+=26;
				}
			}
			nr+=code.charAt(v);
			v = code.indexOf(c.charAt(x))+val2;
			
			if(v>25) {
				v%=26;;
				if(v<0) {
					v+=26;;
				}
			}
			nc+=code.charAt(v);
		}
		String ret = "";
		for(int x=0;x<nr.length();x++) {
			int v= code.indexOf(nr.charAt(x)) + code.indexOf(nc.charAt(x));
			if(v>25) {
				v%=26;
				if(v<0) {
					v+=26;;
				}
			}
			ret+=code.charAt(v);
		}
		out.print(ret);
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new drm().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			 br = new BufferedReader(new InputStreamReader(System.in)); 
			//br = new BufferedReader(new FileReader(new File("drm.dat")));
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