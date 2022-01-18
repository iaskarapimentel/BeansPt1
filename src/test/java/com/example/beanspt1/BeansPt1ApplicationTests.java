package com.example.beanspt1;

import com.example.beanspt1.task1.Bean1;
import com.example.beanspt1.task1.Bean2;
import com.example.beanspt1.task1.Bean3;
import com.example.beanspt1.task1.MyBean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BeansPt1ApplicationTests {

// @Autowired Tells the application context to inject an instance of MyBean here
  @Autowired
  private MyBean myBean;

  @Autowired
  private ApplicationContext applicationContext;

  @Test
  void contextLoads() {
  }

  @Test
  void appContextNotNull(ApplicationContext applicationContext) {
    Assertions.assertNotNull(myBean);
  }

  @Test
  void appContext_getByName(@Autowired Bean1 bean1){
    assertEquals(bean1.getClass(), Bean1.class);
  }

  @Test
  void appContext_getByType(@Autowired Bean2 bean2){
    Assertions.assertEquals(bean2, applicationContext.getBean(Bean2.class));
  }

  @Test
  void appContext_getByNameAndType(@Autowired Bean3 bean3) {
    Assertions.assertEquals(bean3, applicationContext.getBean("bean3",Bean3.class));
  }

}
