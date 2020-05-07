package org.theenergymashuplab.cts.controller.payloads;

import java.time.*;

public class Interval {
	public static Duration duration = Duration.ZERO;
	public static Instant dtStart;
	
	/*
	 *  Construct Interval from java.time.Duration and Instant
	 * 	instant should be constructed and passed in after application of ZonedDateTime.toInstant() elsewhere
	 *  duration is number of minutes, converted in the constructor
	 */
	public Interval(long durationInMinutes, Instant dtStart){
		this.duration = Duration.ofSeconds(60*durationInMinutes);
		this.dtStart = dtStart;
	}
	
	@Override
	public String toString()	{
		Duration duration = this.getDuration();
		
		return ("Interval duration " + duration.toString() +
				" dtStart " + 
				this.dtStart.toString());
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		Interval.duration = duration;
	}

	public Instant getDtStart() {
		return dtStart;
	}

	public void setDtStart(Instant dtStart) {
		Interval.dtStart = dtStart;
	}
}