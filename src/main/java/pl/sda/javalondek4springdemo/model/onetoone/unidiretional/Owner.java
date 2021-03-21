package pl.sda.javalondek4springdemo.model.onetoone.unidiretional;

import org.springframework.context.annotation.Profile;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

// Columns in db:
// ID, FIRST_NAME, LAST_NAME
// no CAT column!!!
@Entity(name = "OwnerUnidirectional")
@Table(name = "OWNERS")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long identifier;

    private String firstName;

    private String lastName;

    private Cat cat;

    public Owner() {
    }

    public Long getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Long id) {
        this.identifier = id;
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

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
