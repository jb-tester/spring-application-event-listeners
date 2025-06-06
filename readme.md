# Generate Event Listener

since the following events of SpringApplicationEvent type:
`ApplicationStartingEvent`
`ApplicationEnvironmentPreparedEvent`
`ApplicationContextInitializedEvent`
`ApplicationPreparedEvent`
are triggered before the ApplicationContext is created, 
we cannot register the listeners on those as beans. 
The listeners that handle these events should be registered 
as `org.springframework.context.ApplicationListener` in the `spring.factories`, 
or added to the application programmatically.

Thus, we should not suggest these event types in the Generate / EventListener... popup. 
Also, we can show warnings for the `@EventListener`-annotated methods with parameters of
these events types.