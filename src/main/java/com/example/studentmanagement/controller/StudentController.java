package com.example.studentmanagement.controller;
import com.example.studentmanagement.entity.Student; import com.example.studentmanagement.service.StudentService; import jakarta.validation.Valid; import org.springframework.http.HttpStatus; import org.springframework.web.bind.annotation.*; import java.util.List;
@RestController
@RequestMapping("/api/students")
@CrossOrigin
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService s){
        service=s;
    }

    @GetMapping
    public List<Student> all(){return service.all();}

    @GetMapping("/{id}")
    public Student one(@PathVariable Long id) {
        return service.one(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Student create(@Valid @RequestBody Student s) {
        return service.create(s);
    }

    @PutMapping("/{id}")
    public Student update(@PathVariable Long id,@Valid @RequestBody Student s) {
        return service.update(id,s);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
