package al.recipes.rest.controllers;

import al.recipes.models.Tags;
import al.recipes.services.TagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TagControllerRest {

    @Autowired
    TagsService tagsService;

    @GetMapping("/tags")
    public List<Tags> getRandomTags() {
        return tagsService.findRandomTags();
    }
}