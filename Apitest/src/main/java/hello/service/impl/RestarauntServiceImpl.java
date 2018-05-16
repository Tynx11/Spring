package hello.service.impl;

import hello.model.Restaraunt;
import hello.repository.RestarauntRepostitory;
import hello.service.RestarauntService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RestarauntServiceImpl implements RestarauntService {

    @Autowired
    RestarauntRepostitory repostitory;

    @Override
    public List<Restaraunt> getAllRestaraunts() {
        return repostitory.findAll();
    }

    @Override
    public Restaraunt getRestarauntById(Long id) {
        return repostitory.findRestarauntById(id);
    }
}
