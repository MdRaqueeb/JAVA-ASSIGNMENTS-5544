package com.airflight;
public class Airport extends Flight
{
	private Address address;
	private Flight[] flights;
	private Traveller[] travellers;
	private int index=0;
	public Airport() {}
	public Airport(Address address) 
	{
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Flight[] getFlights() {
		return flights;
	}
	public void setFlights(Flight[] flights) {
		this.flights = flights;
	}
	public Traveller[] getTravellers() {
		return travellers;
	}
	public void setTravellers(Traveller[] travellers) {
		this.travellers = travellers;
	}
	
	public boolean addFlight(Flight flight)
	{
		if(index < flights.length)
		{
			flights[index ++]=flight;
			return true;
		}
		return false;
	}
	
	public void searchFlightBySandA(String source, String destination)
	{
		for(int i= 0; i < index; i++)
		{
			if (flights[i].getSource().equals(source) && flights[i].getDestination().equals(destination))
			{
				System.out.println(flights[i].getId());
				System.out.println(flights[i].getFare());
				System.out.println(flights[i].getTotalseats());
				System.out.println(flights[i].getAvailableseats());
				System.out.println(flights[i].getArrivalTime());
				System.out.println(flights[i].getDepartureTime());
				System.out.println(flights[i].getCompanyName());
			}
			else
				System.out.println("Invalid Source and Destination");
		}
	}
	
	public void bookTicket(String flightId, Traveller traveller) 
	{
        for(Flight flight : flights) 
        {
            if(flight.getId() == flightId && flight.getAvailableseats()>=1) 
            {
                flight.setAvailableseats(flight.getAvailableseats()-1);
                System.out.println("traveller details");
                traveller.getName();
                traveller.getEmail();
                traveller.getMobile();
                traveller.getDate();
                traveller.getFlightId();
            }
            else
            	System.out.println("Booking are not Available");
            	
        }

    }
	
}
