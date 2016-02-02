package VirtualPetState;

import VirtualPet.Tamagotchi;
import VirtualPetExceptions.DeathTamagotchiException;

public class Dead extends TState {

	@Override
	public void awake(Tamagotchi aTamagotchi) {
		System.out.println("The Tamagotchi" + aTamagotchi.getName() + "can't awake anymore, it's dead");		
	}

	@Override
	public void doExercise(Tamagotchi aTamagotchi) {
		System.out.println("The Tamagotchi" + aTamagotchi.getName() + "can't do any exercise because it's dead");
	}

	@Override
	public void feed(Tamagotchi aTamagotchi) throws DeathTamagotchiException {
		System.out.println("The Tamagotchi" + aTamagotchi.getName() + "can't eat because it's dead");
	}
}
