package com.example.beanspt1.task1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class MyBean implements ApplicationContextAware {

//  So create a field in your class of type ApplicationContext and set its value using this method.
//  Go ahead and also create a get method for the ApplicationContext! So we can use it using our bean.
  private ApplicationContext applicationContext;

  public ApplicationContext getApplicationContext(){
    return applicationContext;
  }

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.applicationContext = applicationContext;
  }
}
