import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class WeakVertices {
    public void run() throws Exception {
        Scanner file = new Scanner(System.in);
        while(true) {
            int n = file.nextInt();
            if(n==-1)
            {
                break;
            }
            HashMap<Integer, ArrayList<Integer>> m = new HashMap<>();
            TreeSet<Integer> t = new TreeSet<>();
            for(int x=0;x<n;x++) {
                ArrayList<Integer> temp = new ArrayList<>();
                for(int y=0;y<n;y++) {
                    if(file.nextInt()==1) {
                        temp.add(y);
                    }
                }
                m.put(x, temp);
            }
            for(int x=0;x<n;x++) {
                boolean o = false;
                for(int i : m.get(x)) {
                    for(int k : m.get(i)) {
                        for(int j : m.get(k)) {
                            if(j==x) {
                                o=true;
                                break;
                            }
                        }
                        if(o)break;
                    }
                    if(o)break;
                }
                if(!o) {
                    t.add(x);
                }
            }
            for(int x:t) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        new WeakVertices().run();
    }

}