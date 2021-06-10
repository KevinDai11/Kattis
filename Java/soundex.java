import java.util.*;

public class soundex {
	public static void main(String[] args) {
		Scanner f = new Scanner(System.in);
		TreeMap<Integer, ArrayList<String>> map = new TreeMap<>();
		map.put(1, new ArrayList<String>(Arrays.asList("B","F","P","V")));
		map.put(2,new ArrayList<String>(Arrays.asList("C", "G", "J","K", "Q","S", "X","Z")));
		map.put(3, new ArrayList<String>(Arrays.asList("D","T")));
		map.put(4, new ArrayList<String>(Arrays.asList("L")));
		map.put(5, new ArrayList<String>(Arrays.asList("M","N")));
		map.put(6,new ArrayList<String>(Arrays.asList("R")));
		while(f.hasNextLine()) {
			String s = f.nextLine();
			String n = "";
			int p=0;
			for(int x=0;x<s.length();x++) {
				String t= s.substring(x,x+1);
				boolean b = false;
				for(int i : map.keySet()) {
					if(map.get(i).contains(t)) {
						b=true;
						if(p!=i) {
							n+=i;
							p=i;
							
							break;
						}
						
					}
				}
				if(!b) {
					p=0;
				}
				
			}
			System.out.println(n);
		}
	}
}
