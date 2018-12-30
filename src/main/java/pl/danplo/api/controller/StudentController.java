package pl.danplo.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.danplo.api.Student;
import pl.danplo.api.StudentDao;

import java.util.List;

/**
 * Created by Daniel_D'AGE on 30.12.2018.
 */
@RequestMapping("/api/students")
@RestController
public class StudentController {


    /* Autowired szuka klasy, która implementuje interfejs StudenDao
        oraz ma adnotacje Component
    */
    @Autowired
    private StudentDao studentDao;

    //StudentDao = new StudentDaoImpl


    @GetMapping("")
    public List<Student>findAll(){
        return studentDao.findAll();
    }

    @PostMapping("")
    public Student add(@ModelAttribute Student student){
        studentDao.addStudent(student);
        return student;

    }

}
