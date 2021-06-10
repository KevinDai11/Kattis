import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class tenkinds {
	char[][] map;
	int[][] imap;
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int row = f.nextInt();
		int col = f.nextInt();
		map=new char[row][col];
		imap = new int[row][col];
		for(int x=0;x<row;x++) {
			map[x]=f.nextLine().toCharArray();
		}
		int c =0;
		for(int x=0;x<row;x++) {
			for(int y=0;y<col;y++) {
				if(imap[x][y]==0) {
					recur(x,y,map[x][y],++c);
				}
			}
		}
		for(int[] a : imap) {
			for(int b :a) {
				System.out.print(b+ " ");
			}
			System.out.println();
		}
/*		int n=f.nextInt();
		while(n-->0) {
			int r1= f.nextInt()-1;
			int c1 =f.nextInt()-1;
			int r2=f.nextInt()-1;
			int c2=f.nextInt()-1;
			
			if(imap[r1][c1]==imap[r2][c2]) {
				out.println(map[r1][c1]=='0' ? "binary" :"decimal");
			}
			else {
				out.println("neither");
			}
			
		}*/
		out.flush();
	}

/*   public void recur(int r, int c, int a, int b) {
        if(r < 0 || c < 0 || r >= map.length || c >= map[r].length || imap[r][c] != 0 || map[r][c] != a) return;
        imap[r][c] = b;
        recur(r+1,c,a,b);
        recur(r-1,c,a,b);
        recur(r,c+1,a,b);
        recur(r,c-1,a,b);
    }*/
   
	public void recur(int r, int c, int a, int b) {
		ArrayDeque<int[]> q = new ArrayDeque<>();
		q.offer(new int[] {r,c});
		while(!q.isEmpty()) {
			int[] t = q.poll();
			int ro = t[0];
			int co=t[1];
			 if(ro < 0 || co < 0 || ro >= map.length || co >= map[r].length ) {
				 continue;
			 }
			
			 if(map[ro][co] != a ||imap[ro][co] != 0) { 
				 
				 continue;}
			 imap[ro][co]=b;
			 q.offer(new int[] {r+1,c});
			 q.offer(new int[] {r-1,c});
			 q.offer(new int[] {r,c+1});
			 q.offer(new int[] {r,c-1});
		}
	}
   
	public static void main(String[] args) throws Exception {
		new tenkinds().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			// br = new BufferedReader(new InputStreamReader(System.in)); 
			br = new BufferedReader(new FileReader(new File("tenkindsofpeople.dat")));
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