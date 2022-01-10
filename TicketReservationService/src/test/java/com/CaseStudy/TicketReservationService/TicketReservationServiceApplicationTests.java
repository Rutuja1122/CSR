package com.CaseStudy.TicketReservationService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.CaseStudy.TicketReservationService.model.TicketReservation;
import com.CaseStudy.TicketReservationService.repository.TicketReservationRepository;
import com.CaseStudy.TicketReservationService.service.TicketReservationService;


@SpringBootTest
class TicketReservationServiceApplicationTests {

	@Autowired
	private TicketReservationService ticketReservationService;
	
	@MockBean
	private TicketReservationRepository ticketReservationRepository;

		@Test
		public void saveTrainTest() {
			TicketReservation ticketReservation = new TicketReservation();
			when(ticketReservationRepository.save(ticketReservation)).thenReturn(ticketReservation);
			assertEquals(ticketReservation, ticketReservationService.getTicketsDetails());
		
		}
		
	
	

}