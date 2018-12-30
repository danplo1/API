package pl.danplo.api;

import java.util.List;

/**
 * Created by Daniel_D'AGE on 30.12.2018.
 */
public interface StudentDao {

    void addStudent (Student student);
    List<Student> findAll();

}
