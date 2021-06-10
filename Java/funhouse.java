import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class funhouse {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int n=1;
		while(true) {
			int w = f.nextInt();
			int l = f.nextInt();
			
			if(w==0 && l==0) {
				break;
			}
			char[][] mat = new char[l][w];
			int r=0;
			int c=0;
			for(int x=0;x<l;x++) {
				mat[x]=f.nextLine().toCharArray();
				
				for(int y=0;y<w;y++) {
					if(mat[x][y]=='*') {
						r=x;
						c=y;
					}
				}
			}


			boolean right =false;
			boolean left =false;
			boolean up = false;
			boolean down=false;
			if(r==0) {
				down =true;
			}
			if(r==l-1) {
				up=true;
			}
			if(c==0) {
				right=true;
			}
			if(c==w-1) {
				left=true;
			}
			while(c<w && r<l && r>-1 && c>-1) {
				//out.println(mat[r][c]+": " +r+" " +c);
				if(mat[r][c]=='\\') {
					if(right) {
						right =false;
						down=true;
					}
					else if(down) {
						down=false;
						right=true;
					}
					else if(up) {
						up=false;
						left=true;
					}
					else if(left) {
						left=false;
						up=true;
					}
				}
				else if(mat[r][c]=='/') {
					
					if(right) {
						right=false;
						up=true;
					}
					else if(up) {
						up=false;
						right=true;
					}
					else if(down) {
						down=false;
						left=true;
					}
					else if(left) {
						down=true;
						left=false;
					}
				}
			
				if(left) {
						c--;
					}
				if(right) {
						c++;
					}
				if(up) {
						r--;
					}
				if(down) {
						r++;
					}
				}
			
			
			if(right) {
				
				c--;
			}
			if(left) {
				
				c++;
			}
			if(up) {
				
				r++;
			}
			if(down) {
				
				r--;
				}
			mat[r][c]='&';
			out.println("HOUSE "+ n++);
			for(char[] s : mat) {
				out.println(Arrays.toString(s).replaceAll("[\\[\\], ]",""));
			}
		}
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new funhouse().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("funhouse.dat")));
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