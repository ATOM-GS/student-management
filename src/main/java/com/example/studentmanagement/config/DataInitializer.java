package com.example.studentmanagement.config;
import com.example.studentmanagement.entity.Student; import com.example.studentmanagement.repository.StudentRepository; import org.springframework.boot.CommandLineRunner; import org.springframework.context.annotation.*;
@Configuration public class DataInitializer { @Bean CommandLineRunner seed(StudentRepository r){return args->{if(r.count()==0){r.save(new Student("Aarav Sharma","aarav@example.com","BCA",20));r.save(new Student("Priya Patil","priya@example.com","MCA",22));}};} }
