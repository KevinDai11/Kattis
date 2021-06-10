import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class exam {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int right=  f.nextInt();
		String mine = f.nextLine();
		String other = f.nextLine();
		int wrong = other.length()-right;
		int max=0;
		for(int x=0;x<mine.length();x++) {
			if(mine.charAt(x)==other.charAt(x) && right>0) {
				right--;
				max++;
			}
			else if(mine.charAt(x)!=other.charAt(x) &&wrong>0){
				wrong--;
				max++;
			}
		}
		out.println(max);
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new exam().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("exam.dat")));
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