import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class closingtheloop {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = f.nextInt();
		int c=1;
		while(n-->0) {
			int a  = f.nextInt();
			ArrayList<Integer> red = new ArrayList<>();
			ArrayList<Integer> blue = new ArrayList<>();
			String[] k = f.nextLine().split(" ");
			for(int x=0;x<a;x++) {
				if(k[x].charAt(k[x].length()-1)=='R') {
					red.add(Integer.parseInt(k[x].substring(0,k[x].length()-1)));
				}
				else {
					blue.add(Integer.parseInt(k[x].substring(0,k[x].length()-1)));
				}
			}
			if(red.size()==0 || blue.size()==0) {
				out.println("Case #"+c+++": 0");
				continue;
			}
			Collections.sort(red);
			Collections.sort(blue);
			Collections.reverse(red);
			Collections.reverse(blue);
	
			int sum =0;
			if(red.size()>blue.size()) {
				for(int x=0;x<blue.size();x++) {
				
					sum+=blue.get(x)-1;
					sum+=red.get(x)-1;
				}
			}
			else {
				for(int x=0;x<red.size();x++) {
					sum+=blue.get(x)-1;
					sum+=red.get(x)-1;
					}
			}
			out.println("Case #"+c++ + ": " + sum);
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new closingtheloop().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("closingtheloop.dat")));
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