import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class egypt {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		while(true) {
			int a = f.nextInt();
			int b= f.nextInt();
			int c= f.nextInt();
			
			if(a==0 && b==0 && c==0) {
				break;
			}
			ArrayList<Integer> list = new ArrayList<>();
			list.add(a);
			list.add(b);
			list.add(c);
			Collections.sort(list);
			out.println(Math.pow(list.get(0), 2)+Math.pow(list.get(1), 2)== Math.pow(list.get(2), 2) ? "right":"wrong");
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new egypt().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("egypt.dat")));
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