package VirtualPetState;

import VirtualPet.Tamagotchi;
import VirtualPetExceptions.DeathTamagotchiException;

public class Alive extends TState {

	@Override
	public void awake(Tamagotchi aTamagotchi) {
		System.out.println("The Tamagotchi" + aTamagotchi.getName() + "was already awaken.");
	}

	@Override
	public void doExercise(Tamagotchi aTamagotchi) {
		try{
			aTamagotchi.doAction();
		}catch (DeathTamagotchiException ex){
			System.out.println("The Tamagotchi" + aTamagotchi.getName() + "has dead because he did too much exercise.");
		}

		aTamagotchi.setExerciseLevel(aTamagotchi.getExerciseLevel()+1);
		if(aTamagotchi.getExerciseLevel() == 4){
			aTamagotchi.setCurrentState(new Asleep(aTamagotchi));aTamagotchi.setExerciseLevel(0);
			System.out.println("The Tamagotchi" + aTamagotchi.getName() + "fell asleep because he did 4 exercises in a raw.");
		}
	}

	@Override
	public void feed(Tamagotchi aTamagotchi) throws DeathTamagotchiException {
		aTamagotchi.setFeedLevel(aTamagotchi.getFeedLevel()+1);
		if(aTamagotchi.getFeedLevel() == 5){
			aTamagotchi.setCurrentState(new Dead());
			throw new DeathTamagotchiException();
		}
	}

}
