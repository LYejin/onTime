package com.kosa.scheduleManagement.global.dao;

public interface Mypage_EmpDao {
	//	��ü���� ���� 
		int getTotalSchedNum(int user_id);
		
	//	�Ϸ���� ����	
		int getDoneSchedNum(int user_id);
}