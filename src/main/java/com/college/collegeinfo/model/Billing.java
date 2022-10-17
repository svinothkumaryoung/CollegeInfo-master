package com.college.collegeinfo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
@Table(name="billing")
public class Billing {
    @Id
    private int id;
    private String description;
    private String collectedBy;
}
