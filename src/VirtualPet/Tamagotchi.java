package VirtualPet;

import java.util.Random;

import VirtualPetExceptions.DeathTamagotchiException;
import VirtualPetState.*;

public class Tamagotchi {
	String name;
	Integer energyLevel = 100, feedLevel = 0, exerciseLevel = 0;
	TState currentState = new Alive();
	
	public Tamagotchi(String aName){
		this.name = aName;
	}
	
	public void doAction() throws DeathTamagotchiException{
		energyLevel-= new Random().nextInt(100);
		if(energyLevel <= 0)
			throw new DeathTamagotchiException();
	}
	
	public void sleep(){
		currentState = new Asleep(this);
	}
	
	public void awake(){
		currentState.awake(this);
	}
	
	public void setCurrentState(TState currentState) {
		this.currentState = currentState;
	}
	
	public void doExercise(){
		currentState.doExercise(this);
	}
	
	public void setExerciseLevel(int aNumber){
		this.exerciseLevel = aNumber;
	}
	
	public int getExerciseLevel(){
		return exerciseLevel;
	}
	
	public void restoreSleepEnergy(){
		energyLevel+=(energyLevel*25)/100;
		energyLevel = Math.min(energyLevel, 100);
	}
	
	public void feed(){
		try{
			currentState.feed(this);
		} catch (DeathTamagotchiException ex) {
			System.out.println("The Tamagotchi" + this.getName() + "has dead because of indigestion");
		}
	}

	public String getName() {
		return name;
	}
	
	public int getFeedLevel(){
		return feedLevel;
	}

	public void setFeedLevel(int aNumber) {
		feedLevel = aNumber;
	}
}
