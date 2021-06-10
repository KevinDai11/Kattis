import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class quickfox {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int times = f.nextInt();
		for(int x=0;x<times;x++) {
			ArrayList<String> abc =new ArrayList<>();
			String s = f.nextLine();
			for(int y=0;y<s.length();y++) {
				if(Character.isAlphabetic(s.charAt(y))&&!abc.contains(s.substring(y,y+1).toLowerCase())) {
					abc.add(s.substring(y,y+1).toLowerCase());
				}
			}
			if(abc.size()==26) {
				out.println("pangram");
				continue;
			}
			Collections.sort(abc);
			
			String k="abcdefghijklmnopqrstuvwxyz";
			ArrayList<String> a = new ArrayList<>();
			
			int t=0;
			for(int z=0;z<26;z++) {
				if(t>=abc.size()) {
					a.add(k.substring(z,z+1));
					continue;
				}
			if(abc.get(t).equals(k.substring(z,z+1))) {
					t++;
					continue;
				}
				a.add(k.substring(z,z+1));
			}
			out.println("missing "+ a.toString().replaceAll("[\\[\\], ]",""));
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new quickfox().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			 br = new BufferedReader(new InputStreamReader(System.in)); 
			//br = new BufferedReader(new FileReader(new File("quickfox.dat")));
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