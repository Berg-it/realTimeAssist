package tn.bergit.realtime.dto;

import java.io.Serializable;
/**
 * 
 * @author ABG
 *
 */
public class TestDTO implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2088990903803414320L;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "TestDTO [name=" + name + "]";
	}
	
	
	
	
}
