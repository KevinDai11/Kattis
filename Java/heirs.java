import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class heirs {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int s = f.nextInt();
		int e = f.nextInt();
		int sum=0;
		for(int x=s;x<=e;x++) {
			ArrayList<Integer> t = new ArrayList<>();
			int m = x;
			boolean b = true;
			while(m>0) {
				int n = m%10;
				if(t.contains(n))
				{
					b=false;
					break;
				}
				t.add(n);
				m/=10;
			}
			if(b) {
			
			for(int z=0;z<t.size();z++) {
				if(t.get(z)!=0 && x%t.get(z)==0) {
					continue;
				}
				else { 
					b=false;
				}
			}
			if(b) {
				
				sum++;
			}}
		}
		out.print(sum);
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new heirs().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("heirs.dat")));
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