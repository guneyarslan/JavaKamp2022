import java.util.ArrayList;
import java.util.List;

import business.CategoryManager;
import business.CourseManager;
import business.EducatorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import dataAccess.HibernateDao;
import dataAccess.JdbcDao;
import entity.Category;
import entity.Course;
import entity.Educator;

public class Main {

	public static void main(String[] args) throws Exception {
		List<Category> categories = new ArrayList<>();
		List<Course> courses = new ArrayList<>();
		List<Logger> loggers = new ArrayList<>();
		loggers.add(new FileLogger());
		loggers.add(new DatabaseLogger());

		Course course1 = new Course(1, "Java", 600);
		Course course2 = new Course(2, "C# + Angular", 500);
		Course course3 = new Course(3, ".Net Senior", 400);
		Course course4 = new Course(4, "Javascript", 300);
		Course course5 = new Course(5, "Java + React", 200);
		Course course6 = new Course(6, "Programlamaya Giriş", 100);

		CourseManager courseManager = new CourseManager(new JdbcDao(), courses, loggers);
		courseManager.add(course1);
		courseManager.add(course2);

		Category category1 = new Category(1, "Programlama");
		Category category2 = new Category(2, "Tümü");
		CategoryManager categoryManager = new CategoryManager(new HibernateDao(), categories, loggers);

		categoryManager.add(category1);
		categoryManager.add(category2);

		Educator educator = new Educator(1, "Engin", "Demirog");
		EducatorManager educatorManager = new EducatorManager(new HibernateDao(), loggers);
		educatorManager.add(educator);

	}

}
