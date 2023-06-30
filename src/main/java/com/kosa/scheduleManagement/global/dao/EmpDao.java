package com.kosa.scheduleManagement.global.dao;

import java.util.List;

import com.kosa.scheduleManagement.global.dto.Emp;


public interface EmpDao {
	//Ư�� �μ� �Ҽ� �������Ʈ
	List<Emp> getEmpListByDeptno(int deptno);
	
	void updateEmpInfo(Emp emp);
	
	Emp getEmpInfo(int user_id);
}