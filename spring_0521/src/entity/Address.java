package entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.oracle.webservices.internal.api.message.PropertySet.Property;

//相当于配置了<bean id="" class=""><bean>
@Component("address")
public class Address {
	//定义属性
	@Value("安徽")
	private String name;
	@Value("232212")
	private Integer number;
	//构造方法
	public Address() {
	}
	public Address(String name, Integer number) {
		super();
		this.name = name;
		this.number = number;
	}
	//
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	//
	@Override
	public String toString() {
		return "Address [name=" + name + ", number=" + number + "]";
	}
	
}
