package problem1;

public class Candidate {
	
	private int candidateId;
	private String name;
	private CandidateStatusEnum status;
	
	public Candidate(int candidateId, String name) {
		super();
		this.candidateId = candidateId;
		this.name = name;
		status = CandidateStatusEnum.INITIAL;
		}

	public CandidateStatusEnum advanceStatus() {
		
		if (status == CandidateStatusEnum.INITIAL) {
			status = CandidateStatusEnum.CONTACT;
			
		} else if (status == CandidateStatusEnum.CONTACT) {
			status = CandidateStatusEnum.REVIEW;
			
		} else if (status == CandidateStatusEnum.REVIEW) {
			status = CandidateStatusEnum.RECOMMEND;
			
		} else if (status == CandidateStatusEnum.RECOMMEND) {
			status = CandidateStatusEnum.OFFER;
			
		} else if (status == CandidateStatusEnum.OFFER) {
			status = CandidateStatusEnum.ACCEPT;
		}
		
		return status;
		}
	
	public CandidateStatusEnum decline() {
		if (status != CandidateStatusEnum.ACCEPT) {
			status = CandidateStatusEnum.DECLINE;
		}
		
		return status;
		}

	public int getCandidateId() {
		return candidateId;
	}

	public String getName() {
		return name;
	}

	public CandidateStatusEnum getStatus() {
		return status;
	}
	
	
	
}
