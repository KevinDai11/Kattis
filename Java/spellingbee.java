import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class spellingbee {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		String[] h = f.nextLine().split("");
		ArrayList<String> s = new ArrayList<>();
		Collections.addAll(s, h);
	//	System.out.println(s);
		int n = f.nextInt();
		while(n-->0) {
			String temp = f.nextLine();
			ArrayList<String> t= new ArrayList<>();
			
			boolean a = true;
			for(int x=0;x<temp.length();x++) {
				if(!s.contains(temp.substring(x,x+1))) {
					a=false;
					break;
				}
				/*else {
					t.add(temp.substring(x,x+1));
					s.remove(temp.substring(x,x+1));
				}*/
			}
			//s.addAll(t);
			
			if(a&& temp.length()>3 && temp.contains(h[0])) {
				System.out.println(temp);
			}
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new spellingbee().run();
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