import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class t9spelling {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		HashMap<String,String> m = new HashMap<>();
		m.put("a","2");
		m.put("b", "22");
		m.put("c", "222");
		m.put("d", "3");
		m.put("e", "33");
		m.put("f", "333");
		m.put("g", "4");
		m.put("h", "44");
		m.put("i", "444");
		m.put("j", "5");
		m.put("k", "55");
		m.put("l", "555");
		m.put("m", "6");
		m.put("n", "66");
		m.put("o", "666");
		m.put("p", "7");
		m.put("q", "77");
		m.put("r", "777");
		m.put("s", "7777");
		m.put("t", "8");
		m.put("u", "88");
		m.put("v", "888");
		m.put("w", "9");
		m.put("x", "99");
		m.put("y", "999");
		m.put("z", "9999");
		m.put(" ", "0");
		int n = f.nextInt();
		for(int x=1;x<=n;x++) {
			String s ="";
			String t = f.nextLine();
			for(int c=0;c<t.length();c++) {
				String v = m.get(t.substring(c,c+1));
				if(s.length()>0 && v.contains(s.substring(s.length()-1))) {
					s+=" ";
				}
				s+=v;
			}
			out.println("Case #" + x +": " +s);
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new t9spelling().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("t9spelling.dat")));
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