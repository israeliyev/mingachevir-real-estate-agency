package io.mingachevir.mingchaverrealestateserver.model.entity;

import io.mingachevir.mingchaverrealestateserver.model.entity.base.BaseAuditEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;
import jakarta.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "user_token")
public class UserToken extends BaseAuditEntity {
    private String token;

    @Column(name = "issued_date")
    private LocalDateTime issuedDate;

    @Column(name = "expire_date")
    private LocalDateTime expireDate;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Users user;
}
