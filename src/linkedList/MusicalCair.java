package linkedList;
 
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
 
public class MusicalCair {
	private List<String> names;
	public MusicalCair(String... names) {
		if(names.length != 0) {
			this.names = new LinkedList<String>(Arrays.asList(names));
		}
	}
	public String toString() {
		Iterator<String> itr = this.names.iterator();
		String tmp = "";
		while(itr.hasNext()) {
			tmp += itr.next() + ", ";
		}
		return tmp;
	}
	public void rotate(int distance) {
		Collections.rotate(names, distance);
	}
	
	


public void rotateAndRemoveLast(int distance) {
	if(!this.names.isEmpty()) {
		rotate(distance);
		((LinkedList<String>) this.names).remove();
	}
}
		public String play() {
			if(!this.names.isEmpty()) {
				while(this.names.size() > 1) {
					int randomDistance = ThreadLocalRandom.current().nextInt();
					rotateAndRemoveLast(randomDistance);
					System.out.println(this.names);
					
				}
			}
			return this.names.get(0); 
		
		

	
}
}
