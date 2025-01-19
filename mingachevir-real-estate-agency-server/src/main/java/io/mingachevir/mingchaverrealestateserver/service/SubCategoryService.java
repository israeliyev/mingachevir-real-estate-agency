package io.mingachevir.mingchaverrealestateserver.service;

import io.mingachevir.mingchaverrealestateserver.model.entity.SubCategory;

import java.util.List;

public interface SubCategoryService {
    List<SubCategory> findAllByEnabledIsTrueAndIsDeletedIsFalse();
}
