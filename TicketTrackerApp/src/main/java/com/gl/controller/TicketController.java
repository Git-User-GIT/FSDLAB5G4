package com.gl.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gl.entity.Ticket;
import com.gl.service.TicketService;


@Controller
@RequestMapping("/tickets")

public class TicketController {
	@Autowired
	private TicketService ticketService;
	
	@GetMapping("/list")
	public String listTickets(Model model) {
		// get all the list of tickets
		List<Ticket> tickets = ticketService.findAll();
		
		model.addAttribute("ticket",tickets);
		return "tickets/Ticket-List";
		
	}
	@PostMapping("/EditTicketForm")
	public String editTicketFrom(@ModelAttribute("tickeID") int ticketID, Model model) {
		Ticket theTicket = new Ticket();
		model.addAttribute("ticket",theTicket);
		return "/ticket/Ticket-Create";
	}
	
	@GetMapping("/ViewTicket")
	public String ViewTicket() {
		return "tickets/Ticket-View";}
		
		@PostMapping("/save")
		public String save(@ModelAttribute("ticket") Ticket theTicket ) {
			Ticket ticket = new Ticket();
			ticketService.save(theTicket);
			return "redirect:/tickets/Ticket-List";
		
	}
		public String delete(@RequestParam("ticketID") int ticketID){
			ticketService.deleteById(ticketID);
			return "redirect:/tickets/Ticket-List";
			
		}
}
