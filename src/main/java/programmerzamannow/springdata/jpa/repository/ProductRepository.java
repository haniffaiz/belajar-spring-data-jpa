package programmerzamannow.springdata.jpa.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import programmerzamannow.springdata.jpa.entity.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Long countByCategory_Name(String name);
    List<Product> findAllByCategory_Name(String name);
    List<Product> findAllByCategory_Name(String name, Sort sort);
    Page<Product> findAllByCategory_Name(String name, Pageable pageable);


}

