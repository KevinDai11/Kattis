import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class phonelist {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int times = f.nextInt();
		while(times-->0) {
			ArrayList<String> a = new ArrayList<>();
			int n = f.nextInt();boolean b = true;
			while(n-->0) {
				String s = f.nextLine();
				if(s.length()<=10)
				for(int x=0;x<a.size();x++) {
					if(a.get(x).indexOf(s)>-1 || s.indexOf(a.get(x))>-1) {
						b=false;
						break;
					}
				}
				if(!b) {
					break;
				}
				a.add(s);
			}
			

			out.println(b ? "YES" : "NO");
		}
		
		
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new phonelist().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			 br = new BufferedReader(new InputStreamReader(System.in)); 
			//sbr = new BufferedReader(new FileReader(new File("phonelist.dat")));
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