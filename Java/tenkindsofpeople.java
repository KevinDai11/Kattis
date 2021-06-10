import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class tenkindsofpeople {
	char[][] map;
	int row;
	int col;
	boolean b;
	int er;
	int ec;
	char t;
	boolean[][] m;
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		row = f.nextInt();
		col= f.nextInt();
		 map = new char[row][col];
		for(int x=0;x<row;x++) {
			map[x]=f.nextLine().toCharArray();
			
		}
		
		int n = f.nextInt();
		
		for(int x=0;x<n;x++) {
			b=false;
			m=new boolean[row][col];
			int sr = f.nextInt()-1;
			int sc= f.nextInt()-1;
			 er = f.nextInt()-1;
			 ec = f.nextInt()-1;
			 t = map[sr][sc];
			
			 recur(sr,sc);
			 if(t=='1') {
				 out.println(b ? "decimal" : "neither");
			 }
			 else {
				 out.println(b ? "binary" : "neither");
			 }
			 
			
		}
		out.flush();
	}
	
	public void recur(int r, int c) {
		ArrayDeque<int[]> q = new ArrayDeque<>();
		q.offer(new int[] {r,c});
		
		while(!q.isEmpty()) {
			char sdf= t;
			int[] t= q.poll();
			int ro = t[0];
			int co = t[1];
			
			if( ro<0 || ro>=row || co<0 || co>=col || map[ro][co]!=sdf || m[ro][co]) {
				
				continue;
			}
			m[ro][co]=true;
			if(ro==er && co==ec) {
				b=true;
				break;
			}
			q.offer(new int[] {ro+1,co});
			q.offer(new int[] {ro-1,co});
			q.offer(new int[] {ro,co+1});
			q.offer(new int[] {ro,co-1});
		}
	}
	
	public static void main(String[] args) throws Exception {
		new tenkindsofpeople().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			 br = new BufferedReader(new InputStreamReader(System.in)); 
			//br = new BufferedReader(new FileReader(new File("tenkindsofpeople.dat")));
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