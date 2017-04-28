package com.arka.ems.dao;

import java.util.ArrayList;

import org.springframework.web.multipart.MultipartFile;

import com.arka.ems.model.Documents;
import com.arka.ems.model.Education;
import com.arka.ems.model.Resume;
import com.arka.ems.model.Skills;


public interface EducationDAO {

	// For education Page
	public Education getEducation(String id);

	public boolean setEducation(Education e);

	// For Skills Page
	public Skills getSkills(String id);

	public boolean setSkills(String id, String s, String e, Skills skills);

	// For documents Page
	public ArrayList<Documents> getDocuments(String id);

	public boolean setDocuments(String id, String title, String exp_date, MultipartFile file);
	
	// For Skills Page
	public Resume getResume(String id);

	public boolean setResume(String id, String title, MultipartFile file);

}
