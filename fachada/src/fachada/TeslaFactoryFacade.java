package fachada;

import java.util.Collection;
import java.util.List;

public class TeslaFactoryFacade {
	  private final List<TeslaFactoryWorker> workers;
	  
	  public TeslaFactoryFacade() {
		  workers = List.of(new TiresWorker(), new PaintWorker(), new BodyCarWorker());
	  }
	  
	  public void startNewDay() {
		    makeActions(workers, TeslaFactoryWorker.Action.WAKE_UP, TeslaFactoryWorker.Action.GO_TO_FACTORY);
		  }

		  public void assembleCar() {
		    makeActions(workers, TeslaFactoryWorker.Action.WORK);
		  }

		  public void endDay() {
		    makeActions(workers, TeslaFactoryWorker.Action.GO_HOME, TeslaFactoryWorker.Action.GO_TO_SLEEP);
		  }

		  private static void makeActions(Collection<TeslaFactoryWorker> workers,
				  TeslaFactoryWorker.Action... actions) {
		    workers.forEach(worker -> worker.action(actions));
		  }

}
