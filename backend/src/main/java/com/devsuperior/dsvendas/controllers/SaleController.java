package com.devsuperior.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.dto.SaleSuccessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.servicie.SaleServicie;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleServicie service;
	
	@GetMapping
	private ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
		Page<SaleDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/sum-by-seller")
	private ResponseEntity<List<SaleSumDTO>> amountGropedBySeller(){
		List<SaleSumDTO> list = service.amountGropedBySeller();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/success-by-seller")
	private ResponseEntity<List<SaleSuccessDTO>> successGropedBySeller(){
		List<SaleSuccessDTO> list = service.successGropedBySeller();
		return ResponseEntity.ok(list);
	}
}
