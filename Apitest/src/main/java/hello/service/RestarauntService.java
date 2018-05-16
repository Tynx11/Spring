package hello.service;

import hello.model.Restaraunt;

import java.util.List;

public interface RestarauntService {

    List<Restaraunt> getAllRestaraunts ();

    Restaraunt getRestarauntById (Long id);





}
