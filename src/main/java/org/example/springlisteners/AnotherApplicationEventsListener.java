package org.example.springlisteners;

import org.springframework.boot.context.event.SpringApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
class AnotherApplicationEventsListener implements ApplicationListener<SpringApplicationEvent> {

  @Override
  public void onApplicationEvent(SpringApplicationEvent event) {
    System.out.println("**********************************");
    System.out.println(event.getClass().getSimpleName()  + " is caught by ApplicationListener implementation");
    System.out.println("**********************************");
  }
}