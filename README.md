### Spring Boot base for JSF projects
There i have tried to explain (and understand to myself) how to run Spring Boot based applications with JSF. It is just my point of view, of course i can make (and i think i have made) mistakes. Any advices are welcome.

#### Building

To build and run the app you only need to run the [Application.java](https://github.com/vlsidlyarevich/SpringBoot-JSF/blob/master/src/main/java/com/github/vlsidlyarevich/spring/boot/jsf/Application.java)<br/>

---

#### Explanation
[Spring Boot](http://projects.spring.io/spring-boot/) will do the rest of the work. `@EnableAutoConfiguration` enables scanning classpath for components and beans that are matching various conditions. Those beans can contain some configuration.<br/>
`AutoConfiguration` classes are typically annotated with `@Configuration`. We can take out our `ServletRegistrationBean` to class annotated with `@Configuration` and it will work. The other oportunity is to place it inside `@SpringBootApplication` annotated with `@Bean` method that returns `ServletRegistrationBean`.</br>
As the [Spring reference](http://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/context/embedded/ServletRegistrationBean.html) says: "A ServletContextInitializer to register Servlets in a Servlet 3.0+ container. Similar to the registration features provided by ServletContext but with a Spring Bean friendly design". Via this we can register `FacesServlet` manualy. It is the core of all JSF applications, we create it and map it to `*.xhtml` files.



