import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class skener2 {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int r = f.nextInt();
		int c=  f.nextInt();
		int zr= f.nextInt();
		int zc = f.nextInt();
		
		char[][] a = new char[r][c];
		char[][] n = new char[r*zr][c*zc];
		for(int x=0;x<r;x++) {
			a[x]=f.nextLine().toCharArray();
		}
		
		int ra = 0;
		int ca = 0;
		int cc=0;
		int cr=0;
		for(int x=0;x<n.length;x++) {
			for(int y=0;y<n[x].length;y++) {
				n[x][y]=a[ra][ca];
				cc++;
				if(cc%zc==0) {
					ca++;
					if(ca>=a[ra].length) {
						ca=0;
					}
					cc=0;
				}
			}
		cr++;	
		if(cr%zr==0) {
				
				ra++;
			if(ra>=a.length) {
				ra=0;
			}
			cr=0;
			}
		}
		for(char[] asd:n) {
			out.println(Arrays.toString(asd).replaceAll("[\\[\\], ]", ""));
		}
	
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new skener2().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("skener2.dat")));
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