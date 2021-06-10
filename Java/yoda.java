import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class yoda {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		String o = f.nextLine();
		String t = f.nextLine();
		if(o.length()<t.length()) {
			while(o.length()<t.length()) {
				o="0"+o;
			}
		}
		if(t.length()<o.length()) {
			while(t.length()<o.length()) {
				t="0"+t;
			}
		}
		String no="";
		String nt="";
		for(int x=0;x<t.length();x++) {
			if(Integer.parseInt(o.substring(x,x+1))>Integer.parseInt(t.substring(x,x+1))) {
				no+=o.substring(x,x+1);
			}
			else if(Integer.parseInt(o.substring(x,x+1))<Integer.parseInt(t.substring(x,x+1))){
				nt+=t.substring(x,x+1);
			}
			else {
				nt+=t.substring(x,x+1);
				no+=o.substring(x,x+1);
			}
		}
		boolean bn =true;
		boolean bt=true;
		if(no.length()==0) {
			no="YODA";
			bn=false;
		}
		if(nt.length()==0) {
			nt="YODA";
			bt=false;
		}
		if(bn) {
			no=""+Integer.parseInt(no);
		}
		if(bt) {
			nt=""+Integer.parseInt(nt);
		}
		out.println(no+"\n"+nt);
		
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new yoda().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("yoda.dat")));
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