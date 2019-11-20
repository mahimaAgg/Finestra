package com.finestra.payment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

	@GetMapping(value="/home")
	public String getPayment() {
		return "Yes it is working";
	}
}
