
package com.CaseStudy.TicketReservationService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.CaseStudy.TicketReservationService.model.TicketReservation;

public interface TicketReservationRepository extends MongoRepository<TicketReservation, String> {

}