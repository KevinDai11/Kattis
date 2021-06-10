import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class boudningrobots {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		while(true) {
			int x=f.nextInt();
			int y= f.nextInt();
			if(x==0 && y==0) {
				break;
			}
			int rx =0;
			int ry=0;
			int ax = 0;
			int ay  =0;
			int n = f.nextInt();
			while(n-->0) {
				String s[] = f.nextLine().split(" ");
			
				if(s[0].equals("u")) {
					ry+=Integer.parseInt(s[1]);
					ay+=Integer.parseInt(s[1]);
					if(ay>=y) {
						ay=y-1;
					}
				}
				else if(s[0].equals("d")) {
					ry-=Integer.parseInt(s[1]);
					ay-=Integer.parseInt(s[1]);
					if(ay<0) {
						ay=0;
					}
				}
				else if(s[0].equals("r")) {
					rx+=Integer.parseInt(s[1]);
					ax+=Integer.parseInt(s[1]);
					if(ax>=x) {
						ax=x-1;
					}
				}
				else if(s[0].equals("l")){
					rx-=Integer.parseInt(s[1]);
					ax-=Integer.parseInt(s[1]);
					if(ax<0) {
						ax=0;
					}
				}
			}
			out.println("Robot thinks "+rx + " " +ry);
			out.println("Actually at " +ax+" "+ay+"\n");
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new boudningrobots().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("boudningrobots.dat")));
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