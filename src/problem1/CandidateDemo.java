package problem1;

public class CandidateDemo {
	
	public static void main(String[] args) {
		Candidate one = new Candidate(1, "Jan Stevens");
		// INITIAL
		System.out.println(one.getName()+": "+one.getStatus());
		// CONTACT
		System.out.println(one.getName()+": "+one.advanceStatus());
		// REVIEW
		System.out.println(one.getName()+": "+one.advanceStatus());
		// RECOMMEND
		System.out.println(one.getName()+": "+one.advanceStatus());
		// OFFER
		System.out.println(one.getName()+": "+one.advanceStatus());
		// ACCEPT
		System.out.println(one.getName()+": "+one.advanceStatus());
		System.out.println(); // print an empty line.
		Candidate two = new Candidate(2, "Bob Smith");
		// INITIAL
		System.out.println(two.getName()+": "+two.getStatus());
		// CONTACT
		System.out.println(two.getName()+": "+two.advanceStatus());
		// REVIEW
		System.out.println(two.getName()+": "+two.advanceStatus());
		// DECLINE
		System.out.println(two.getName()+": "+two.decline());
	}
}
