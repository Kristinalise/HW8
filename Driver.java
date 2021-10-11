public class Driver {

	public static void main(String[] args) {
		
		Dog fido = new Dog("Fido");
		Dog figo = new Dog("Figo");
		Dog fibo = new Dog("Fibo");
		
		Snake sidney = new Snake("Hissing Sidney");
		Snake slither = new Snake("Slither");
		
		Animal[] arr = new Animal[5];
		arr[0] = fido;
		arr[1] = figo;
		arr[2] = fibo;
		arr[3] = sidney;
		arr[4] = slither;
		
		for(Animal a : arr) {
			a.sayHi();
			a.eat();
			a.move();
			if(a instanceof Mammal) {
				((Mammal)a).giveBirth();
				((Mammal)a).takeTemp();
			}else {
				((Reptile)a).layEggs();
				((Reptile)a).regulateTemp();
			}
			System.out.println();
		}
		

	}

}
