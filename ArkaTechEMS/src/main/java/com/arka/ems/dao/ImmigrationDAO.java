package com.arka.ems.dao;

import com.arka.ems.model.Immigration;

public interface ImmigrationDAO {

	public Immigration getImmigration(String id);
	public boolean setImmigration(Immigration i);
}
