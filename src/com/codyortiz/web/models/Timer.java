package com.codyortiz.web.models;
import java.util.Calendar;
import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class Timer {
	
	ArrayList<Instant> times = new ArrayList<Instant>();
	private Instant startTime;
	private Instant endTime;
	private long difference;
	
	public Timer() {
		this.startTime = Instant.now();
		
	}
	
	public Instant getStartTime() {
		return startTime;
	}
	
	public Instant getEndTime() {
		return endTime;
	}
	
	public void setStartTime(Instant startTime) {
		this.startTime = startTime;
		times.add(startTime);
	}
	
	public void setEndTime(Instant endTime) {
		this.endTime = endTime;
		times.add(endTime);
	}
	
	public void setDifference() {
		this.difference = Duration.between(startTime, endTime).toMillis();
		System.out.print(difference);
	}

}
