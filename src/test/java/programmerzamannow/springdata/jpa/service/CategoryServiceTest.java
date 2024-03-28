package programmerzamannow.springdata.jpa.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CategoryServiceTest {

    @Autowired
    private CategoryService categoryService;

    @Test
    void success() {
        assertThrows(RuntimeException.class,()->{
           categoryService.create();
        });
    }

    @Test
    void failed() {
        assertThrows(RuntimeException.class,()->{
            categoryService.test();
        });
    }

    @Test
    void programatic() {
        assertThrows(RuntimeException.class,()->{
            categoryService.createCategory();
        });
    }

    @Test
    void manual() {
        assertThrows(RuntimeException.class,()->{
            categoryService.manual();
        });
    }
}