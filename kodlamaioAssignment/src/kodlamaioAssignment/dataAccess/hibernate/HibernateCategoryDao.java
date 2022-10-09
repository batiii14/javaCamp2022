package kodlamaioAssignment.dataAccess.hibernate;

import java.util.ArrayList;
import java.util.List;

import kodlamaioAssignment.dataAccess.CategoryDao;
import kodlamaioAssignment.entitites.Category;

public class HibernateCategoryDao implements CategoryDao
{
	List<Category> categories=new ArrayList<Category>();
	@Override
	public void addCategory(Category category)
	{
		categories.add(category);
		System.out.println(category.getName()+" has been added with Hibernate");
	}

	@Override
	public void deleteCategory(Category category)
	{
		System.out.println(category.getName()+" has been deleted with Hibernate");
	}

	@Override
	public void updateCategory(Category category)
	{
		System.out.println(category.getName()+" has been updated with Hibernate");		
	}

}
