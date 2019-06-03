package entity;

public class BeanFactory {
	//¾²Ì¬·½·¨
	public Person getPerson() {
		System.out.println("---------new Person-----");
		return new Person();
	}

}
