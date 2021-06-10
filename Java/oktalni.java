import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class oktalni {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		String s = f.nextLine();
		int n = 3 - (s.length()%3);
		if(n==1) {
			s="0"+s;
		}
		if(n==2) {
			s="00"+s;
		}
		String r= "";
		String[] oktals = new String[]{"000", "001", "010", "011", "100", "101", "110", "111"};
		for(int x=0;x<s.length();x+=3) {
			String t=s.substring(x,x+3);
			for(int y=0;y<8;y++) {
				if(t.equals(oktals[y])) {
					r+=""+y;
					break;
				}
			}
		}
		out.print(r);
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new oktalni().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("oktalni.dat")));
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