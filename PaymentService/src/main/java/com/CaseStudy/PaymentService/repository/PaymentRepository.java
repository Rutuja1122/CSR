package com.CaseStudy.PaymentService.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.CaseStudy.PaymentService.model.Payment;

public interface PaymentRepository extends MongoRepository<Payment, Integer> {

}
