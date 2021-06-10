import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class shoppinglist {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = f.nextInt();
		int words = f.nextInt();
		ArrayList<String> list = new ArrayList<>();
		//System.out.println(n);
		
		String[] s = f.nextLine().split(" ");
		for(String t:s) {
			list.add(t);
		}
		n--;
		//System.out.println(n);
		while(n-->0) {
			
			s = f.nextLine().split(" ");
			ArrayList<String> temp = new ArrayList<>();
			for(String t:s) {
				if(list.contains(t)) {
					temp.add(t);
				}
			}
			
			list=temp;
		}
		Collections.sort(list);
		out.println(list.size());
	
		for(String t : list) {
			out.println(t);
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new shoppinglist().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("radiocommercial.dat")));
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