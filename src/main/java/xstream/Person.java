package xstream;

class Person//JavaBean实体类
{
	private String name;
	private int age;
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString()
	{
		return "Person [name=" + name + ", age=" + age + "]";
	}
}