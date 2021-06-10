import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class okviri {
	char[][] template = {"..#..".toCharArray(),".#.#.".toCharArray(),"#.X.#".toCharArray(),".#.#.".toCharArray(),"..#..".toCharArray()};
	char[][] othert = {"..*..".toCharArray(),".*.*.".toCharArray(),"*.X.*".toCharArray(),".*.*.".toCharArray(),"..*..".toCharArray()};
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);

        String word = f.nextLine();

        String outer = "..#..";
        String inner = ".#.#.";
        String middle = "#." + word.charAt(0) + ".#";
        int count = 1;

        for (int i = 1; i < word.length(); i++) {
            count++;

            if (count % 3 == 0) {
                outer += ".*..";
                inner += "*.*.";
                middle += "." + word.charAt(i) + ".*";
            } else {
                outer += ".#..";
                inner += "#.#.";
                middle += "." + word.charAt(i) + ".";
                if ((count + 1) % 3 == 0 && i != word.length() - 1) {
                    middle += "*";
                } else {
                    middle += "#";
                }
            }
        }

        System.out.println(outer + "\n" + inner + "\n" + middle + "\n" + inner + "\n" + outer);
		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new okviri().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("okviri.dat")));
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