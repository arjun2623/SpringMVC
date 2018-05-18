package trng.spring.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validateBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public class CourseCode {
	public String value() default "DEF";
	public String message() default "should start with DEF"
	public Class<?>[] groups() default{};
	public Class<? extends Payload>[] payload() default {};
}
