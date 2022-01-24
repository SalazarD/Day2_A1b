package problem2;

public class ComicBook {
	
	
	private int comicId;
	private String comicName;
	private int issueNo;
	private ComicGradeEnum grade;
	private double value;
	
	public ComicBook(int comicId, String comicName, int issueNo, ComicGradeEnum grade, double value){
		
		this.comicId = comicId;
		this.comicName = comicName;
		this.issueNo = issueNo;
		this.grade = grade;
		this.value = value;
		
	}

	public ComicGradeEnum getGrade() {
		return grade;
	}

	public void setGrade(ComicGradeEnum grade) {
		this.grade = grade;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public int getComicId() {
		return comicId;
	}

	public String getComicName() {
		return comicName;
	}

	public int getIssueNo() {
		return issueNo;
	}

	@Override
	public String toString() {
		return "ComicBook [comicId=" + comicId + ", comicName=" + comicName + ", issueNo=" + issueNo + ", grade="
				+ grade + ", value=" + value + "]";
	}
	
	
	

}
