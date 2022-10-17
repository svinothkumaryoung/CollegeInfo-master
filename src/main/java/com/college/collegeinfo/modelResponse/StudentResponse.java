package com.college.collegeinfo.modelResponse;

import com.college.collegeinfo.model.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class StudentResponse {

    private Student studentResponseData;

}
