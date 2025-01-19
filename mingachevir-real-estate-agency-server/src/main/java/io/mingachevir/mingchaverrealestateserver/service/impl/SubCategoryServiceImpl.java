package io.mingachevir.mingchaverrealestateserver.service.impl;

import io.mingachevir.mingchaverrealestateserver.model.entity.SubCategory;
import io.mingachevir.mingchaverrealestateserver.repository.SubCategoryJpaRepository;
import io.mingachevir.mingchaverrealestateserver.service.SubCategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class SubCategoryServiceImpl implements SubCategoryService {

    private final SubCategoryJpaRepository subCategoryJpaRepository;

    @Override
    public List<SubCategory> findAllByEnabledIsTrueAndIsDeletedIsFalse() {
        return subCategoryJpaRepository.findAllByEnabledIsTrueAndIsDeletedIsFalse();

    }
}
