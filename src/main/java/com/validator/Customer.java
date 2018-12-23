package com.validator;


import javax.validation.constraints.*;

public class Customer {

    @NotNull
    @Size(min = 2, message = "must be greater than 2")
    private String firstName;

    private String lastName;

    @NotNull(message = "is required")
    @Min(value = 0, message = "must be greater then 0")
    @Max(value = 10, message = "must be less then 10")
    private Integer cost;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
    private String email;

    public Customer() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
