package SpringBoot.SpringDataJPA.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee 
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "first_name")
    private String name1;
    
    @Column(name = "last_name")
    private String name2;
    
    @Column(name = "email")
    private String string;

    String nonused ;
    
    int nonused2;
    
    public Employee() {
    }

    public Employee(String a, String b, String c) {
        this.name1 = a;
        this.name2 = b;
        this.string = c;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return name1;
    }

    public void setFirstName(String firstName) {
        this.name1 = firstName;
    }

    public String getLastName() {
        return name2;
    }

    public void setLastName(String lastName) {
        this.name2 = lastName;
    }

    public String getEmail() {
        return string;
    }

    public void setEmail(String email) {
        this.string = email;
    }

   
    
}
