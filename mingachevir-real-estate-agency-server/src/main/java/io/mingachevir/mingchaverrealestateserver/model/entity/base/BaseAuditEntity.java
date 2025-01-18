package io.mingachevir.mingchaverrealestateserver.model.entity.base;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseAuditEntity extends BaseEntity {

    @CreationTimestamp
    protected Date createDate;

    @UpdateTimestamp
    protected Date updateDate;

    @PrePersist
    void prePersist() {
    }

    @PreUpdate
    void preUpdate() {
    }

}
