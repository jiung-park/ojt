package com.tmax.ai.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "test")
public class Test {

    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column
    private String username;

    @Column
    private String testLog;

    @Column
    private Boolean isCorrect; // native type 으로 했을 때 에러가 생기는 이유? boolean vs Boolean

    public Test(String username, String testLog, Boolean isCorrect) {
        this.username = username;
        this.testLog = testLog;
        this.isCorrect = isCorrect;
    }

}
