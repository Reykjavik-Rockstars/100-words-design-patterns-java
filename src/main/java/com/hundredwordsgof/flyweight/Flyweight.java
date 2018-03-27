package com.hundredwordsgof.flyweight;
// This is my comment with Michael Lujan's name in it.
/**
 * 
 * Flyweight, interface through flyweight can receive and act on extrinsic
 * state.
 *
 */
public interface Flyweight {

  void operation(Object extrinsicState);
}
