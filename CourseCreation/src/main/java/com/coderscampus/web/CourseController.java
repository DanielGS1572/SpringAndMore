package com.coderscampus.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coderscampus.domain.Course;
import com.coderscampus.domain.Lesson;
import com.coderscampus.repository.CourseRepository;

@Controller
public class CourseController {
	
	private CourseRepository courseRepository;
	@Autowired
	public void setCourseRepository(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}
	@RequestMapping("/")
	public String roothPath(){
		return "redirect:courses";
	}
	@RequestMapping("courses")
	public String courses(ModelMap model){
		List<Course> courses = courseRepository.findAll();
		model.put("courses", courses);
		return "courses";
	}
	
	@RequestMapping(value="editCourse/{courseId}",method=RequestMethod.GET)
	public String editCourseGet(@PathVariable Long courseId, ModelMap map){
		Course course = courseRepository.findOne(courseId);
		map.put("course", course);
		map.put("lessons", course.getLessons());
		return "editCourse";
	}
	
	@RequestMapping(value="createCourse", method=RequestMethod.GET)
	public String createCourseGet(ModelMap model){
		Course course = new Course();
		model.put("course", course);
		return "createCourse";
	}
	
	@RequestMapping(value="createCourse", method=RequestMethod.POST)
	public String createCoursePost(@ModelAttribute Course course, ModelMap model){
		courseRepository.save(course);
		return "redirect:/";
	}
	
	@RequestMapping(value="editCourse/addLesson/{courseId}", method=RequestMethod.GET)
	public String createLessonGet(@PathVariable Long courseId, ModelMap model){
		Course course = courseRepository.findOne(courseId);
		model.put("course", course);
		
		Lesson lesson = new Lesson();
		
		model.put("lesson", lesson);
		return "addLesson";
	}
	@RequestMapping(value="editCourse/addLesson/{courseId}", method=RequestMethod.POST)
	public String createLessonPost(@ModelAttribute Lesson lesson, @PathVariable Long courseId, ModelMap model){
		Course course = courseRepository.findOne(courseId);
		lesson.setCourse(course);
		course.getLessons().add(lesson);
		courseRepository.save(course);
		return "redirect:/";
		
	}
}
