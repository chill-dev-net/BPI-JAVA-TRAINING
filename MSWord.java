package com.bpi.day5_M2_SeatWork_3;

public class MSWord implements Executable {
	@Override
	public void run() {
		System.out.println("Opening MS Word...");
	}

	@Override
	public void stop() {
		System.out.println("Stopping MS Word...");
	}
}
