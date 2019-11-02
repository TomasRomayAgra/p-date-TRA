package es.unileon.prg1.pdate;

public class MainDate {
public static void main(String[] args) {
	
	try {
		Date today = new Date(32, 13, 2017);
		today.setDay(32);
		System.out.println(today.toString());
	} catch (DateException e) {
		System.out.println(e.getMessage());
	}
	
	
}
	
}
