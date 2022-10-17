package com.college.collegeinfo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="student_registeration")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String dept;
    private String batchCode;

    @OneToMany(cascade = CascadeType.ALL,
            targetEntity = Billing.class,
            fetch = FetchType.EAGER)
    @JoinColumn(name="foreignKeyRef",referencedColumnName = "id")
    private List<Billing> billing;

}
