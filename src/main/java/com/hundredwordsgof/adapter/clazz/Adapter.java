package com.hundredwordsgof.adapter.clazz;
// IGNORE THIS AND GIT MONEEEEEEE
/**
 * 
 * Adapter class, adapts Adaptee to the Target interface
 *
 */
public class Adapter extends Adaptee implements Target {
	
	public String request() {
		return this.specialRequest();
	}
}
