import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class jabuke {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int x1=f.nextInt();
		int y1=f.nextInt();
		int x2=f.nextInt();
		int y2=f.nextInt();
		int x3=f.nextInt();
		int y3=f.nextInt();
		
		out.printf("%.1f%n", area(x1,y1,x2,y2,x3,y3));
		int t = f.nextInt();
		int in = 0;
		while(t-->0) {
			int x = f.nextInt();
			int y=f.nextInt();
			if(Math.abs(area(x1,y1,x2,y2,x3,y3)-area(x1,y1,x2,y2,x,y)-area(x1,y1,x3,y3,x,y)-area(x3,y3,x2,y2,x,y))<.1) {
				in++;
			}
		}
		out.print(in);
		
		
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new jabuke().run();
	}
	public static double area(double x1,double y1,double x2,double y2,double x3,double y3) {
		return Math.abs(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2;
	}
	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("jabuke.dat")));
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