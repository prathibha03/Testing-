package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "project")
public class Project {
	@Id
	
	private int     projId;
	@Column(name = "project_name")
	private String  projectName;
	@Column(name = "project_owner")
	private String  projectOwner;
	@Column(name = "project_desc")
	private String  projectDesc;
	
	
	public Project(int projId, String projectName, String projectOwner, String projectDesc) {
		this.projId = projId;
		this.projectName = projectName;
		this.projectOwner = projectOwner;
		this.projectDesc = projectDesc;
		
	}
	
	
	public int getProjId() {
		return projId;
	}
	
	
	
	public void setProjId(int projId) {
		this.projId = projId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectOwner() {
		return projectOwner;
	}
	public void setProjectOwner(String projectOwner) {
		this.projectOwner = projectOwner;
	}
	public String getProjectDesc() {
		return projectDesc;
	}
	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}
	
	

}
