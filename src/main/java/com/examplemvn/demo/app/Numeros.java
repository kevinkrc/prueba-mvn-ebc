package com.examplemvn.demo.app;

import java.util.Iterator;

public class Numeros {

	
	public static boolean esPrimo(int numero) {
		if(numero != 2) {
				for(int i = 2; i < numero; i++) {
					if(i % 2 == 0) 
						return false;
				}
				return true;
		}else {
			return false;
		}
	}
	
}
