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
    private boolean isCorrect;

    public Test(String username, String testLog, boolean isCorrect) {
        this.username = username;
        this.testLog = testLog;
        this.isCorrect = isCorrect;
    }

}
