package com.homework.groupofstudentsbase;

import java.io.Serializable;

public class Faculty implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Group[] faculty = new Group[10];
	public Faculty(Group[] faculty) {
		super();
		this.faculty = faculty;
	}
	public Faculty() {
		super();
	}
	public Group[] getFaculty() {
		return faculty;
	}
	public void setFaculty(Group[] faculty) {
		this.faculty = faculty;
	}
	public void addGroup(Group group) {
		for (int i = 0; i < faculty.length; i++) {
			if (faculty[i] == null) {
				faculty[i] = group;
				return;
			}
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
