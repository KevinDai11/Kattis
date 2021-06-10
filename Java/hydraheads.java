import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class hydraheads {
	int min;
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		while(true) {
			int h = f.nextInt();
			int t = f.nextInt();
			if(h==0 && t==0) {
				break;
			}
			min=Integer.MAX_VALUE;
			
			recur(h,t,0);
			out.println(min);
		}
		out.flush();
	}
	public void recur(int h , int t, int s) {
		ArrayDeque<int[]> q = new ArrayDeque<>();
		q.offer(new int[] {h,t,s});
		while(!q.isEmpty()) {
			int[] a= q.poll();
			int head = a[0];
			int tail = a[1];
			
			int step = a[2];
			if(head ==0 && tail==0) {
				if(min>step) {
					min=step;
				}
			}
			if(head==1 && tail==0) {
				continue;
			}
			step+=1;
			if(tail>=2) {
				tail-=2;
				head+=1;
				q.offer(new int[] {head,tail,step});
			}
			if(head>=2) {
				head-=2;
				q.offer(new int[] {head,tail,step});
			}
			if(tail>=1) {
				tail-=1;
				tail+=2;
				q.offer(new int[] {head,tail,step});
			}
		}
	
	}
	public static void main(String[] args) throws Exception {
		new hydraheads().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("hydraheads.dat")));
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