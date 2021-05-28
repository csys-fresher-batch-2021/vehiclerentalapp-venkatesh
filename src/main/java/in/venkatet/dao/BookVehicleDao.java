package in.venkatet.dao;

import java.util.ArrayList;
import java.util.List;

import in.venkatet.model.BookVehicle;

public class BookVehicleDao {
	private BookVehicleDao() {
		/*
		 * adding a private constructor
		 */

	}

	private static List<BookVehicle> bookVehicles = new ArrayList<>();;

	public static void addBookVehicle(String name, double amount, int hour, String bookingDate, String bookingTime) {
		bookVehicles.add(new BookVehicle(name, amount, hour, bookingDate, bookingTime));

	}

	public static List<BookVehicle> getVehicles() {
		return bookVehicles;
	}

}
