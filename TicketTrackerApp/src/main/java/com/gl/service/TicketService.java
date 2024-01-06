package com.gl.service;

import java.util.List;

import com.gl.entity.Ticket;

public interface TicketService {
	
	public List<Ticket> findAll();

	public void save(Ticket theTicket);

	Ticket editTicketFrom(int ticketID);

	public void deleteById(int ticketID);
	

}
