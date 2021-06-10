import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class game2048 {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int[][] m = new int[4][4];
		for(int x=0;x<4;x++) {
			for(int z=0;z<4;z++) {
				m[x][z]=f.nextInt();
			}
		}
		
		int move = f.nextInt();
		if(move==0) {
			for(int x=0;x<4;x++) {
				for(int y=1;y<4;y++) {
					if(m[x][y]==m[x][y-1]) {
						m[x][y-1]=m[x][y]*2;
						
					}
				}
			}
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new game2048().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("game2048.dat")));
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