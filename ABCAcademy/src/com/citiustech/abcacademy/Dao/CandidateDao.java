package com.citiustech.abcacademy.Dao;

import java.util.ArrayList;
import java.util.List;

import com.citiustech.abcacademy.model.CandidateReport;

public class CandidateDao {
	
	static List<CandidateReport> list = new ArrayList<CandidateReport>();

	public String addCandidate(CandidateReport candidateReport) {
		list.add(candidateReport);
		System.out.println(list);
		return "Added Successfully";
	}
	public List<CandidateReport> getAllCandidate() {
		return list;
	}

}
