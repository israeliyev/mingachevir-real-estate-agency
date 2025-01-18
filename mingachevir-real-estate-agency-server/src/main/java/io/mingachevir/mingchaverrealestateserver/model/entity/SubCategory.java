package io.mingachevir.mingchaverrealestateserver.model.entity;

import io.mingachevir.mingchaverrealestateserver.model.entity.base.BaseAuditEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "sub_category")
public class SubCategory extends BaseAuditEntity {
    private String code;
    private String name;

    @ManyToOne
    @JoinColumn(name = "main_category_id", referencedColumnName = "id")
    private MainCategory mainCategory;

    @OneToMany(mappedBy = "subCategory")
    private List<Parameter> parameters;
}
