import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class Basketball {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		String s = f.nextLine();
		int a =0;
		int b=0;
		for(int x=0;x<s.length()-1;x+=2) {
			if(s.charAt(x)=='A') {
				a+=Integer.parseInt(s.substring(x+1,x+2));
			}
			else {
				b+=Integer.parseInt(s.substring(x+1,x+2));
			}
		}
		out.print(a>b ? "A" : "B");
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new Basketball().run();
	}

	
	
	
	
	
	
	
	
	
	
	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			 br = new BufferedReader(new InputStreamReader(System.in)); 
			//br = new BufferedReader(new FileReader(new File("Basketball.dat")));
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