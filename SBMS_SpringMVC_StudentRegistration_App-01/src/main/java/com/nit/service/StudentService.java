package com.nit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.CourseEntity;
import com.nit.entity.GendersEntity;
import com.nit.entity.TimingsEntity;
import com.nit.repository.CourseRepo;
import com.nit.repository.GendersRepo;
import com.nit.repository.TimingsRepo;

@Service
public class StudentService {

	@Autowired
	private GendersRepo gendersRepo;
	
	@Autowired
	private CourseRepo courseRepo;
	
	@Autowired
	private TimingsRepo timingsRepo ;
	
	public List<String> getGenders(){          //For retrieving From gender_tbl in db
		List<GendersEntity> findAll = gendersRepo.findAll();
		List<String> genders = new ArrayList<>();
		findAll.forEach(gender ->{genders.add(gender.getGenderName());});
		return genders;
	}
	
	public List<String> getCourses(){
		List<CourseEntity> all = courseRepo.findAll();     //For retriving course names from db
		List<String> courses = new ArrayList<>();
		all.forEach(courseName ->{courses.add(courseName.getCourseName());});
		return courses;
	}
	
	public List<String> getTimings(){
		List<TimingsEntity> allTimings = timingsRepo.findAll();
		List<String> timings = new ArrayList<>();
		allTimings.forEach(timing ->{timings.add(timing.getTiming_name());});
		return timings;
	}
	
}
