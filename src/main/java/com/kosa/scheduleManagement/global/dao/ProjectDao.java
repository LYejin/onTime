package com.kosa.scheduleManagement.global.dao;

import java.util.List;

import com.kosa.scheduleManagement.global.dto.Project;
import com.kosa.scheduleManagement.global.dto.Project_Sub;

public interface ProjectDao {
	
	//로그인한 사원의 프로젝트 리스트
	List<Project> getProjectList(int deptno);
	
	//프로젝트 생성
	int insertProject(Project project);
	
	//프로젝트 삭제
	int deleteProject(int project_num);
}
