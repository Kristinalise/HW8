public abstract class Animal {
	
	private String name;
	
	public Animal(String theName) {
		name = theName;
	}
	
	public void sayHi() {
		System.out.println("Howdy, my name is " + name + "!");
	}
	
	public abstract void eat();
	public abstract void move();

}
