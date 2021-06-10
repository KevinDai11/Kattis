import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class acm {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int total=0;
		HashSet<String> a = new HashSet<>();
		HashMap<String,Integer> p = new HashMap<>();
		while(true) {
			int time = f.nextInt();
			if(time<0) {
				break;
			}
			String problem = f.next();
			boolean correct = f.next().equals("right");
			if(correct && !a.contains(problem)) {
				total+=time;
				a.add(problem);
			}else {
				if(p.get(problem)==null) {
					p.put(problem, 0);
				}
				p.put(problem,p.get(problem)+1);
			}
		}
		
		for(String s : p.keySet()) {
			if(a.contains(s))
			total+=20*p.get(s);
		}
		out.print(a.size()+" "+total);
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new acm().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			 br = new BufferedReader(new InputStreamReader(System.in)); 
			//br = new BufferedReader(new FileReader(new File("acm.dat")));
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