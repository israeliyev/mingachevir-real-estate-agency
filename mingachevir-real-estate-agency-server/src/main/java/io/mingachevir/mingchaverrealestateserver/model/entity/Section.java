package io.mingachevir.mingchaverrealestateserver.model.entity;

import io.mingachevir.mingchaverrealestateserver.model.entity.base.BaseAuditEntity;
import io.mingachevir.mingchaverrealestateserver.util.PageEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@RequiredArgsConstructor
@Table(name = "section")
public class Section extends BaseAuditEntity {
    private static final long serialVersionUID = -8279504403798074772L;

    @Column(name = "page")
    private PageEnum page;

    @ManyToMany
    @JoinTable(
            name = "house_section",
            joinColumns = {@JoinColumn(name = "section_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "house_id", referencedColumnName = "id")}
    )
    private Set<House> houses = new HashSet<>();
}
