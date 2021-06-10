import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class notamused {
	public void run() throws Exception {
	//	Scanner f = new Scanner(new File("notamused.dat"));	
	Scanner f = new Scanner(System.in);
		int d=1;
		while(f.hasNextLine()) {
			String s = f.nextLine();
			if(s.equals("OPEN")) {
				System.out.println("Day "+d);
				TreeMap<String, Integer> enter = new TreeMap<>();
				
 				TreeMap<String, Double> sum= new TreeMap<>();
				while(true) {
					String[] a = f.nextLine().split(" ");
					if(a[0].equals("CLOSE")) {
						d++;
						break;
					}
					if(a[0].equals("ENTER")) {
						enter.put(a[1], Integer.parseInt(a[2]));
					}
					if(a[0].equals("EXIT")) {
						int en = enter.get(a[1]);
						int le = Integer.parseInt(a[2]);
						enter.remove(a[1]);
						if(sum.containsKey(a[1])) {
							sum.put(a[1], (sum.get(a[1])+(le-en)));
						}
						else {
							sum.put(a[1],(double) (le-en));
						}
					}
				}
				for(String t : sum.keySet()) {
					System.out.printf("%s%.2f%n",t+" $",sum.get(t)*.1);
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new notamused().run();
	}

}