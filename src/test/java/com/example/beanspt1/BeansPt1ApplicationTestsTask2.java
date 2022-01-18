package com.example.beanspt1;

import com.example.beanspt1.task2.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BeansPt1ApplicationTestsTask2 {

  private static final String NAME_1 = "Iaskara Pimentel";
  private static final String NAME_2 = "Tania Pimentel";

  @Autowired
  ApplicationContext applicationContext;

  @Test
  void contextLoads() {
  }

  @Test
  public void givenSingleton_whenSetName_thenEqualNames(){

    final Person person1 = (Person)applicationContext.getBean(Person.class);
    final Person person2 = (Person)applicationContext.getBean(Person.class);

    person1.setName(NAME_1);
    assertEquals(NAME_1, person2.getName());

    person2.setName(NAME_2);

    assertEquals(NAME_2, person1.getName());
    System.out.println(person1.getName());
    System.out.println(person2.getName());

  }

  @Test
  public void givenPrototype_whenSetName_thenEqualNames(){

    Person person1 = applicationContext.getBean("getPersonWithAnotherScope" ,Person.class);
    Person person2 = applicationContext.getBean("getPersonWithAnotherScope" ,Person.class);

    person1.setName(NAME_1);
    assertEquals(NAME_1, person1.getName());

    person2.setName(NAME_2);
    assertEquals(NAME_2, person2.getName());

  }


  }
