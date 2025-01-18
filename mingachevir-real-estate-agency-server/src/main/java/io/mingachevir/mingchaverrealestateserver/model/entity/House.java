package io.mingachevir.mingchaverrealestateserver.model.entity;

import io.mingachevir.mingchaverrealestateserver.model.entity.base.BaseAuditEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "house")
public class House extends BaseAuditEntity {
    private String name;

    @OneToMany(mappedBy = "house")
    private List<HouseImage> houseImages;

    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(name = "house_selective_parameter",
            joinColumns = {@JoinColumn(name = "house_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "selective_parameter_id", referencedColumnName = "id")})
    private Set<HouseSelectiveParameter> houseSelectiveParameters = new HashSet<>();

    @OneToMany(mappedBy = "house")
    private List<HouseInputParameter> houseInputParameters;
}
