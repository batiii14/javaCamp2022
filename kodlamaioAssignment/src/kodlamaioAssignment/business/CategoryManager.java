package kodlamaioAssignment.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaioAssignment.core.logging.Logger;
import kodlamaioAssignment.dataAccess.CategoryDao;
import kodlamaioAssignment.entitites.Category;

public class CategoryManager
{
	private Logger[] _loggers;
	private List<Category> _categories;
	private CategoryDao _categoryDao;

	public CategoryManager(Logger[] loggers, List<Category> categories, CategoryDao categoryDao)
	{

		_loggers = loggers;
		_categories = categories;
		_categoryDao = categoryDao;
	}

	public void addCategory(Category category) throws Exception
	{
		if (_categories.isEmpty())
		{
			_categories.add(category);
			_categoryDao.addCategory(category);

			for (Logger logger : _loggers)
			{
				logger.log(category.getName());
			}
		}
		else
		{
			for (Category ctgry : _categories)
			{
				if (ctgry.getName() == category.getName())
				{
					throw new Exception(category.getName() + " is already exist!");
				} 

				}
			} 

			_categories.add(category);
			_categoryDao.addCategory(category);
			for (Logger logger : _loggers)
			{
				logger.log(category.getName());
			}

		
	}

}
