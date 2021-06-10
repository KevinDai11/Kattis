import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class prozor {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int r= f.nextInt();
		int c = f.nextInt();
		int k = f.nextInt();
		
		
		char[][] map = new char[r][c];
		
		for(int x=0;x<r;x++) {
			map[x]=f.nextLine().toCharArray();
		}
		int rc=0;
		int cc=0;
		int num =0;
		for(int x=0;x<r-k+1;x++) {
			for(int y=0;y<c-k+1;y++) {
				int total =0;
				for(int z=x+1;z<x+k-1;z++) {
					for(int v=y+1;v<y+k-1;v++) {
						if(map[z][v]=='*') {
							total++;
						}
					}
				}
				if(num<total) {
					num=total;
					rc=x;
					cc=y;
				}
			}
		}
		map[rc][cc]='+';
		map[rc+k-1][cc]='+';
		map[rc][cc+k-1]='+';
		map[rc-1+k][cc+k-1]='+';
		for (int x = cc + 1; x < cc + k - 1; x++) {
			map[rc][x] = '-';
		}
		for (int x = rc + 1; x < rc + k - 1; x++) {
			map[x][cc] = '|';
		}
		for (int x = cc + 1; x < cc + k - 1; x++) {
			map[rc + k - 1][x] = '-';
		}
		for (int x = rc + 1; x < rc + k - 1; x++) {
			map[x][cc + k - 1] = '|';
		}
		out.println(num);
		for(char[] a : map) {
			for(char b :a) {
				out.print(b);
			}
			out.println();
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new prozor().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			 br = new BufferedReader(new InputStreamReader(System.in)); 
			//br = new BufferedReader(new FileReader(new File("prozor.dat")));
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