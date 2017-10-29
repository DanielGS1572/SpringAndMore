package com.coderscampus.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coderscampus.domain.Course;
import com.coderscampus.domain.Section;
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
	@RequestMapping(value= "courses", method=RequestMethod.GET)
	public String coursePost(ModelMap model){
	Course course = new Course();
		List<Course> courses = courseRepository.findAll();
		model.put("courses", courses);
		model.put("course",	course);
		return "courses";	
	}
	
	@RequestMapping(value= "courses", method=RequestMethod.POST)
	public String courses(@ModelAttribute Course course, ModelMap model){
		courseRepository.save(course);
		return "redirect:/";
	}
	
	@RequestMapping(value="editCourse/{courseId}",method=RequestMethod.GET)
	public String editCourseGet(@PathVariable Long courseId, ModelMap map){
		Course course = courseRepository.findOne(courseId);
		if(course == null){
			return "redirect:/";
		}
		map.put("course", course);
		map.put("sections",course.getSections());
		
		return "editCourse";
	}
	
	@RequestMapping(value="editCourse/createSection",method=RequestMethod.POST)
	public @ResponseBody Course createSection(@RequestParam Long courseId, @RequestParam String sectionName, ModelMap map){
		Course course = courseRepository.findOne(courseId);
		Section section = new Section();
		section.setName(sectionName);
		section.setCourse(course);
		course.getSections().add(section);
		Course savedCourse = courseRepository.save(course);
		
		return savedCourse;
	}
	
//	@RequestMapping(value="createCourse", method=RequestMethod.GET)
//	public String createCourseGet(ModelMap model){
//		Course course = new Course();
//		model.put("course", course);
//		return "createCourse";
//	}
//	
//	@RequestMapping(value="createCourse", method=RequestMethod.POST)
//	public String createCoursePost(@ModelAttribute Course course, ModelMap model){
//		courseRepository.save(course);
//		return "redirect:/";
//	}
	
//	@RequestMapping(value="editCourse/addLesson/{courseId}", method=RequestMethod.GET)
//	public String createLessonGet(@PathVariable Long courseId, ModelMap model){
//		Course course = courseRepository.findOne(courseId);
//		model.put("course", course);
//		
//		Lesson lesson = new Lesson();
//		
//		model.put("lesson", lesson);
//		return "addLesson";
//	}
//	@RequestMapping(value="editCourse/addLesson/{courseId}", method=RequestMethod.POST)
//	public String createLessonPost(@ModelAttribute Lesson lesson, @PathVariable Long courseId, ModelMap model){
//		Course course = courseRepository.findOne(courseId);
//		lesson.setCourse(course);
//		course.getLessons().add(lesson);
//		courseRepository.save(course);
//		return "redirect:/";
//		
//	}
}
