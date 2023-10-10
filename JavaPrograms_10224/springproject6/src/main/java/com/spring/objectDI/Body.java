package com.spring.objectDI;

public class Body {
	private Heart heart;
	public Body(Heart heart) {
		this.heart = heart;
	}
	
	public void humanIsAlive() {
		if(heart != null) {
			heart.heartBeat();
		}
		else {
			System.out.println("Human is not alive");
		}
	}

}
