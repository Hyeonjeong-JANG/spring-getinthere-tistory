package com.example.getintheretistory.user;

import com.example.getintheretistory._core.OauthProvider;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_tb")
@Data
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    private String email;
    private OauthProvider oauthProvider; // NAVER, KAKAO, GOOGLE
    @CreatedDate
    private LocalDateTime createdAt;

    @Builder
    public User(Integer id, String username, String password, String email, OauthProvider oauthProvider) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.oauthProvider = oauthProvider;
    }
}
