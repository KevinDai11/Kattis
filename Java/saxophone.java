import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class saxophone {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n = f.nextInt();
		TreeMap<Character, String> tm = new TreeMap<>();
		tm.put('c', "2347890");
		tm.put('d', "234789");
		tm.put('e',"23478");
		tm.put('f', "2347");
		tm.put('g', "234");
		tm.put('a', "23");
		tm.put('b', "2");
		tm.put('C', "3");
		tm.put('D',"1234789");
		tm.put('E',"123478");
		tm.put('F',"12347");
		tm.put('G',"1234");
		tm.put('A',"123");
		tm.put('B',"12");
		while(n-->0) {
			String s = f.nextLine();
			int[] r = new int[10];
			String last = "";
			for(int x=0;x<s.length();x++) {
				String t = tm.get(s.charAt(x));
				for(int z =0;z<t.length();z++) {
					if(!last.contains(t.substring(z,z+1))) {
						if(t.charAt(z)!='0') {
						r[Integer.parseInt(t.substring(z,z+1))-1]++;}
						else {
							r[9]++;
						}
					}
					
				}
				last = t;
			}
		
			out.println(Arrays.toString(r).replaceAll("[\\[\\],]", ""));
		
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new saxophone().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("saxophone.dat")));
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