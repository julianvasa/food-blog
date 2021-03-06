package al.recipes.rest.controllers;

import al.recipes.models.Categories;
import al.recipes.services.CategoriesService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryControllerRest {

    private static final int INITIAL_PAGE = 0;
    private static final int INITIAL_PAGE_SIZE = 20;
    private final CategoriesService categoriesService;

    public CategoryControllerRest(CategoriesService categoriesService) {
        this.categoriesService = categoriesService;
    }

    @GetMapping("/categories")
    @ApiOperation(value = "Get all categories", notes = "Retrieve all categories")
    public List<Categories> getAllCategories() {
        return categoriesService.findAll();
    }

}
