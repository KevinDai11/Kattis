import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;



import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class warehouse {
	@SuppressWarnings("unchecked")
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = f.nextInt();
		while(n-->0) {
			int t = f.nextInt();
			ArrayList<point> p = new ArrayList<>();
			TreeMap<String, Integer> map = new TreeMap<>();
			while(t-->0) {
				String s = f.next();
				int i = f.nextInt();
				if(map.get(s)==null) {
					map.put(s, 0);
				}
				map.put(s, map.get(s)+i);
			}
			for(String s : map.keySet()) {
				p.add(new point(s,map.get(s)));
			}
			Collections.sort(p);
			out.println(p.size());
			for(point s: p) {
				out.println(s);
			}
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new warehouse().run();
	}
	class point implements Comparable{
		String name;
		int number;
		
		public point(String s, int i) {
			name=s;
			number=i;
		}

		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			point other = (point) o;
			if(this.number!=other.number) {
				return other.number-number;
			}
			return name.compareTo(other.name);
		}
		public String toString(){
			return name +" " + number;
		}
		
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