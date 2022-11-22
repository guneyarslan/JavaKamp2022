package business;

import java.util.List;

import core.logging.Logger;
import dataAccess.EducatorDao;
import entity.Educator;

public class EducatorManager {
	private EducatorDao educatorDao;
	private List<Logger> loggers;

	public EducatorManager(EducatorDao educatorDao, List<Logger> loggers) {
		this.educatorDao = educatorDao;
		this.loggers = loggers;

	}

	public void add(Educator educator) {
		educatorDao.add(educator);
		log(educator);
	}

	private void log(Educator educator) {
		for (Logger logger : loggers) {
			logger.log(educator.getName() + educator.getLastname());
		}
	}
}
