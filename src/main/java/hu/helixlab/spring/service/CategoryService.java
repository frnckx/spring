package hu.helixlab.spring.service;


import hu.helixlab.spring.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired //injektálás
    private CategoryRepository categoryRepository;
}
