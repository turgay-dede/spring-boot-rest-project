package com.turgaydede.api;

import com.turgaydede.business.CategoryManager;
import com.turgaydede.entities.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private final CategoryManager categoryManager;

    public CategoryController(CategoryManager categoryManager) {
        this.categoryManager = categoryManager;
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody Category category) {
        this.categoryManager.add(category);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/delete")
    public ResponseEntity<?> delete(@RequestBody Category category) {
        this.categoryManager.delete(category);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/update")
    public ResponseEntity<?> update(@RequestBody Category category) {
        this.categoryManager.update(category);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getall")
    public ResponseEntity<List<Category>> getAll() {
        return ResponseEntity.ok().body(this.categoryManager.getAll());
    }
}
