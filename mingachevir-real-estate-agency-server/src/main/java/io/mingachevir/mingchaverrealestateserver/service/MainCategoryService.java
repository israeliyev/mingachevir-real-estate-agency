package io.mingachevir.mingchaverrealestateserver.service;

import io.mingachevir.mingchaverrealestateserver.model.entity.MainCategory;

import java.util.List;

public interface MainCategoryService {
    List<MainCategory> findByEnabledIsTrueAndIsDeletedFalse();
}
