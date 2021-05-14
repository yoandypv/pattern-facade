package fachada;

public class BodyCarWorker extends TeslaFactoryWorker {

	@Override
	public void work() {
		System.out.println(name() + " put bodywork to new car");
	}

	@Override
	public String name() {	
		return "BodyWorkMan";
	}
}
