import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class recipes {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int times = f.nextInt();
		for(int asdf =1;asdf<=times;asdf++) {
			int n = f.nextInt();
			int r =f.nextInt();
			double d =f.nextInt();
			double factor = d/r;
			LinkedHashMap<String, Double> hm = new LinkedHashMap<>();
			String main = "";
			double t =0;
			while(n-->0) {
				String[] s = f.nextLine().split(" ");
				double  hg =  Double.parseDouble(s[2]);
				if(hg==100) {
					main=s[0];
					t=Double.parseDouble(s[1]);
				}
				hm.put(s[0], hg);
			}
			LinkedHashMap<String, Double> h = new LinkedHashMap<>();
			double m=t*factor;
			for(String s : hm.keySet()) {
				if(s.equals(main)) {
					h.put(s,m);
				}
				else {
					h.put(s,(hm.get(s)*m)/100);
				}
			}
			out.println("Recipe # "+asdf);
			for(String s : h.keySet()) {
				out.printf("%s %.1f%n",s,h.get(s));
			}
			for(int x=0;x<40;x++) {
				out.print("-");
			}
			out.println();
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new recipes().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("recipes.dat")));
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