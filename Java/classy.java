import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class classy {
    public void run() throws Exception {

        FastScanner f = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        
        int times = f.nextInt();
        for(int x=0;x<times;x++) {
            int p = f.nextInt();
            ArrayList<person> a = new ArrayList<>();
            for(int y=0;y<p;y++) {
                Stack<String> s = new Stack<>();
                String n = f.next();
                for(String sa: f.next().split("-")) {
                    s.add(sa);
                }
                f.next();
                String[] l = new String[10];
                int size = s.size();
                
                for(int z=0;z<size;z++) {
                    l[z]=s.pop();
                }
                for(int z=size;z<10;z++) {
                    l[z]="middle";
                }
                a.add(new person(n.substring(0,n.length()-1),l));
            }
            Collections.sort(a);

            for(person p1:a) {
                out.println(p1.n);
            }
            for(int y=0;y<30;y++) {
                out.print("=");
            }
            out.println();
        }
        out.flush();
    }

    public static void main(String[] args) throws Exception {
        new classy().run();
    }
    class person implements Comparable<person>{
        String n;
        String[] a;
        public person(String na, String[] aa) {
            n=na;
            a=aa;
        }
        
        public int compareTo(person o) {
            for(int x=0;x<10;x++) {
                int r = -a[x].compareTo(o.a[x]);
                if(r!=0) {
                    return r;
                }
            }
            return n.compareTo(o.n);
            
            
            
        }
        
        
    }
    static class FastScanner {

        BufferedReader br;
        StringTokenizer st;

        public FastScanner() throws FileNotFoundException {
             br = new BufferedReader(new InputStreamReader(System.in)); 
        //  br = new BufferedReader(new FileReader(new File("classy.dat")));
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

 
