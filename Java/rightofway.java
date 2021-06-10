import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class rightofway {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		String car = f.next();
		String path = f.next();
		String other = f.next();
		
		if(car.equals("South")) {
			if(path.equals("West")&&(other.equals("North")||other.equals("East"))) {
				System.out.println("Yes");
				return;
			}
			if(path.equals("North") && other.equals("East")) {
				System.out.println("Yes");
				return;
			}
			else {
				System.out.println("No");
				return;
			}
		}
		if(car.equals("North")) {
			if(path.equals("East")&&(other.equals("South")||other.equals("West"))) {
				System.out.println("Yes");
				return;
			}
			if(path.equals("South") && other.equals("West")) {
				System.out.println("Yes");
				return;
			}
			else {
				System.out.println("No");
				return;
			}
		}
		if(car.equals("East")) {
			if(path.equals("South")&&(other.equals("North")||other.equals("West"))) {
				System.out.println("Yes");
				return;
			}
			if(path.equals("West") && other.equals("North")) {
				System.out.println("Yes");
				return;
			}
			else {
				System.out.println("No");
				return;
			}
		}
		if(car.equals("West")) {
			if(path.equals("North")&&(other.equals("South")||other.equals("East"))) {
				System.out.println("Yes");
				return;
			}
			if(path.equals("East") && other.equals("South")) {
				System.out.println("Yes");
				return;
			}
			else {
				System.out.println("No");
				return;
			}
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new rightofway().run();
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