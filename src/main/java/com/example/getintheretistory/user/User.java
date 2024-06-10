package com.example.getintheretistory.user;

import com.example.getintheretistory._core.OauthProvider;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "user_tb")
@Data
@RequiredArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    private String email;
    private OauthProvider oauthProvider; // NAVER, KAKAO, GOOGLE

    @Builder
    public User(Integer id, String username, String password, String email, OauthProvider oauthProvider) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.oauthProvider = oauthProvider;
    }
}
