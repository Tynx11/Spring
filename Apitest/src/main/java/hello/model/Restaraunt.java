package hello.model;


import javax.persistence.*;
import java.io.File;

@Entity
@Table(name = "restaraunts")

public class Restaraunt {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private File photo;


    private String workingTimes;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public File getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
    }


    public String getWorkingTimes() {
        return workingTimes;
    }

    public void setWorkingTimes(String workingTimes) {
        this.workingTimes = workingTimes;
    }
}
