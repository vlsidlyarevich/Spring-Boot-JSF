### Spring Boot base for JSF projects

#### Building

To build and run the app you only need to run the [Application.java](https://github.com/vlsidlyarevich/SpringBoot-JSF/blob/master/src/main/java/com/github/vlsidlyarevich/spring/boot/jsf/Application.java)<br/>

---

#### Explanation
[Spring Boot](http://projects.spring.io/spring-boot/) will do the rest of the work. `@EnableAutoConfiguration` enables scanning classpath for components and beans that are matching various conditions. Those beans can contain some configuration.<br/>
`AutoConfiguration` classes are typically annotated with `@Configuration`. We can take out our `ServletRegistrationBean` to class annotated with `@Configuration` and it will work. The other oportunity is to place it inside `@SpringBootApplication` annotated class.



