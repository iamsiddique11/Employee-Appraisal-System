package com.mph.dao;

import java.util.List;

import com.mph.entity.Employee;
import com.mph.entity.LoginCredentials;
import com.mph.entity.Manager;
/**
 * 
 */
public interface ManagerDao {
	
	/**this method will getAllManagerId
	 * @return List this method will return list of manager
	 */
	public List<Manager> getAllManagerId();

}
