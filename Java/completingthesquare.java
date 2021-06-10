import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class completingthesquare {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		point a = new point(f.nextInt(),f.nextInt());
		point b = new point(f.nextInt(), f.nextInt());
		point c = new point(f.nextInt(),f.nextInt());
		int x=0;
		int y=0;
		
		double d1= Math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
		double d2= Math.sqrt((c.x-b.x)*(c.x-b.x)+(c.y-b.y)*(c.y-b.y));
		double d3 = Math.sqrt((a.x-c.x)*(a.x-c.x)+(a.y-c.y)*(a.y-c.y));
		double m = Math.max(Math.max(d2,d1),d3);
		point center;
		point ans = null;
		
		if(m==d2) {
			center=midp(c,b);
			ans=getn(a,center);
		}
		if(m==d3) {
			center=midp(a,c);
			
			ans=getn(b,center);
		}	
		if(m==d1) {
			center=midp(a,b);
			ans = getn(c,center);
		}
		out.printf("%.0f %.0f",ans.x,ans.y);
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new completingthesquare().run();
	}
	public point midp(point a, point b) {
		point t = new point((a.x+b.x)/2,(a.y+b.y)/2);
	
		return t;
	}
	public point getn(point a, point c) {
		double x = c.x-a.x;
		double y= c.y-a.y;
		point t=  new point(c.x+x,c.y+y);
		return t;
	}
	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("completingthesquare.dat")));
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
class point{
	double x, y;
	public point(double d, double e) {
		this.x=d;
		this.y=e;
	}
	}