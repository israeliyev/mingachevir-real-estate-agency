package io.mingachevir.mingchaverrealestateserver.repository;

import io.mingachevir.mingchaverrealestateserver.model.entity.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubCategoryJpaRepository extends JpaRepository<SubCategory, Long> {
    List<SubCategory> findAllByEnabledIsTrueAndIsDeletedIsFalse();
}
