package com.kosa.scheduleManagement.global.dao;

import java.util.List;

import com.kosa.scheduleManagement.global.dto.Project;
import com.kosa.scheduleManagement.global.dto.Project_Sub;

public interface ProjectDao {
	
	//�α����� ����� ������Ʈ ����Ʈ
	List<Project> getProjectList(int deptno);
	
	//������Ʈ ����
	int insertProject(Project project);
	
	//������Ʈ ����
	int deleteProject(int project_num);
	
	//������Ʈ ������
	Project projectDetail(int project_num);
}