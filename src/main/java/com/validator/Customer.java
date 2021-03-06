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

    @Email(message = "must contain correct address")
    private String email;

    @CourseCode
    private String courseCode;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

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
