package hu.helixlab.spring.controller;

import hu.helixlab.spring.domain.Category;
import hu.helixlab.spring.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryRestController {


    private final CategoryService categoryService;

    public CategoryRestController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @RequestMapping (value = "/categories" , method = RequestMethod.GET)
    public Iterable<Category> findAll(){

        return null;
    }
}
