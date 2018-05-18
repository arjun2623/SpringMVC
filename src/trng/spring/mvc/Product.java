package trng.spring.mvc;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class Product {
	private String pName;
	private String pDescription;
	private int price;
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpDescription() {
		return pDescription;
	}
	public void setpDescription(String pDescription) {
		this.pDescription = pDescription;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
