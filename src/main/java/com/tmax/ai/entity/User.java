package com.tmax.ai.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@NoArgsConstructor // No default constructor for entity 에러 관련해서 추가
@Table(name = "user")
public class User {

    @Id
    @Column
    private String username;

    @Column
    private String password;

    public User(String username, String password){ // Builder 어노테이션 필요?
        this.username = username;
        this.password = password;
    }

}
