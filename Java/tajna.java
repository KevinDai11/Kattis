import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class tajna {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		String s = f.nextLine();
		int r=1;
		for(int x=2;x<s.length();x++) {
			if(s.length()%x==0) {
				if(x<=s.length()/x) {
					r=x;
				}
			}
		}
		int c = s.length()/r;
		int t=0;
		//System.out.println(r +" " + c);
		
		String[][] n = new String[r][c];
		for(int x=0;x<c;x++) {
			for(int z=0;z<r;z++) {
				n[z][x]=s.substring(t,t+1);
				t++;
			}
		}
		//System.out.println(Arrays.deepToString(n));
		String ret ="";
		for(int x=0;x<r;x++) {
			for(int z=0;z<c;z++) {
				ret+=n[x][z];
			}
		}
		out.print(ret);
		
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new tajna().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			 br = new BufferedReader(new InputStreamReader(System.in)); 
		//	br = new BufferedReader(new FileReader(new File("tajna.dat")));
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