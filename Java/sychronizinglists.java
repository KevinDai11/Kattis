import java.io.*;
import java.util.*;

public class sychronizinglists{
	public static void main(String[] args) {
		Scanner file = new Scanner(System.in);
		while(file.hasNextLine()) {
			int n = file.nextInt();
			if(n ==0) {
				break;
			}
			List<Integer> a = new ArrayList<>();
			List<Integer> tempA = new ArrayList<>();
			for(int x=0;x<n;x++) {
				a.add(file.nextInt());
				tempA.add(a.get(x));
			}
			List<Integer> b = new ArrayList<>();
			for(int x=0;x<n;x++) {
				b.add(file.nextInt());
			}
			
			
			Collections.sort(tempA);
			Collections.sort(b);
			
			
			HashMap<Integer, Integer> map = new HashMap<>();
			for(int x=0;x<tempA.size();x++) {
				map.put(tempA.get(x), b.get(x));
			}
			for(int x : a) {
				System.out.println(map.get(x));
			}
			System.out.println();
		}
	}
}