package com.examplemvn.demo.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class HomeController {
	
	@GetMapping("prueba")
	public String getPrimeNumbers(){
		String numeros = ""; 
		
		for (int i = 2; i < 100; i++) {
			if (esPrimo(i)) {
				numeros +=i+", ";
			}	
		}
		
		return numeros;
		
	}
	
	
	
	public static boolean esPrimo(int numero) {	
		for(int i=2;i<numero;i++) {
		    if(numero%i==0)
		        return false;
		}
		return true;		
	}
	

}
