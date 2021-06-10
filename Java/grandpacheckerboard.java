import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class grandpacheckerboard {
    public void run() throws Exception {

        FastScanner f = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int n = f.nextInt();
        char[][] c = new char[n][n];
        
        for(int x=0;x<n;x++) {
            c[x]=f.nextLine().toCharArray();
            int rb=0;
            int rw=0;
            for(int z=0;z<n;z++) {
                if(c[x][z]=='B') {
                    rb++;
                }
                else {
                    rw++;
                }
                if(z<n-2 && c[x][z]==c[x][z+1] && c[x][z+2]==c[x][z]) {
                    System.out.println(0);
                    return;
                }
            }
            if(rb!=rw) {
                System.out.println(0);
                return;
            }
        }
        
        for(int x=0;x<n;x++) {
            int b=0;
            int w=0;
            for(int y=0;y<n;y++) {
                if(c[y][x]=='B') {
                    b++;
                }
                else {
                    w++;
                }
                if(y<n-2 && c[y][x]==c[y+1][x]&&c[y][x]==c[y+2][x]) {
                    System.out.println(0);
                    return;
                }
            }
            if(b!=w) {
                System.out.println(0);
                return;
            }
        }
        out.print(1);

        out.flush();
    }

    public static void main(String[] args) throws Exception {
        new grandpacheckerboard().run();
    }

    static class FastScanner {

        BufferedReader br;
        StringTokenizer st;

        public FastScanner() throws FileNotFoundException {
            br = new BufferedReader(new InputStreamReader(System.in));
            //   br=new BufferedReader(new FileReader(new File("grandpacheckerboard.dat")));
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