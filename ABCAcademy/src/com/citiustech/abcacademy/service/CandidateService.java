package com.citiustech.abcacademy.service;

import java.util.List;

import com.citiustech.abcacademy.Dao.CandidateDao;
import com.citiustech.abcacademy.model.CandidateReport;

public class CandidateService {

	public String addCandidate(CandidateReport candidateReport) {
		if (candidateReport.getMark1() < 50 || candidateReport.getMark2() < 50 || candidateReport.getMark3() < 50)
			return "Result should be 'F' (Fail) if student scores less than 50 in any one subject";
		else {
			CandidateDao candidateDao = new CandidateDao();
			String rgrade=calculateGrade(candidateReport);
			candidateReport.setGrade(rgrade);
			candidateReport.setResult('P');
			String str = candidateDao.addCandidate(candidateReport);
			return str;
		}
	}

	public String calculateGrade(CandidateReport candidateReport) {
		double average = (candidateReport.getMark1() + candidateReport.getMark2() + candidateReport.getMark3()) / 3;
		String result = "";
		if (average >= 85) {
			result =  "A";
		} else if (average <= 85 && average > 75) {
			result =  "B";
		} else if (average <= 75 && average > 50) {
			result = "C";
		} else if (average < 50) {
			result =  "NA";
		} else {
			System.out.println("Invalid Input");
		}
		return result;
	}

	public List<CandidateReport> getGradesForAllCandidates() {
		CandidateDao candidateDao = new CandidateDao();
		List<CandidateReport> list=candidateDao.getAllCandidate();
		System.out.println();
		return list;
		
	}
}
