package com.learnings.decorator;

interface ICharacter{
	String abilities();
}

class Mario implements ICharacter{

	@Override
	public String abilities() {
		return "Mario";	
	}
}

abstract class CharacterWithExtendedAbilities implements ICharacter{
	ICharacter character;
	public CharacterWithExtendedAbilities(ICharacter c) {
		this.character = c;
	}
}

class PowerUp extends CharacterWithExtendedAbilities{
	
	public PowerUp(ICharacter c) {
		super(c);
	}

	@Override
	public String abilities() {
		return character.abilities() + " Power up";
	}
}

class NewDress extends CharacterWithExtendedAbilities{
	public NewDress(ICharacter c) {
		super(c);
	}

	@Override
	public String abilities() {
		return character.abilities()+ " new dress";
	}
	
}

class SuperPower extends CharacterWithExtendedAbilities{

	public SuperPower(ICharacter c) {
		super(c);
	}

	@Override
	public String abilities() {
		return character.abilities()+" super power";
	}
	
}
public class DecoratorPattern {
 public static void main(String[] args) {
	ICharacter mario = new Mario();
	ICharacter marioWithPower = new PowerUp(mario);
	System.out.println(marioWithPower.abilities());
	
	ICharacter marioWithPowerAndSuperPower = new SuperPower(new PowerUp(mario));
	System.out.println(marioWithPowerAndSuperPower.abilities());
	
	ICharacter marioWithSuperPowerAndNewDress = new NewDress(marioWithPowerAndSuperPower);
	System.out.println(marioWithSuperPowerAndNewDress.abilities());
	
	
}
}
