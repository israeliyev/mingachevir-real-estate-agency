package io.mingachevir.mingchaverrealestateserver.model.entity;

import io.mingachevir.mingchaverrealestateserver.model.entity.base.BaseAuditEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "house_input_parameter")
public class HouseInputParameter extends BaseAuditEntity {
    @ManyToOne
    @JoinColumn(name = "house_id", referencedColumnName = "id")
    private House house;

    @ManyToOne
    @JoinColumn(name = "input_parameter_id", referencedColumnName = "id")
    private InputParameter inputParameter;
}
