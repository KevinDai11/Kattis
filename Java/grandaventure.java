import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class grandaventure {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n =f.nextInt();
		while(n-->0) {
			String[] s = f.nextLine().split("");
			
			Stack<String> l = new Stack<>();
			boolean b = true;
			for(int x=0;x<s.length;x++) {
				if(s[x].equals(".")) {
					continue;
				}
				if(s[x].equals("$")||s[x].equals("|")||s[x].equals("*")) {
					l.push(s[x]);
				}
				if(l.size()<1) {
					b=false;
					break;
				}
				if(s[x].equals("t")) {
					String temp = l.pop();
					if(temp.equals("|")) {
						continue;
					}
					else {
						b=false;
					}
				}		
				if(s[x].equals("b")) {
					String temp = l.pop();
					if(temp.equals("$")) {
						continue;
					}
					else {
						b=false;
					}
				}
				if(s[x].equals("j")) {
					String temp = l.pop();
					if(temp.equals("*")) {
						continue;
					}
					else {
						b=false;
					}
				}
			}
			if(l.size()>0) {
				b=false;
			}
			out.println(b?"YES":"NO");
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new grandaventure().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("grandaventure.dat")));
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