package com.gl.dao;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.gl.entity.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket , Integer>{
	

}
