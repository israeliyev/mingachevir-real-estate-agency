package io.mingachevir.mingchaverrealestateserver.model.entity;

import io.mingachevir.mingchaverrealestateserver.model.entity.base.BaseAuditEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "parameter")
public class Parameter extends BaseAuditEntity {
    private String code;
    private String name;

    @ManyToOne
    @JoinColumn(name = "sub_category_id", referencedColumnName = "id")
    private SubCategory subCategory;

    @OneToMany(mappedBy = "parameter")
    private List<SelectiveParameter> selectiveParameters;

    @OneToMany(mappedBy = "parameter")
    private List<InputParameter> inputParameters;
}
