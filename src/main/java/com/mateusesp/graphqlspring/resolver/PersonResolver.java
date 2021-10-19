package com.mateusesp.graphqlspring.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.mateusesp.graphqlspring.input.PersonInput;
import com.mateusesp.graphqlspring.model.Person;
import com.mateusesp.graphqlspring.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class PersonResolver implements GraphQLQueryResolver, GraphQLMutationResolver {

    @Autowired
    private PersonRepository repository;

    public Collection<Person> findAllPeople() {
        return repository.findAll();
    }

    public Person savePerson(PersonInput input) {
        return repository.save(new Person(input.getName(), input.getAge(), input.getGender()));
    }
}
