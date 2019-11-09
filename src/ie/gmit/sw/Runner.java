package ie.gmit.sw;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import ie.gmit.sw.Animal;
import ie.gmit.sw.JumpingAnimal;
import ie.gmit.sw.Kangaroo;
import ie.gmit.sw.RaceHorse;

public class Runner {
		
	public static void main(String[] args) {
		Kangaroo k = new Kangaroo();
		System.out.println(k.eat());
		
		JumpingAnimal ja = k;
		System.out.println(ja.eat());
		
		ja = new RaceHorse();
		System.out.println(ja.eat());
		
		Jumper j = k;
		j.jump();
	}
	
	public static void execute(Collection<Jumper> c) {
		AbstractCollection<Jumper> ac = (AbstractCollection<Jumper>) c;
		ac.add(()->System.out.println("Leaping like a salmon..."));
		for (Jumper j : c) {
			Kangaroo k = (Kangaroo)j;
			k.move();
		}
	}
	
}