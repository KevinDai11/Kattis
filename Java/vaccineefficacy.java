import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class vaccineefficacy {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = f.nextInt();
		double ac, bc,cc, av,bv,cv;
		int c=0;
		int v=0;
		ac=bc=cc=av=bv=cv=0;
		while(n-->0) {
			String s = f.nextLine();
			if(check(s.charAt(0))) {
				if(check(s.charAt(1))){
					av++;
				}
				if(check(s.charAt(2))) {
					bv++;
				}
				if(check(s.charAt(3))) {
					cv++;
				}
				v++;
			}
			else {
				if(check(s.charAt(1))){
					ac++;
				}
				if(check(s.charAt(2))) {
					bc++;
				}
				if(check(s.charAt(3))) {
					cc++;
				}
				c++;
			}
		}
		ac/=c;
		bc/=c;
		cc/=c;
		av/=v;
		bv/=v;
		cv/=v;
		if(av>=ac) {
			out.println("Not Effective");
		}
		else {
			out.printf("%.6f%n",100*(ac-av)/ac );
		}
		if(bv>=bc) {
			out.println("Not Effective");
		}
		else {
			out.printf("%.6f%n",100*(bc-bv)/bc );
		}
		if(cv>=cc) {
			out.println("Not Effective");
		}
		else {
			out.printf("%.6f%n",100*(cc-cv)/cc );
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new vaccineefficacy().run();
	}
	public static boolean check(char c) {
		return c=='Y';
	}
	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("sok.dat")));
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