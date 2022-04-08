package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.Dao.CourseDao;
import com.springrest.springrest.entity.Course;


@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	
	//List<Course> list;
	
	
	
	public CourseServiceImpl() {
//		list = new ArrayList<Course>();
//		list.add(new Course(145,"Java Course","this course is for beginners"));
//		list.add(new Course(146,"Python Course","this course is for beginners"));
//		
		
	}
	
	
	
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		//return list;
		
		return courseDao.findAll();
	}



	@SuppressWarnings("deprecation")
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		
//		Course c = null;
//		for(Course course: list)
//		{
//			if (course.getId()==courseId)
//			{
//				c = course;
//				break;
//			}
//		}
		//return c;
		return courseDao.getOne(courseId);
	}



	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		
//		list.add(course);
		//return course;
		
		courseDao.save(course);
		return course;
	}



	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		
//		list.forEach(e -> {
//			if(e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		//return course;
		
		courseDao.save(course);
		return course;
	}



	public void deleteCourse(long parseLong) {
		// TODO Auto-generated method stub
		
//		list = this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}

	
	/*

	public String delCourse(long courseId) {
		// TODO Auto-generated method stub
		list.remove(courseId);
		return "Subject Deleted Sucessfully";
	}

	*/
}
