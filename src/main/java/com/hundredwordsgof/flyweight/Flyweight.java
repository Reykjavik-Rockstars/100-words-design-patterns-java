package com.hundredwordsgof.flyweight;

/**
 * 
 * Flyweight, interface through flyweight can receive and act on extrinsic
 * state.
 *
 */
public interface Flyweight {
/* Inside here is a comment! (Daniel Ortiz, deo15)*/
  void operation(Object extrinsicState);
}
