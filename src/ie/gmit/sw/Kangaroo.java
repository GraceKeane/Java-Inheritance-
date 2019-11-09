package ie.gmit.sw;

public class Kangaroo extends JumpingAnimal{
	
	@Override
	public int eat() {
		System.out.println("Eating like a Kangaroo");
		return 7;
	}

	@Override
	public void jump() {
		System.out.println("Jumping like a " + this.getClass().getSimpleName());
		
	}
}
