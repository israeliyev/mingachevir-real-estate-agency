package io.mingachevir.mingchaverrealestateserver.model.entity;

import io.mingachevir.mingchaverrealestateserver.model.entity.base.BaseAuditEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "house_selective_parameter")
public class HouseSelectiveParameter extends BaseAuditEntity {

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "houseSelectiveParameters")
    private Set<House> houses = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "selective_parameter_id", referencedColumnName = "id")
    private SelectiveParameter selectiveParameter;
}
