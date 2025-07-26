package com.learnings.strategy;

interface Walkable{
	void walk();
}

interface Talkable{
	void talk();
}

class NormalWalkable implements Walkable{

	@Override
	public void walk() {
		System.out.println("Normal Walk");
		
	}
	
}

class FloorWalkable implements Walkable{

	@Override
	public void walk() {
		System.out.println("Floor walk");
		
	}
	
}

class NormalTalkable implements Talkable{

	@Override
	public void talk() {
		System.out.println("Normal talk");
		
	}
	
}

class NoTalkable implements Talkable{

	@Override
	public void talk() {
		System.out.println("No talk");
		
	}
	
}

abstract class Robot {
	Talkable t;
	Walkable w;
	Robot(Talkable t,Walkable w){
		this.t =t;
		this.w = w;
	}
	
	public void talk() {
		t.talk();
	}
	
	public void walk() {
		w.walk();
	}
	
	public abstract void projection();
}

class CompanionRobot extends Robot{

	CompanionRobot(Talkable t, Walkable w) {
		super(t, w);
	}

	@Override
	public void projection() {
		System.out.println("Companion Projection");
		
	}
	
}

class WorkerRobot extends Robot{

	WorkerRobot(Talkable t, Walkable w) {
		super(t, w);
	}

	@Override
	public void projection() {
		System.out.println("Worker projection");
		
	}
	
}

public class Client {
	
	public static void main(String[] args) {
		Robot companion = new CompanionRobot(new NormalTalkable(), new NormalWalkable());
		companion.projection();
		companion.talk();
		companion.walk();
		
		Robot worker = new WorkerRobot(new NoTalkable(), new FloorWalkable());
		worker.talk();
		worker.walk();
		worker.projection();
		
	}

}
