import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class patuljci {

	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = 9;
		ArrayList<Integer> al = new ArrayList<>();
		int sum=0;
		for(int x=0;x<9;x++) {
			al.add(f.nextInt());
			sum+=al.get(x);
		}
		int r = sum-100;
		int one =0;
		int two =0;
		for(int x=0;x<8;x++) {
			for(int z=x+1;z<al.size();z++) {
				if(al.get(x)+al.get(z)==r) {
					al.remove(z);
					al.remove(x);
					
				}
			}
		}
		for(int x=0;x<al.size();x++) {
			out.println(al.get(x));
		}
		
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new patuljci().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("patuljci.dat")));
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