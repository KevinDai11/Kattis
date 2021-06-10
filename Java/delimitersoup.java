import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class delimitersoup {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = f.nextInt();
		Stack<String> s = new Stack<>();
		String l = f.nextLine();
		boolean b = true;
		for(int x=0;x<n;x++) {
			if(l.charAt(x)==' ') {
				continue;
			}
			if(l.charAt(x)=='(' || l.charAt(x)=='[' ||l.charAt(x)=='{') {
				s.push(l.substring(x,x+1));
			}
			else {
				if(s.size()==0) {
					out.print(l.charAt(x)+" "+x);
					b=false;
					break;
				}
				if(l.charAt(x)==')') {
					if(s.pop().equals("(")) {
						continue;
					}
					else {
						out.print(") "+x);
						b=false;
						break;
					}
				}
				if(l.charAt(x)==']') {
					if(s.pop().equals("[")) {
						continue;
					}
					else {
						out.print("] "+x);
						b=false;
						break;
					}
				}
				if(l.charAt(x)=='}') {
					if(s.pop().equals("{")) {
						continue;
					}
					else {
						out.print("} "+x);
						b=false;
						break;
					}
				}
			}
		}
		out.println(b? "ok so far":"");
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new delimitersoup().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("delimitersoup.dat")));
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