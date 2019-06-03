package entity;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("person")
public class Person implements Serializable{
	//定义属性
	@Value("张三")
	private String pname;
	@Autowired
	@Qualifier("address")
	private Address address;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	//
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", address=" + address + "]";
	}
	

}
