import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class fridge {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int[] list = new int[10];
		for(char c: f.nextLine().toCharArray()) {
			list[c-'0']++;
		}
		int mink=0;
		int minv=Integer.MAX_VALUE;
		for(int x=1;x<list.length;x++) {
			if(list[x]==0) {
				System.out.println(x);
				return;
			}
			if(minv>list[x]) {
				minv=list[x];
				mink=x;
			}
		}
		
		if(list[0]==0) {
			System.out.println(10);
		}
		else {
			System.out.print(mink);
			list[mink]--;
			if(list[0]<=list[mink]) {
				mink=0;
			}
			while(list[mink]>=0) {
				list[mink]--;
				System.out.print(mink);
			}
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new fridge().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("sok.dat")));
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