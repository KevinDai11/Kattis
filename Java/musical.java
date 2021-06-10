import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class musical {
	public void run() throws Exception {
	    Scanner sc = new Scanner(System.in);
	    int numNotes = Integer.parseInt(sc.nextLine());
	    String[] input = sc.nextLine().split(" ");
	    String[] notes = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};
	    int[] major = {2, 2, 1, 2, 2, 2, 1};
	    int curr = 0;
	    boolean exists = false;
	    //each major
	    asd:
	    for (int i = 0; i < notes.length; i++) {
	      curr = i;
	      HashSet<String> hs = new HashSet<>(Arrays.asList(input));
	      
	      //stepping in major
	      for (int j = 0; j < major.length; j++) {
	        curr += major[j];
	        hs.remove(notes[curr % notes.length]);
	        if (hs.isEmpty()) {
	          System.out.print(notes[i] + " ");
	          exists = true;
	          continue asd;
	        }
	      }

	    }
	    if (!exists) {
	      System.out.println("none");
	    }
	}

	public static void main(String[] args) throws Exception {
		new musical().run();
	}

}