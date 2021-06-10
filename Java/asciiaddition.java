import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class asciiaddition {
	String zero="xxxxx\r\n" + 
			"x...x\r\n" + 
			"x...x\r\n" + 
			"x...x\r\n" + 
			"x...x\r\n" + 
			"x...x\r\n" + 
			"xxxxx";
	String one = "....x\r\n" + 
			"....x\r\n" + 
			"....x\r\n" + 
			"....x\r\n" + 
			"....x\r\n" + 
			"....x\r\n" + 
			"....x";
	String two ="xxxxx\r\n" + 
			"....x\r\n" + 
			"....x\r\n" + 
			"xxxxx\r\n" + 
			"x....\r\n" + 
			"x....\r\n" + 
			"xxxxx";
	String three="xxxxx\r\n" + 
			"....x\r\n" + 
			"....x\r\n" + 
			"xxxxx\r\n" + 
			"....x\r\n" + 
			"....x\r\n" + 
			"xxxxx";
	String four= "x...x\r\n" + 
			"x...x\r\n" + 
			"x...x\r\n" + 
			"xxxxx\r\n" + 
			"....x\r\n" + 
			"....x\r\n" + 
			"....x";
	String five= "xxxxx\r\n" + 
			"x....\r\n" + 
			"x....\r\n" + 
			"xxxxx\r\n" + 
			"....x\r\n" + 
			"....x\r\n" + 
			"xxxxx";
	String six= "xxxxx\r\n" + 
			"x....\r\n" + 
			"x....\r\n" + 
			"xxxxx\r\n" + 
			"x...x\r\n" + 
			"x...x\r\n" + 
			"xxxxx";
	String seven ="xxxxx\r\n" + 
			"....x\r\n" + 
			"....x\r\n" + 
			"....x\r\n" + 
			"....x\r\n" + 
			"....x\r\n" + 
			"....x";
	String eight = "xxxxx\r\n" + 
			"x...x\r\n" + 
			"x...x\r\n" + 
			"xxxxx\r\n" + 
			"x...x\r\n" + 
			"x...x\r\n" + 
			"xxxxx";
	String nine ="xxxxx\r\n" + 
			"x...x\r\n" + 
			"x...x\r\n" + 
			"xxxxx\r\n" + 
			"....x\r\n" + 
			"....x\r\n" + 
			"xxxxx";
	String plus =".....\r\n" + 
			"..x..\r\n" + 
			"..x..\r\n" + 
			"xxxxx\r\n" + 
			"..x..\r\n" + 
			"..x..\r\n" + 
			".....";
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		String s = f.nextLine();
		out.println(one+plus);
		String[][] m = new String[7][s.length()];
		m[0]=s.split("");
		
		for(int x=1;x<7;x++) {
			m[x]=f.nextLine().split("");
		}
		String a ="";
		String b="";
		boolean th =true;
		for(int x=0;x<s.length();x+=6) {
			String temp ="";
			for(int y=0;y<7;y++) {
				for(int z=x;z<x+5;z++) {
					temp+=m[y][z];
				}
				temp+="\r\n";
			}
			temp=temp.trim();
			if(temp.equals(plus)){
				th= false;
				continue;
			}
			if(th) {
				if(temp.equals(one)) {
					a+="1";
				}
				if(temp.equals(two)) {
					a+="2";
				}
				if(temp.equals(three)) {
					a+="3";
				}
				if(temp.equals(four)) {
					a+="4";
				}
				if(temp.equals(five)) {
					a+="5";
				}
				if(temp.equals(six)) {
					a+="6";
				}
				if(temp.equals(seven)) {
					a+="7";
				}
				if(temp.equals(eight)) {
					a+="8";
				}
				if(temp.equals(nine)) {
					a+="9";
				}
				if(temp.equals(zero)) {
					a+="0";
				}
			}else {
				if(temp.equals(one)) {
					b+="1";
				}
				if(temp.equals(two)) {
					b+="2";
				}
				if(temp.equals(three)) {
					b+="3";
				}
				if(temp.equals(four)) {
					b+="4";
				}
				if(temp.equals(five)) {
					b+="5";
				}
				if(temp.equals(six)) {
					b+="6";
				}
				if(temp.equals(seven)) {
					b+="7";
				}
				if(temp.equals(eight)) {
					b+="8";
				}
				if(temp.equals(nine)) {
					b+="9";
				}
				if(temp.equals(zero)) {
					b+="0";
				}
			}
		}
		int ret = Integer.parseInt(a)+Integer.parseInt(b);
		String r = Integer.toString(ret);
		for(int x=0;x<r.length();x++) {
			if(r.charAt(x)=='0') {
				out.print(zero);
			}
			if(r.charAt(x)=='1') {
				out.print(one);
			}
			if(r.charAt(x)=='2') {
				out.print(two);
			}
			if(r.charAt(x)=='3') {
				out.print(three);
			}
			if(r.charAt(x)=='4') {
				out.print(four);
			}
			if(r.charAt(x)=='5') {
				out.print(five);
			}
			if(r.charAt(x)=='6') {
				out.print(six);
			}
			if(r.charAt(x)=='7') {
				out.print(seven);
			}
			if(r.charAt(x)=='8') {
				out.print(eight);
			}
			if(r.charAt(x)=='9') {
				out.print(nine);
			}
			
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new asciiaddition().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("asciiaddition.dat")));
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