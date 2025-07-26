package com.learnings.observer;

import java.util.ArrayList;
import java.util.List;

interface IChannel{
	void subscribe(ISubscriber subscriber);
	void unsubscribe(ISubscriber subscriber);
	void notifySubscribers();
}

interface ISubscriber{
	void update();
}

class Channel implements IChannel{
	List<ISubscriber> subscribers;
	String name;
	String latestVideo;
	
	public Channel(String name) {
		this.name = name;
		this.subscribers = new ArrayList<>();
	}
	

	@Override
	public void notifySubscribers() {
		for(ISubscriber subscriber : subscribers) {
			subscriber.update();
		}
		
	}


	@Override
	public void subscribe(ISubscriber subscriber) {
		if(!subscribers.contains(subscriber)) {
			subscribers.add(subscriber);
		}
		
	}


	@Override
	public void unsubscribe(ISubscriber subscriber) {
		subscribers.remove(subscriber);		
	}
	
	public void uploadVideo(String videoName) {
		this.latestVideo = videoName;
		notifySubscribers();
	}
	
}

class Subscriber implements ISubscriber{
	String name;
	Channel channel;
	
	public Subscriber(String name,Channel channel) {
		this.name = name;
		this.channel = channel;
	}

	@Override
	public void update() {
		System.out.println("Hey " + name + " " + channel.name + " released " + channel.latestVideo);
		
	}
	
	
}

public class ObserverPattern {
	
	public static void main(String[] args) {
		Channel channel = new Channel("KishorLearnings");
		Subscriber subscriber1 = new Subscriber("kishor", channel);
		Subscriber subscriber2 = new Subscriber("vinay", channel);
		channel.subscribe(subscriber1);
		channel.subscribe(subscriber2);
		
		channel.uploadVideo("Future of the Java");
		
		channel.unsubscribe(subscriber2);
		
		channel.uploadVideo("Future of AI");
		
	}

}
