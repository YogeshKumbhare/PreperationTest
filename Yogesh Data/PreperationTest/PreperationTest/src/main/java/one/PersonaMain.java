package one;

import java.util.*;

public class PersonaMain {


        public static void main(String[] args) {
            List<Person> persons = new ArrayList<>();
            persons.add(new Person("tarun", 28));
            persons.add(new Person("arun", 29));
            persons.add(new Person("varun", 12));
            persons.add(new Person("arun", 22));

//            Collections.sort(persons, new Comparator<Person>() {
//
//                @Override
//                public int compare(Person t, Person t1) {
//                    return t.getAge() - t1.getAge();
//                }
//            });

            Collections.sort(persons, Comparator.comparing(Person::getFname)
                    .thenComparingInt(Person::getAge).reversed());
            System.out.println(persons);

        }


}
