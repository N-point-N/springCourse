package com.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidation implements ConstraintValidator<CourseCode, String> {


    private String prefix;

    public void initialize(CourseCode constraintAnnotation) {
        prefix = constraintAnnotation.value();
    }

    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        boolean result = true;

        if (s != null) {
            result = s.startsWith(prefix);
        }
        return result;
    }
}
