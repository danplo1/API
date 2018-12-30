package pl.danplo.api;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel_D'AGE on 30.12.2018.
 */

@Component
public class StudentDaoImpl implements StudentDao {

    private static List<Student> studentList = new ArrayList<>();

    static {

        studentList.add(new Student("Tomek", "Iksiński"));
        studentList.add(new Student("Anna", "Kowalska"));
        studentList.add(new Student("Ewa", "Liskowska"));
        studentList.add(new Student("Maciej", "Mamrotowski"));
        studentList.add(new Student("Aleksandra", "Olowska"));
    }

    @Override
    public void addStudent(Student student){
        studentList.add(student);

    }

    @Override
    public List<Student>findAll(){
        return null;
    }

}
