package com.turnyur.restcrud.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SpringQuote extends Quote {

    private String type;
    private Value value;

    public SpringQuote() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SpringQuote{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}