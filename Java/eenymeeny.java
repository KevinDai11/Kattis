import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class eenymeeny {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int s = f.nextLine().split(" ").length-1;
		int n = f.nextInt();
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> team1 = new ArrayList<>();
		ArrayList<String> team2 = new ArrayList<>();
		int t= n;
		while(t-->0) {
			list.add(f.nextLine());
		}
		
		int c=n;
		int spot =0;		
		for(int x=0;x<n;x++) {
			int i = (s+spot)%c;
			if(x%2==0) {
				team1.add(list.remove(i));
			}
			else {
				team2.add(list.remove(i));
			}
			c-=1;
			spot = i;
		}
		out.println(team1.size());
		for(String b : team1) {
			out.println(b);
		}
		out.println(team2.size());
		for(String b :team2) {
			out.println(b);
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new eenymeeny().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("eenymeeny.dat")));
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