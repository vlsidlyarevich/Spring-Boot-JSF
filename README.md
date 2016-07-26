### Spring Boot base for JSF projects

#### Building

To build and run the app you only need to run the [Application.java](https://github.com/vlsidlyarevich/SpringBoot-JSF/blob/master/src/main/java/com/github/vlsidlyarevich/spring/boot/jsf/Application.java)<br/>
[Spring Boot](http://projects.spring.io/spring-boot/) will do the rest of the work. `@EnableAutoConfiguration` enables scanning classpath for components and beans that are matching various conditions. Those beans can contain some configuration, in our case it's `ServletRegistrationBean`.



