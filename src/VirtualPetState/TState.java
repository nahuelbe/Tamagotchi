package VirtualPetState;

import VirtualPet.Tamagotchi;
import VirtualPetExceptions.DeathTamagotchiException;

public abstract class TState {
	public abstract void awake(Tamagotchi aTamagotchi);
	public abstract void doExercise(Tamagotchi aTamagotchi);
	public abstract void feed(Tamagotchi aTamagotchi) throws DeathTamagotchiException;
}
