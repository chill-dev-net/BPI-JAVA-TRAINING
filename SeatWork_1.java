package com.bpi.day3_M2_SeatWork1;

public class SeatWork_1 {

	public static void main(String[] args) {
		Book book = new Book();
		House house = new House();
		Tree tree = new Tree();
		
		book.title = "Programming 101";
		book.read();
		
		house.numberOfRooms = 33;
		house.openDoor();
		
		tree.height = 7000;
		tree.grow();
	}

}
