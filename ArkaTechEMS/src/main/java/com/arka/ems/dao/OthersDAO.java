package com.arka.ems.dao;

import java.util.ArrayList;

import com.arka.ems.model.Dependents;
import com.arka.ems.model.EmergencyContact;
import com.arka.ems.model.PayStubs;


public interface OthersDAO {

	public ArrayList<PayStubs> getPayStubs(String id);

	public Dependents getDependents(String id);

	public boolean setDependents(String id, String name, String relation, String dob, Dependents dependents);

	public EmergencyContact getEmergencyContact(String id);

	public boolean setEmergencyContact(EmergencyContact ec);

	public String changepassword(String id, String op, String np);
}
