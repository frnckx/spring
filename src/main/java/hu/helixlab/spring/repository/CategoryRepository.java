package hu.helixlab.spring.repository;

import hu.helixlab.spring.domain.Book;
import hu.helixlab.spring.domain.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {
}
