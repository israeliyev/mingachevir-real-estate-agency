package io.mingachevir.mingchaverrealestateserver.model.entity;

import io.mingachevir.mingchaverrealestateserver.model.entity.base.BaseAuditEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "input_parameter")
public class InputParameter extends BaseAuditEntity {
    private String code;
    private String name;

    @ManyToOne
    @JoinColumn(name = "parameter_id", referencedColumnName = "id")
    private Parameter parameter;

    @ManyToOne
    @JoinColumn(name = "parameter_type_id", referencedColumnName = "id")
    private ParameterType parameterType;
}
