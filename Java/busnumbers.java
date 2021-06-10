import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class busnumbers {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n =f.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		for(int x=0;x<n;x++) {
			a.add(f.nextInt());
		}
		Collections.sort(a);
		String s =""+a.get(0);
		for(int x=1;x<a.size();x++) {
			if(a.get(x)==a.get(x-1)+1) {
				if(x<a.size()-1 && a.get(x+1)==a.get(x)+1) {
					s+="-";
					x+=2;
					while(x<a.size()&&a.get(x)==a.get(x-1)+1) {
						x++;
					}
					x--;
					s+=a.get(x);
				}else {
					s+=" " +a.get(x);
				}
			}else {
				s+=" " +a.get(x);
			}
			
		}
		out.print(s);
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new busnumbers().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("busnumbers.dat")));
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