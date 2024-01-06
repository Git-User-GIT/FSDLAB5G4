package com.gl.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.gl.dao.TicketRepository;
import com.gl.entity.Ticket;


public class TicketServiceImplementation implements TicketService {
	@Autowired
	private TicketRepository ticketRepository;

	@Override
	public List<Ticket> findAll() {
		// TODO Auto-generated method stub
		
		
		return ticketRepository.findAll();
	}

	@Override
	public void save(Ticket theTicket) {
		// TODO Auto-generated method stub
		ticketRepository.save(theTicket);
	}
	@Override
	public Ticket editTicketFrom(int ticketID) {
		Optional<Ticket> ticket = ticketRepository.findById(ticketID);
		ticket.isPresent();
		// TODO Auto-generated method stub
		
		return ticketRepository.findById(ticketID).get();
	}

	@Override
	public void deleteById(int ticketID) {
		// TODO Auto-generated method stub
		ticketRepository.deleteById(ticketID);
		
	}

}
