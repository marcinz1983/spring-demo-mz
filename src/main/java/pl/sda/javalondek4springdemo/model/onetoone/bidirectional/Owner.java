package pl.sda.javalondek4springdemo.model.onetoone.bidirectional;

import org.springframework.context.annotation.Profile;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
// Columns in db:
// ID, FIRST_NAME, LAST_NAME
// no CAT column!!!
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long identifier;

    private String firstName;

    private String lastName;

    // mappedBy is necessary to create foreign key in CAT table which refers to primary key of OWNER table
    @OneToOne(cascade = CascadeType.PERSIST, mappedBy = "owner")
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
