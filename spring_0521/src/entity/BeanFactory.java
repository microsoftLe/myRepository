package entity;

public class BeanFactory {
	//��̬����
	public Person getPerson() {
		System.out.println("---------new Person-----");
		return new Person();
	}

}
