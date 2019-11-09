package ie.gmit.sw;

public class RaceHorse extends JumpingAnimal{
	
	@Override
	public void jump() {
		super.jump();
		System.out.println("Jumping like a " + this.getClass().getSimpleName());
		
	}
	
	public void gallop() {
		System.out.println("Galloping like a " + this.getClass().getSimpleName());
		
	}	
}