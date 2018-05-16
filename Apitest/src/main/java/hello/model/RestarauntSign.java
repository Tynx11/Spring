package hello.model;

import javax.persistence.*;
import java.nio.file.Files;
import java.util.ArrayList;

@Entity
@Table (name = "RestarauntsSigns")
public class RestarauntSign {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private ArrayList<Files> signs;
}
