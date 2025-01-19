package io.mingachevir.mingchaverrealestateserver.controller;

import io.mingachevir.mingchaverrealestateserver.model.entity.MainCategory;
import io.mingachevir.mingchaverrealestateserver.service.MainCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MainCategoryController {
    private final MainCategoryService mainCategoryService;

    @GetMapping("/categories")
    public List<MainCategory> getSalesmanWarehouse() {
        return mainCategoryService.findByEnabledIsTrueAndIsDeletedFalse();
    }

}
