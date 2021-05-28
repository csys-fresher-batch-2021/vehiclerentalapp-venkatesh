package in.venkatet.model;

public class BookVehicle {
	
	private String vehicleName;
	private  double cost;
	private int hour;
	private String bookingDate;
	private String bookingTime;

	
	
	public BookVehicle(String vehicleName, double cost, int hour, String bookingDate, String bookingTime) {

		this.vehicleName = vehicleName;
		this.cost = cost;
		this.hour = hour;
		this.bookingDate = bookingDate;
		this.bookingTime = bookingTime;
	}

	public String getVehicleName() {
		return vehicleName;
	}
	
	public double getCost() {
		return cost;
	}
	
	public int getHour() {
		return hour;
	}
	
	public String getBokingDate() {
		return bookingDate;
	}
	public String getBookingTime() {
		return bookingTime;
	}

	@Override
	public String toString() {
		return "BookVehicle [vehicleName=" + vehicleName + ", cost=" + cost + ", hour=" + hour + ", bookingDate="
				+ bookingDate + ", bookingTime=" + bookingTime + "]";
	}
	
}