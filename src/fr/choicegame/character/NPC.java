package fr.choicegame.character;

import fr.choicegame.event.Event;

public class NPC extends Character {
	
	Event event;

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

}