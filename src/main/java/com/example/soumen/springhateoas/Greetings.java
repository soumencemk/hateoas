package com.example.soumen.springhateoas;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.hateoas.ResourceSupport;

/**
 * @author Soumen Karmakar
 * 10/11/2018
 */
public class Greetings extends ResourceSupport {
    private final String content;

    @JsonCreator
    public Greetings(@JsonProperty("content") String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
