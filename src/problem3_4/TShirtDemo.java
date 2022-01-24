package problem3_4;

public class TShirtDemo {
	
	
	public static void main(String[] args) {
		TShirt[] shirts = new TShirt[5];
		shirts[0] = new TShirt(1, ColorEnum.RED, SizeEnum.SMALL, "Nice shirt", 10);
		shirts[1] = new TShirt(2, ColorEnum.BLUE, SizeEnum.XL, "Cool shirt", 15);
		shirts[2] = new TShirt(3, ColorEnum.GREEN, SizeEnum.LARGE, "Pretty shirt", 20);
		shirts[3] = new TShirt(4, ColorEnum.BLACK, SizeEnum.XXL, "Super shirt", 25);
		shirts[4] = new TShirt(5, ColorEnum.BLUE, SizeEnum.XL, "Epic shirt", 30);
		
		for(int i = 0; i < shirts.length; i++) {
			System.out.println(shirts[i].toString());
		}
		
		System.out.println("Matching: ");
		TShirt[] matching = getTshirts(shirts, ColorEnum.BLUE, SizeEnum.XL);
		for(int i = 0; i < matching.length; i++) {
			System.out.println(matching[i].toString());
		}
		
		
		
	}
	
	public static TShirt[] getTshirts(TShirt[] shirts, ColorEnum color, SizeEnum size) {
		
		
		int count = 0;
		for(int i = 0; i < shirts.length; i++) {
			if(shirts[i].getColor() == color && shirts[i].getSize() == size) {
				count++;
			}
		}
		int pos = 0;
		TShirt[] temp = new TShirt[count];
		for(int i = 0; i < shirts.length; i++) {
			if(shirts[i].getColor() == color && shirts[i].getSize() == size) {
				temp[pos] = shirts[i];
				pos++;
			}
		}
		
		
		
		return temp;
		
	}

}
