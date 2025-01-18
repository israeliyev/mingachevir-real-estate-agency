package io.mingachevir.mingchaverrealestateserver.model.entity;

import io.mingachevir.mingchaverrealestateserver.model.entity.base.BaseAuditEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class Users extends BaseAuditEntity {
    private String firstName;
    private String lastName;
    @Email
    private String email;
    private String password;

    @Column(name = "last_successful_login_date")
    private LocalDateTime lastSuccessfulLoginDate;

    @Column(name = "last_unsuccessful_login_date")
    private LocalDateTime lastUnsuccessfulLoginDate;

    private int maxTokenCount;

    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private Role role;

    @OneToMany(mappedBy = "user")
    private List<UserToken> userTokens;
}
