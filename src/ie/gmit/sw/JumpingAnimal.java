package ie.gmit.sw;

import ie.gmit.sw.Jumper;

public class JumpingAnimal extends Animal implements Jumper{

	@Override
	public int eat() {
		System.out.println("Eating like a Person....");
		
		return super.eat() + 21;
	
	}

	@Override
	public void jump() {
		System.out.println("Jumping like a " + this.getClass().getSimpleName());
		
	}

}
