package VirtualPetState;

import VirtualPet.Tamagotchi;

public class Asleep extends Alive {
	
	public Asleep(Tamagotchi aTamagotchi){
		aTamagotchi.restoreSleepEnergy();
		aTamagotchi.setExerciseLevel(0);
	}

	@Override
	public void awake(Tamagotchi aTamagotchi) {
		aTamagotchi.setCurrentState(new Alive());		
		System.out.println("The Tamagotchi " + aTamagotchi.getName() + " se despertó.");
	}

	@Override
	public void doExercise(Tamagotchi unTamagotchi) {
		System.out.println("El tamagochi está dormido, no puede ejercitar.");
	}

}
