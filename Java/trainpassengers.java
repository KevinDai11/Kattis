import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class trainpassengers {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int c= f.nextInt();
		int n =f.nextInt();
		
		int on=0;
		boolean b=true;
		while(n-->0) {
			int getoff =f.nextInt();
			int geton=f.nextInt();
			int station= f.nextInt();	
			
			if(getoff>on)
			{
				b=false;
				break;
			}
			on+=geton-getoff;
			if((on!=c&&station>0)||(on>c)||(on<0)||(n==0&&station>0)) {
				b=false;
				break;
			}
		}
		if(on>0) {
			b=false;
		}
		out.print(b?"possible":"impossible");
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new trainpassengers().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("trainpassengers.dat")));
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