package com.arka.ems.dao;

import java.util.ArrayList;

import com.arka.ems.model.AdminTimesheet;
import com.arka.ems.model.AdminTimesheetHours;
import com.arka.ems.model.AllProfiles;
import com.arka.ems.model.ClientProfile;


public interface AdminDAO {

	public boolean checkForAdmin(String email, String password);

	public String getNewUserId();

	public void addNewUser(String id, String email, String pswd, String fname, String lname) throws Exception;
	
	public void deleteNewUser(String id);
	
	public ArrayList<AllProfiles> getallProfiles();

	public ArrayList<ClientProfile> getallClients();

	public ArrayList<AdminTimesheet> getAllPendingTimesheets();

	public boolean adminApproveDeny(String task);

	public ArrayList<AdminTimesheetHours> adminSearchtimesheet(String s_date, String e_date);

	public void payUser(String pay);

	public String changepassword(String uname, String old_pswd, String new_pswd);
}
