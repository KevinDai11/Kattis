import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class okvir2 {
	public void run() throws Exception {

		FastScanner f = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		int rows = f.nextInt();
		int columns = f.nextInt();
		String[] words = new String[rows];

		int up = f.nextInt();
		int left = f.nextInt();
		int right = f.nextInt();
		int down = f.nextInt();

		for (int i = 0; i < rows; i++)
		    words[i] = f.next();

		rows += up + down;
		columns += left + right;

		char[][] board = new char[rows][columns];

		for (int i = 0; i < rows; i++)
		    for (int j = 0; j < columns; j++)
		        board[i][j] = ' ';

		for (int r = up; r < rows - down; r++)
		    for (int c = left; c < columns - right; c++)
		        board[r][c] = words[r - up].charAt(c - left);

		for (int i = 0; i < rows; i++)
		    for (int j = 0; j < columns; j++)
		        if (board[i][j] == ' ')
		            {
		            if (i % 2 == 0)
		                board[i][j] = j % 2 == 0 ? '#' : '.';
		            else
		                board[i][j] = j % 2 == 0 ? '.' : '#';
		            }

		for (int i = 0; i < board.length; i++)
		    out.println(new String(board[i]));

		out.flush();
	}

	public static void main(String[] args) throws Exception {
		new okvir2().run();
	}

	static class FastScanner {

		BufferedReader br;
		StringTokenizer st;

		public FastScanner() throws FileNotFoundException {
			br = new BufferedReader(new InputStreamReader(System.in));
			//   br=new BufferedReader(new FileReader(new File("okvir2.dat")));
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