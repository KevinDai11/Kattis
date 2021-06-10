import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class mjehuric {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int[] list = new int[5];
		for(int x=0;x<5;x++) {
			list[x]=f.nextInt();
		}
		while(!isSorted(list)) {
		for(int x=1;x<5;x++) {
			if(list[x]<list[x-1]) {
				int t = list[x];
				list[x]=list[x-1];
				list[x-1]=t;out.println(Arrays.toString(list).replaceAll("[\\[\\],]",""));
			}
			
		}
		
		}
		
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new mjehuric().run();
	}
	public boolean isSorted(int[] l) {
		return l[0]==1 && l[1]==2 && l[2]==3 && l[3]==4 && l[4]==5;
	}
	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			 br = new BufferedReader(new InputStreamReader(System.in)); 
			//br = new BufferedReader(new FileReader(new File("mjehuric.dat")));
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