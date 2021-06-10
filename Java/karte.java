import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class karte {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		ArrayList<Integer> P = new ArrayList<>();
		ArrayList<Integer> K = new ArrayList<>();
		ArrayList<Integer> H = new ArrayList<>();
		ArrayList<Integer> T = new ArrayList<>();
		String s = f.nextLine();
		for(int x=0;x<s.length()-1;x+=3) {
			String suit = ""+s.charAt(x);
			int d = Integer.parseInt(s.substring(x+1,x+3));
			if(suit.equals("P")) {
				if(P.contains(d)) {
					System.out.println("GRESKA");
					return;
				}
				P.add(d);
			}
			if(suit.equals("K")) {
				if(K.contains(d)) {
					System.out.println("GRESKA");
					return;
				}
				K.add(d);
			}
			if(suit.equals("H")) {
				if(H.contains(d)) {
					System.out.println("GRESKA");
					return;
				}
				H.add(d);
			}
			if(suit.equals("T")) {
				if(T.contains(d)) {
					System.out.println("GRESKA");
					return;
				}
				T.add(d);
			}
			
		}
		out.print(13-P.size()+" " +(13-K.size()) +" " +(13-H.size())+ " " + (13-T.size()));
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new karte().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("karte.dat")));
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