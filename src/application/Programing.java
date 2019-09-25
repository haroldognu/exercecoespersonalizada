package application;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import Model.entities.Reservison;

public class Programing {

	public static void main(String[] args) throws ParseException  {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Room number: ");
		int number = sc.nextInt();
		System.out.println("Check-in Date (dd/MM/yyyy)  ");
		Date checkIn =  sdf.parse(sc.next());
		System.out.println("Check-out Date (dd/MM/yyyy)  ");
		Date checkOut =  sdf.parse(sc.next());
		Reservison reser = new Reservison(number,checkIn,checkOut);
		if( !checkOut.after(checkIn))
		{
				System.out.println("erro in reservasion : erro na data");
			
		}else {
			
			System.out.println("Reservation : " + reser);
		}
		
		System.out.println();
		System.out.println(" update sua datas");
		System.out.println("Room number: ");
		 number = sc.nextInt();
		System.out.println("Check-in Date (dd/MM/yyyy)  ");
		 checkIn =  sdf.parse(sc.next());
		System.out.println("Check-out Date (dd/MM/yyyy)  ");
		 checkOut =  sdf.parse(sc.next());
		if( !checkOut.after(checkIn))
		{
				System.out.println("erro in reservasion : erro na data");
			
		}else {
			
			
			Date now = new Date();
			if(checkIn.before(now) || checkOut.before(now)) {
				System.out.println("erro in reservasion : erro na data");

				
				
			}else if ( !checkOut.after(checkIn)) {
				System.out.println("erro in reservasion : erro na data");

			}else {
			
			reser.updateDates(checkIn, checkOut);
			System.out.println("Reservation : " + reser);
			}
			
		}
		sc.close();
	
	}

}
