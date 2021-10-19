package com.mateusesp.graphqlspring.input;

import com.mateusesp.graphqlspring.model.Gender;
import graphql.schema.GraphQLInputType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonInput implements GraphQLInputType {
    @Override
    public String getName() {
        return null;
    }

    private String name;
    private Integer age;
    private Gender gender;
}
