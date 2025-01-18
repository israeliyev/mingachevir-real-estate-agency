package io.mingachevir.mingchaverrealestateserver.repository;

import io.mingachevir.mingchaverrealestateserver.model.entity.MainCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MainCategoryJpaRespository extends JpaRepository<MainCategory, Long> {
    List<MainCategory> findByEnabledIsTrueAndIsDeletedFalse();
}
