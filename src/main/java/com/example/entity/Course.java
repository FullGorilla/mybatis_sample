package com.example.entity;

import java.util.List;

public class Course {
	
	private CourseDetail courseDetail;
	private List<Chapter> chapters;
	
	private int id;
	private String name;
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public CourseDetail getCourseDetail() {
	    return courseDetail;
	}
	 
	public void setCourseDetail(CourseDetail courseDetail) {
	    this.courseDetail = courseDetail;
	}
	
	public List<Chapter> getChapters() {
        return chapters;
    }

	public void setChapters(List<Chapter> chapters) {
	    this.chapters = chapters;
	}
}
