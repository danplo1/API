package pl.danplo.api;

/**
 * Created by Daniel_D'AGE on 30.12.2018.
 */
public class Student {

    private String firstName;
    private String lastName;

    public Student (){}

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
