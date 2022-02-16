package com.turgaydede.business;

import com.turgaydede.dataAccess.CategoryDao;
import com.turgaydede.entities.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryManager {
    private final CategoryDao categoryDao;

    public CategoryManager(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    public void add(Category category){
        this.categoryDao.save(category);
    }
    public void delete(Category category){
        this.categoryDao.delete(category);
    }
    public void update(Category category){
        this.categoryDao.save(category);
    }
    public List<Category> getAll(){
        return this.categoryDao.findAll();
    }
}
