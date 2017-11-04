
public class TestCandidate 
{
	public static void main(String[] args)
	{
		CandidatePool cp = new CandidatePool();
		
		Candidate c1 = new Candidate(1, "assistant", 90);
		Candidate c2 = new Candidate(2, "manager", 95);
		Candidate c3 = new Candidate(3, "manager", 82);
		Candidate c4 = new Candidate(4, "executive", 99);
		Candidate c5 = new Candidate(5, "manager", 87);
		Candidate c6 = new Candidate(6, "executive", 91);
		Candidate c7 = new Candidate(7, "assistant", 80);
		Candidate c8 = new Candidate(8, "assistant", 72);

		cp.addCandidate(c1);
		cp.addCandidate(c2);
		cp.addCandidate(c3);
		cp.addCandidate(c4);
		cp.addCandidate(c5);
		cp.addCandidate(c6);
		cp.addCandidate(c7);
		cp.addCandidate(c8);
		
		//test the methods that you write for CandidatePool here
		
		
	}

}
