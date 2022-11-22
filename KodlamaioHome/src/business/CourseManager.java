package business;

import java.util.List;

import core.logging.Logger;
import dataAccess.CourseDao;
import entity.Course;

public class CourseManager {
	private CourseDao courseDao;
	private List<Course> courses;
	private List<Logger> loggers;

	public CourseManager(CourseDao courseDao, List<Course> courses, List<Logger> loggers) {
		super();
		this.courseDao = courseDao;
		this.courses = courses;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		try {
			isCourseExist(course.getName());
			isPriceValid(course.getPrice());
			courses.add(course);
			log(course);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private void log(Course course) {
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}

	private void isCourseExist(String courseName) throws Exception {
		for (Course course : courses) {
			if (course.getName().equals(courseName)) {
				throw new Exception("Bu kurs zaten var!");
			}
		}
	}

	private void isPriceValid(double coursePrice) throws Exception {
		if (coursePrice < 0) {
			throw new Exception("Kurs ücreti sıfırdan küçük olamaz!");
		}
	}
}
