import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class peg {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		char[][] m = new char[7][7];
		for(int x=0;x<7;x++) {
			m[x]=f.nextLine().toCharArray();
		}
		int c=0;
		for(int x=0;x<7;x++) {
			for(int z=0;z<7;z++) {
				if(m[x][z]=='.') {
			        if(check(m, x+2, z) && check(m, x+1, z)) {
	                    c++;
	                }
	                if(check(m, x-2, z) && check(m, x-1, z)) {
	                    c++;
	                }
	                if(check(m, x, z+2) && check(m, x, z+1)) {
	                    c++;
	                }
	                if(check(m, x, z-2) && check(m, x, z-1)) {
	                    c++;
	                }
				}
			}
		}
		out.print(c);
		out.flush();
	}
public boolean check(char[][] m, int x,int z) {
	if(x<0 || z< 0 || x>=7 || z>=7) {
		return false;
	}
	return m[x][z]=='o';
}
	public static void main(String[] args) throws Exception {
		new peg().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("peg.dat")));
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