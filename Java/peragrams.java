import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class peragrams {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		ArrayList<String> checked = new ArrayList<String>();
		String str = f.next();

		for (int i = 0; i < str.length(); i++)
			{
			if (checked.contains(str.substring(i , i + 1)))
				checked.remove(checked.indexOf(str.substring(i , i + 1)));
			else
				checked.add(str.substring(i , i + 1));
			}

		if (checked.size() == 0)
			System.out.println("0");
		else
		    System.out.println(checked.size() - 1);
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new peragrams().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("peragrams.dat")));
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