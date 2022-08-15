package com.citiustech.abcacademy;

import java.util.List;
import java.util.Scanner;

import com.citiustech.abcacademy.Dao.CandidateDao;
import com.citiustech.abcacademy.model.CandidateReport;
import com.citiustech.abcacademy.service.CandidateService;

public class mainClass {

	public static void main(String[] args) {

	
		CandidateService candidateService = new CandidateService();
		for (int i = 0; i < 3; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Candidate ID");
			int id = scanner.nextInt();
			System.out.println("Enter Candidate Name");
			String name = scanner.next();
			System.out.println("Enter Candidate Mark 1");
			int mark1 = scanner.nextInt();
			System.out.println("Enter Candidate Mark 2");
			int mark2 = scanner.nextInt();
			System.out.println("Enter Candidate Mark 3");
			int mark3 = scanner.nextInt();

			CandidateReport candidateReport = new CandidateReport();
			candidateReport.setCandidateId(id);
			candidateReport.setCandidateName(name);
			candidateReport.setMark1(mark1);
			candidateReport.setMark2(mark2);
			candidateReport.setMark3(mark3);

			String message = candidateService.addCandidate(candidateReport);
			System.out.println(message);
		}
		List<CandidateReport> list = candidateService.getGradesForAllCandidates();
		for (CandidateReport candidate : list) {
			System.out.println("Candidate ID>>" + candidate.getCandidateId());
			System.out.println("Canddiate Grade>>" + candidate.getGrade());
		}
	}
}
