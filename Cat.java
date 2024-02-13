import java.io.Serializable;

public class Cat implements Serializable{

	private String name;
	private int age;
	private int weight;
	
	
	public Cat(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}


	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	
	
	
}


