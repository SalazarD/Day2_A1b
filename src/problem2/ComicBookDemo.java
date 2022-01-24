package problem2;



public class ComicBookDemo {
	
	public static void main(String[] args) {
		ComicBook one = new ComicBook(1, "Spiderman", 1, ComicGradeEnum.GOOD, 10);
		ComicBook two = new ComicBook(2, "Tataman", 1, ComicGradeEnum.MINT, 20);
		
		System.out.println(one.toString());
		System.out.println(two.toString());
		two.setGrade(ComicGradeEnum.UNKNOWN);
		System.out.println(two.toString());
	}

}
