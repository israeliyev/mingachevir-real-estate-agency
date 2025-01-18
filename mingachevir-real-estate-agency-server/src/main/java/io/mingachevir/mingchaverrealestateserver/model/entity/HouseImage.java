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
@Table(name = "house_image")
public class HouseImage extends BaseAuditEntity {
    private String path;
    private String fileName;

    @ManyToOne
    @JoinColumn(name = "house_id", referencedColumnName = "id")
    private House house;
}
