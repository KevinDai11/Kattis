import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class MIA {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		while(true) {
			int r=f.nextInt();
			int r2=f.nextInt();
			int s=f.nextInt();
			int s2=f.nextInt();
			if(r==0) {
				break;
			}
			int[] p1 = {r,r2};
			int p2[] = {s,s2};
			Arrays.sort(p1);
			Arrays.sort(p2);
			if(Arrays.equals(p1, p2)) {
				out.println("Tie.");
			}else{
				int val1 = Integer.parseInt(p1[1] + "" + p1[0]);
				int val2 = Integer.parseInt(p2[1] + "" + p2[0]);
				int win = val1 > val2 ? 1 : 2;
				
				if (val1 == 21 || val2 == 21)
					win = val1 == 21 ? 1 : 2;
				
				else if (p1[0] == p1[1] && p2[0] == p2[1])
					win = val1 > val2 ? 1 : 2;
					
				else if (p1[0] == p1[1])
					win = 1;
				
				else if (p2[0] == p2[1])
					win = 2;
					
				
				out.println("Player " + win + " wins.");
				}	
			}
		
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new MIA().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("MIA.dat")));
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