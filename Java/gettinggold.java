import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class gettinggold {
	char[][] map;
	int gold;
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int col = f.nextInt();
		int row = f.nextInt();
		map = new char[row][col];
		int sr = 0;
		int sc =0;
		gold =0;
		for(int x=0;x<row;x++) {
			String s = f.nextLine();
			for(int y=0;y<col;y++) {
				map[x][y]=s.charAt(y);
				if(s.charAt(y)=='P') {
					sr=x;
					sc=y;
				}
			}
		}
		
		recur(sr,sc);
		out.println(gold);
		out.flush();
	}
	public void recur(int r, int c) {
		ArrayDeque<int[]> a = new ArrayDeque<>();
		a.offer(new int[] {r,c});
		while(!a.isEmpty()) {
			int[] t= a.poll();
			int ro = t[0];
			int co = t[1];
			
			if(ro<0 ||co <0 || ro>=map.length || co>=map[ro].length || map[ro][co]=='#' || map[ro][co]=='T') {
				continue;
			}
			if(map[ro][co]=='G') {
				gold++;
			}
			map[ro][co]='#';
			a.offer(new int[] {ro+1,co});
			a.offer(new int[] {ro-1,co});
			a.offer(new int[] {ro,co+1});
			a.offer(new int[] {ro,co-1});
		}
	}
	public static void main(String[] args) throws Exception {
		new gettinggold().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			// br = new BufferedReader(new InputStreamReader(System.in)); 
			br = new BufferedReader(new FileReader(new File("gettinggold.dat")));
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