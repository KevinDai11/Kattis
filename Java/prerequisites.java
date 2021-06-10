import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class prerequisites {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		while(true) {
			int k =f.nextInt();
			if(k==0) {
				break;
			}
			
			int m =f.nextInt();
			
			ArrayList<Integer> courses = new ArrayList<>();
			while(k-->0) {
				courses.add(f.nextInt());
			}
		
			boolean b = true;
			while(m-->0) {
				int c = f.nextInt();
				int r = f.nextInt();
				int t =0;
				
				while(c-->0) {
					int temp = f.nextInt();
					if(courses.contains(temp)) {
						t++;
					}
				}
				if(r>t) {
					b=false;
				}

			}
	
			out.println(b?"yes":"no");
			
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new prerequisites().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("prerequisites.dat")));
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