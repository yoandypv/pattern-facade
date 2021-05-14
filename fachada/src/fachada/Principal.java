package fachada;

public class Principal {

	public static void main(String[] args) {
		System.out.println("===================");
		var facade = new TeslaFactoryFacade();
		facade.startNewDay();
		facade.assembleCar();
		facade.endDay();
		System.out.println("===================");
	}

}
