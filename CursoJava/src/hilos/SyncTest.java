package hilos;

public class SyncTest {

  @SuppressWarnings("static-access")
public static void main(String[] args) {

    SyncStack stack = new SyncStack();

    Producer p1 = new Producer(stack);
    Thread prodT1 = new Thread (p1);
    prodT1.setPriority(Thread.MAX_PRIORITY);
    prodT1.start();
    prodT1.yield();
    if(prodT1.getState() == Thread.State.RUNNABLE) {
    	System.out.println("El hilo esta preparado");
    }
    System.out.println(prodT1.getState());

    Producer p2 = new Producer(stack);
    Thread prodT2 = new Thread (p2);
    prodT1.setPriority(Thread.MAX_PRIORITY);
    prodT2.start();
    prodT2.yield();
    if(prodT2.getState() == Thread.State.RUNNABLE) {
    	System.out.println("El hilo 2 esta preparado");
    }
    System.out.println(prodT2.getState());


    Consumer c1 = new Consumer(stack);
    Thread consT1 = new Thread (c1);
    consT1.setPriority(Thread.MIN_PRIORITY);
    consT1.start();
    
    System.out.println("Estado de de consmidor2: "+consT1.getState());

    Consumer c2 = new Consumer(stack);
    Thread consT2 = new Thread (c2);
    consT2.setPriority(Thread.MIN_PRIORITY);
    consT2.start();
    
    System.out.println("Estado de de consmidor2: "+consT2.getState());
  }
}
