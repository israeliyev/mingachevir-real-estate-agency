package io.mingachevir.mingchaverrealestateserver.model.entity;

import io.mingachevir.mingchaverrealestateserver.model.entity.base.BaseAuditEntity;
import jakarta.persistence.Entity;
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
@Table(name = "parameter_type")
public class ParameterType extends BaseAuditEntity {
    private String code;
    private String name;

    @OneToMany(mappedBy = "parameterType")
    private List<SelectiveParameter> selectiveParameters;

    @OneToMany(mappedBy = "parameterType")
    private List<InputParameter> inputParameters;
}
