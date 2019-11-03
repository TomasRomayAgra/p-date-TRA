package es.unileon.prg1.pdate;

public class MainDate {
public static void main(String[] args) {
	
	try {
		Date today = new Date(31, 1, 2017);
		today.setDay(31);
		System.out.println(today.toString());
	} catch (DateException e) {
		System.out.println(e.getMessage());
	}
	
	
}
	
}
