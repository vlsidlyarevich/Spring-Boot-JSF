package com.github.vlsidlyarevich.spring.boot.jsf;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

/**
 * Created by vlad on 12.09.16.
 */
@Component
@ManagedBean
@RequestScoped
public class HelloBean implements Serializable {

    private String hello;

    @PostConstruct
    public void init() {
        this.hello = "Hello world!";
    }

    public HelloBean() {

    }

    public HelloBean(String hello) {
        this.hello = hello;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
