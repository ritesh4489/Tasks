package StreamAPI.casestudy;

import java.util.ArrayList;
import java.util.List;

public class InterviewRepository {

	private static List<Candidate> candidateList;
	
	static {
		prepareCandidateList();
	}
	
	private static void prepareCandidateList() {
		candidateList = new ArrayList<>();
		candidateList.add(new Candidate("Smith","Java","USA",3));
		candidateList.add(new Candidate("James","Java","NY",1));
		candidateList.add(new Candidate("Krish","C#","Pune",0));
		candidateList.add(new Candidate("Ritesh","C++","Chennai",0));
		candidateList.add(new Candidate("Ratan","Java","Mumbai",1));
		candidateList.add(new Candidate("Ranjan","Java","Banglore",11));
		candidateList.add(new Candidate("Abhi","C++","Chennai",4));
	}

	public static List<Candidate> getCandidateList() {
		return candidateList;
	}
}