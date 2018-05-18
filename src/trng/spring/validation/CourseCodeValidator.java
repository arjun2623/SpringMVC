package trng.spring.validation;

public class CourseCodeValidator implements ConstraintValidator<CourseCode, String>{
	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode code) {
		code = code.value();
	}
	
	@Override
	public boolean isValid(String code, ConstraintValidatorContext context) {
		boolean result;
		if(code!=null) {
			result = code.startsWith(coursePrefix);
		}else {
			result = true;
		}
		return result;
	}
}
