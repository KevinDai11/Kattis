import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class relocation {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int n = file.nextInt();
		int q = file.nextInt();
		file.nextLine();
		ArrayList<Integer> m = new ArrayList<>();
		for(int x=1;x<=n;x++) {
			m.add(file.nextInt());
		}
		file.nextLine();
		for(int x=0;x<q;x++) {
			if(file.nextInt()==1) {
				m.set(file.nextInt()-1, file.nextInt());
			}
			else{
				System.out.println(Math.abs(m.get(file.nextInt()-1)-m.get(file.nextInt()-1)));
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new relocation().run();
	}

}