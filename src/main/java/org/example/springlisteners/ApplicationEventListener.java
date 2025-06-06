package org.example.springlisteners;

import org.springframework.boot.context.event.*;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


@Component
class ApplicationEventListener {

    @EventListener
    public void on(SpringApplicationEvent event) {
        System.out.println("**********************************");
        System.out.println(event.getClass().getSimpleName() + " is caught by @EventListener");
        System.out.println("**********************************");
    }
    // This event can't be caught this way:
    @EventListener
    public void on(ApplicationStartingEvent event) {
        System.out.println("**********************************");
        System.out.println("ApplicationStartingEvent");
        System.out.println("**********************************");
    }
    // This event can't be caught this way:
    @EventListener
    public void on(ApplicationEnvironmentPreparedEvent event) {
        System.out.println("**********************************");
        System.out.println("ApplicationEnvironmentPreparedEvent");
        System.out.println("**********************************");
    }
    // This event can't be caught this way:
    @EventListener
        public void on(ApplicationContextInitializedEvent event) {
        System.out.println("**********************************");
        System.out.println("ApplicationContextInitializedEvent");
        System.out.println("**********************************");
    }
    // This event can't be caught this way:
    @EventListener
    public void on(ApplicationPreparedEvent event) {
        System.out.println("**********************************");
        System.out.println("ApplicationPreparedEvent");
        System.out.println("**********************************");
    }
}
