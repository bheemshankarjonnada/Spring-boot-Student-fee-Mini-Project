package com.example.Spring_First_Application.Repository;


import com.example.Spring_First_Application.Model.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {
    public String SaveStudents(Student student){
        return "Student Name "+student.getName()+" (Age"+student.getAge()+") Repository Saved";

    }
}
