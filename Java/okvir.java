import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class okvir {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int m = f.nextInt();
		int n = f.nextInt();
		int u = f.nextInt();int l=f.nextInt(); int r=f.nextInt();int d=f.nextInt();
		char[][] c = new char[m][n];
		for(int x=0;x<m;x++) {
		c[x]=f.nextLine().toCharArray();
		}
		int t = 0;
		char[][] ret = new char[m+u+d][n+l+r];
		for(int x=0;x<u;x++) {
			for(int y=0;y<ret[x].length;y++) {
				if(t++%2==0) {
					ret[x][y]='#';
				}
				else {
					ret[x][y]='.';
				}
			}
			if(ret[x].length%2==0) {
				t++;}
			
		}
		int row =0;
		int col=0;
		for(int x=u;x<ret.length-d;x++) {
			for(int y=0;y<ret[x].length;y++) {
				if(y<l || y>=ret[x].length-r) {
					if(t++%2==0) {
						ret[x][y]='#';
					}
					else {
						ret[x][y]='.';
					}
				}
				else {
					
					ret[x][y]=c[row][col++];
				}
			}
			if(ret[x].length%2==0) {
			t++;}
			col=0;
			row++;
		}
		for(int x=u+m;x<ret.length;x++) {
			for(int y=0;y<ret[x].length;y++) {
				if(t++%2==0) {
					ret[x][y]='#';
				}
				else {
					ret[x][y]='.';
				}
			}
			t++;
		}
		for(char[] a : ret) {
			out.println(Arrays.toString(a).replaceAll("[\\[\\], ]", ""));
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new okvir().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("okvir.dat")));
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

