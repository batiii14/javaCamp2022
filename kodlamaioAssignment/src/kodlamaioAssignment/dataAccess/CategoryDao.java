package kodlamaioAssignment.dataAccess;

import kodlamaioAssignment.entitites.Category;

public interface CategoryDao
{
	void addCategory(Category category);
	void deleteCategory(Category category);
	void updateCategory(Category category);
}
