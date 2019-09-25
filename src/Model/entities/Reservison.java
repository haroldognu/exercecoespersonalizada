package Model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservison {
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");;
	public Reservison(Integer roomNumber, Date checkIn, Date checOut) {
	
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checOut = checOut;
	}
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Date getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}
	public Date getChecOut() {
		return checOut;
	}

	

			public long  duration() {
					
				long diff = checOut.getTime()-checkIn.getTime();
				return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
					
				
			}
			public void updateDates(Date checkIn , Date checOut) {
				this.checkIn = checkIn;
				this.checOut = checOut;
				
				
			}
			@Override
			public String toString() {
				
				return "Room "
				+ roomNumber
				+", CheckIn"
				+ sdf.format(checkIn)
				+ ", check-out: "
				+ sdf.format(checOut)
				+ ", "
				+ duration()
				+ " nights : ";
			}
			
			
}
