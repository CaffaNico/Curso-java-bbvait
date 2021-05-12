package hilos;

import java.util.*;

public class SyncStack {
  private List buffer = new ArrayList(400);

  public synchronized char pop() {
      char c;
      while (buffer.size() == 0) {
        try {
	  this.wait();
	} catch (InterruptedException e) {
  	  // ignore it...
	}
      }
      c = ((Character)buffer.remove(buffer.size()-1)).
	charValue();
      return c;
  }

  @SuppressWarnings("unchecked")
public synchronized void push(char c) {
    this.notify();
    @SuppressWarnings("deprecation")
	Character charObj = new Character(c);
    buffer.add(charObj);
  }
}
