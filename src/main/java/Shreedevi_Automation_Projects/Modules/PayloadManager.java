package Shreedevi_Automation_Projects.Modules;

import Shreedevi_Automation_Projects.pojos.Booking;
import Shreedevi_Automation_Projects.pojos.BookingDates;
import Shreedevi_Automation_Projects.pojos.BookingResponse;
import com.google.gson.Gson;

public class PayloadManager {
    Gson gson;
    public String createPayloadBooking(){
        Booking booking = new Booking();
        booking.setFirstName("Jim");
        booking.setLastName("Brown");
        booking.setTotalprice(111);
        booking.setDepositpaid(true);
        BookingDates bookingdates= new BookingDates();
        bookingdates.setCheckIn("2018-01-01");
        bookingdates.setCheckOut("2019-01-01");
        booking.setBookingDates(bookingdates);
        booking.setAdditionalneeds("Breakfast");
        gson = new Gson();
        String jsonResponseAsString = gson.toJson(booking);
        return jsonResponseAsString;

    }
    public String updatePayloadBooking() {
        Booking booking = new Booking();
        booking.setFirstName("Seenivasa");
        booking.setLastName("Kiran");
        booking.setTotalprice(1496);
        booking.setDepositpaid(true);
        BookingDates bookingdates= new BookingDates();
        bookingdates.setCheckIn("2018-01-01");
        bookingdates.setCheckOut("2019-01-01");
        booking.setBookingDates(bookingdates);
        booking.setAdditionalneeds("Breakfast");
        return gson.toJson(booking);
    }

    public BookingResponse bookingResponseJava(String responseString){
        gson = new Gson();
        BookingResponse bookingResponse = gson.fromJson(responseString, BookingResponse.class);
        return bookingResponse;

    }


}

