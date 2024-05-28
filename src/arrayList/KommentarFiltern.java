package arrayList;

import java.util.ArrayList;
import java.util.List;

public class KommentarFiltern {
	
	
	
	public static void reduceToComments(List<String>lines) {
		for(int i = 0; i<lines.size()-3;i++) {
			lines.remove(i);
			lines.remove(i);
			lines.remove(i);
		}
			System.out.println(lines);
			
		}
	

	public static void main(String[] args) {
		ArrayList<String>lines = new ArrayList<String>();
		for(int i = 0; i<15;i++) {
			lines.add("M");
			lines.add("G");
			lines.add("W");
			lines.add("K");
		}
		reduceToComments(lines);

	}

}
