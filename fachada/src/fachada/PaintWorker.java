package fachada;

public class PaintWorker extends TeslaFactoryWorker {

	@Override
	public void work() {
		System.out.println(name() + " paint the car");
	}

	@Override
	public String name() {	
		return "PaintMan";
	}
}
