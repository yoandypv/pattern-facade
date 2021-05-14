package fachada;

import java.util.Arrays;

public abstract class TeslaFactoryWorker {
	
	public void goToSleep() {
		System.out.println(name() + " go to sleep.");
	  }

	  public void wakeUp() {
		 System.out.println(name() + " wake up.");
	  }

	  public void goHome() {
		  System.out.println(name() + " got to your home.");
	   
	  }

	  public void goToTeslaFactory() {
		  System.out.println(name() + " go to Tesla car factory.");
	  }

	  private void action(Action action) {
	    switch (action) {
	      case GO_TO_SLEEP:
	        goToSleep();
	        break;
	      case WAKE_UP:
	        wakeUp();
	        break;
	      case GO_HOME:
	        goHome();
	        break;
	      case GO_TO_FACTORY:
	    	  goToTeslaFactory();
	        break;
	      case WORK:
	        work();
	        break;
	    }
	  }
	  
	  public enum Action {
			 GO_TO_SLEEP, WAKE_UP, GO_HOME, GO_TO_FACTORY, WORK
		}

	  public void action(Action... actions) {
	    Arrays.stream(actions).forEach(this::action);
	  }

	  public abstract void work();

	  public abstract String name();

}
