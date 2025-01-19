package io.mingachevir.mingchaverrealestateserver.service.impl;

import io.mingachevir.mingchaverrealestateserver.model.entity.MainCategory;
import io.mingachevir.mingchaverrealestateserver.repository.MainCategoryJpaRespository;
import io.mingachevir.mingchaverrealestateserver.service.MainCategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class MainCategoryServiceImpl implements MainCategoryService {
    private final MainCategoryJpaRespository mainCategoryJpaRespository;

    @Override
    public List<MainCategory> findByEnabledIsTrueAndIsDeletedFalse() {
        return mainCategoryJpaRespository.findByEnabledIsTrueAndIsDeletedFalse();
    }
}
