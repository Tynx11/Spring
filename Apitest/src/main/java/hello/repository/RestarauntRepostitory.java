package hello.repository;

import hello.model.Restaraunt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestarauntRepostitory extends JpaRepository<Restaraunt, Long> {

    Restaraunt findRestarauntById(Long id);




}
