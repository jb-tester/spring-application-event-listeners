package org.example.springlisteners;

import org.springframework.boot.context.event.SpringApplicationEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class RegisteredEventListener implements ApplicationListener<SpringApplicationEvent> {

  @Override
  public void onApplicationEvent(SpringApplicationEvent event) {

    System.out.println("**********************************");
    System.out.println(event.getClass().getSimpleName() + " is caught by listener registered in spring.factories");
    System.out.println("**********************************");;
    
  }

}