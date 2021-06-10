import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class prva {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		int r = f.nextInt();
		int c = f.nextInt();
		String s = "";
		String[] row= new String[r];
		for(int x=0;x<r;x++) {
			row[x]=f.nextLine();
			for(String n : row[x].split("#")) {
				if(n.length()>1 && (s.equals("") || n.compareTo(s)<0)) {
					s=n;
				}
			}
		}
		char[] v = new char[r];
		for(int x=0;x<c;x++) {
			for(int y=0;y<r;y++) {
				v[y]=row[y].charAt(x);
			}
			for(String n : new String(v).split("#")) {
				if(n.length()>1 && (s.equals("") || n.compareTo(s)<0)) {
					s=n;
				}
			}
		}
		out.print(s);
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new prva().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			 br = new BufferedReader(new InputStreamReader(System.in)); 
			//br = new BufferedReader(new FileReader(new File("prva.dat")));
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