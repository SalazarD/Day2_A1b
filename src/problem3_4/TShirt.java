package problem3_4;

public class TShirt {
	
	private int tshirtId;
	private ColorEnum color;
	private SizeEnum size;
	private String description;
	private double price;
	
	
	public TShirt(int tshirtId, ColorEnum color, SizeEnum size, String description, double price) {
		
		this.tshirtId = tshirtId;
		this.color = color;
		this.size = size;
		this.description = description;
		this.price = price;
		
	}
	
	


	public int getTshirtId() {
		return tshirtId;
	}


	public ColorEnum getColor() {
		return color;
	}


	public SizeEnum getSize() {
		return size;
	}


	public String getDescription() {
		return description;
	}


	public double getPrice() {
		return price;
	}


	@Override
	public String toString() {
		return "TShirt [tshirtId=" + tshirtId + ", color=" + color + ", size=" + size + ", description=" + description
				+ ", price=" + price + "]";
	}
	
	
	

}
