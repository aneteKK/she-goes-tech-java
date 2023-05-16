package com.sda.she_likes_java.collections;
import java.util.List;
import java.util.ArrayList;
public class ExampleFindPerson {

    public static List<Person> findPersonsByName(List<Person> persons, String nameToFind) {
        // create empty result
        List<Person> result = new ArrayList<>();

        // iterate the list
        for (Person person : persons) {
            // if person has proper name add it to the result
            if (person.getName().equals(nameToFind)) {
                result.add(person);
            }
        }

        // return result
        return result;
    }
}
