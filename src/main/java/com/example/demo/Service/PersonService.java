package com.example.demo.Service;

import com.example.demo.Dao.PersonDAO;
import com.example.demo.Model.Person;

public class PersonService {

    private final PersonDAO personDAO;

    public PersonService(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public int addPerson(Person person) {
        return personDAO.insertPerson(person);
    }
}
