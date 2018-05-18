package trng.spring.mvc;

import java.util.LinkedHashMap;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.sun.istack.internal.NotNull;

public class Customer {
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String fname;
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String lname;
	

	@NotNull(message="is required")
	@Size(min=2, message="is required")
	private String state;
	private String country;
	
	@NotNull(message="is required")
	private String email;
	private LinkedHashMap<String, String> countries;
	
	@Pattern(regexp="^[0-9]{5}", message = "5 digits only")
	private String zipcode;
	
	public Customer() {
		super();
		countries = new LinkedHashMap<>();
		countries.put("IN", "India");
		countries.put("PK", "Pakistan");
		countries.put("EU", "Europe");
		countries.put("US", "United States");
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
