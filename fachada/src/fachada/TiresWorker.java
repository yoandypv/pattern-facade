package fachada;

public class TiresWorker extends TeslaFactoryWorker {

	@Override
	public void work() {
		System.out.println(name() + " put tires to new car");
	}

	@Override
	public String name() {	
		return "TiresMan";
	}

}
