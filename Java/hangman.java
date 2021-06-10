import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class hangman {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		String[] s = f.nextLine().split("");
		TreeSet<String> a =new TreeSet<>(Arrays.asList(s));
		ArrayList<String> b = new ArrayList<>();
		b.addAll(a);
		
		String k = f.nextLine();
		int max = 0;
		for(int x=0;x<b.size();x++) {
			max = Math.max(k.indexOf(b.get(x)), max);
		}
		out.print(max-b.size()+1>=10 ? "LOSE" : "WIN");
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new hangman().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("hangman.dat")));
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