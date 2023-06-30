package com.kosa.scheduleManagement.mypage.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kosa.scheduleManagement.global.dao.EmpDao;
import com.kosa.scheduleManagement.global.dao.Mypage_EmpDao;
import com.kosa.scheduleManagement.global.dao.Project_EmpDao;
import com.kosa.scheduleManagement.global.dto.Emp;

@Service
public class mypageService {
	private SqlSession sqlsession;

	@Autowired
	public void setSqlsession(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}
	
//	��� ���� ������Ʈ 
	public void updateEmpInfo(Emp emp) {
		
		EmpDao empdao = sqlsession.getMapper(EmpDao.class);
		
		try {
			System.out.println("service ����");
			empdao.updateEmpInfo(emp);
			System.out.println("userInfo update ����");
		} catch (Exception e) {
			e.getStackTrace();
			System.out.println("updateEmpInfoService ���� :" + e.getMessage());
		}
	}

//	��� ���� ��������
	public Emp getEmpInfo(int user_id) {
		EmpDao empdao = sqlsession.getMapper(EmpDao.class);
		Emp emp = null;
		
		try {
			System.out.println("service ��");
			emp = empdao.getEmpInfo(user_id);
			System.out.println("getEmpInfo ����");
		} catch (Exception e) {
			e.getStackTrace();
			System.out.println("getEmpInfoService ���� :" + e.getMessage());
		}
		return emp;
	}
	
//	��ü�������� ����
	public int getTotalSchedNum(int user_id) {
		Mypage_EmpDao mypage_empdao = sqlsession.getMapper(Mypage_EmpDao.class);
		
		int result = -1;
		
		try {
			System.out.println("service ����");
			result = mypage_empdao.getTotalSchedNum(user_id);
			System.out.println("getTotalSchedNum ����");
		} catch (Exception e) {
			e.getStackTrace();
			System.out.println("getTotalSchedNumService ���� :" + e.getMessage());
		}
		return result;
	}
	
//	��ü�������� ����
	public int getDoneSchedNum(int user_id) {
		Mypage_EmpDao mypage_empdao = sqlsession.getMapper(Mypage_EmpDao.class);
		
		int result = -1;
		
		try {
			System.out.println("service ����");
			result = mypage_empdao.getDoneSchedNum(user_id);
			System.out.println("getDoneSchedNum ����");
		} catch (Exception e) {
			e.getStackTrace();
			System.out.println("getDoneSchedNumService ���� :" + e.getMessage());
		}
		return result;
	}
}