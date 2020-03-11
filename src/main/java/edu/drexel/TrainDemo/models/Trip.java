package edu.drexel.TrainDemo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trip {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long routeId;
	private Long calendarId;
	private String headSign;
	// private Direction direction; UNSURE IF THIS SHOULD BE AN ENUM

	protected Trip() {

	}

	public Long getId() {
		return id;
	}

	public Long getRouteId() {
		return routeId;
	}

	public Long getCalendarId() {
		return calendarId;
	}

	public String getHeadSign() {
		return headSign;
	}

}
