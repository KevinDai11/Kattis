import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class peanutes {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		while(true) {
			int n = f.nextInt();
			if(n==0) {
				break;
			}
			box[] b = new box[n];
			for(int x=0;x<n;x++) {
				b[x]=new box(f.nextLine().split(" "));
			}
			int p = f.nextInt();
			while(p-->0) {
				double x = f.nextDouble();
				double y =f.nextDouble();
				String size = f.next();
				boolean s = false;
				for(box a : b) {
					if(a.inside(x, y)) {
						out.print(size+" ");
						out.println(size.equals(a.size)?"correct":a.size);
						s=true;
						break;
					}
				}
				if(!s) {
					out.println(size +" floor" );
				}
			}
			out.println();
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new peanutes().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("peanutes.dat")));
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
class box{
	double x1,y1,x2,y2;
	String size;
	public box(String[] t) {
		x1=Double.parseDouble(t[0]);
		y1=Double.parseDouble(t[1]);
		x2=Double.parseDouble(t[2]);
		y2=Double.parseDouble(t[3]);
		size=t[4];
	}
	public boolean inside(double x, double y) {
		return x>=x1 && x<=x2 && y>=y1 && y<=y2;
	}
}