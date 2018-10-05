package com.apap.tutorial4.service;

import com.apap.tutorial4.model.FlightModel;

/*
 * PilotService
 */

public interface FlightService {
	void addFlight(FlightModel flight);
	void deleteFlight(FlightModel flight);
	FlightModel getFlightDetailByFlightNumber(String flightNumber);
}
