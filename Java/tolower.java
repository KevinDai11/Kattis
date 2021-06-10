import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class tolower {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = f.nextInt();
		int t = f.nextInt();
		int c=0;
		while(n-->0) {
			ArrayList<String> l = new ArrayList<>();
			for(int x=0;x<t;x++) {
				l.add(f.nextLine());
			}
			boolean b= true;
			for(int x=0;x<l.size();x++) {
				for(int y=1;y<l.get(x).length();y++) {
					if(Character.isUpperCase(l.get(x).charAt(y))) {
						b=false;
						break;
					}
				}
				if(!b) {
					break;
				}
			}
			if(b) {
				c++;
			}
			
		}
		out.print(c);
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new tolower().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("tolower.dat")));
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