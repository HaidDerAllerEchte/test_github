package exeptions;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Aufgabe6_2 {

	public static void main(String[] args) {
		
		final Pattern noten = Pattern.compile("C,|D,|E,|F,|G,|A,|B,|C|D|E|F|G|A|B|c|d|e|f|g|a|b|c'|d'|e'|f'|g'|a'|b'");
		
	try {
		Scanner sc = new Scanner(Paths.get("Noten.txt")); 
			while(sc.hasNext() && noten.matcher(sc.next()).matches()) {
				String tmp = sc.nextLine();
				if(noten.matcher.tmp().matches())
				System.out.println(sc.next());
				
			}
			sc.close();
		}catch (IOException e) {
			System.out.println("Es konnte nicht außgelesen werden");
	}
	}
	}

