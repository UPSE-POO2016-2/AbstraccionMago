
public class SimuladorMago {

	public SimuladorMago() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		int a = 10;
		int b = a;
		
		b = 11;
		System.out.println(a);
		System.out.println(b);
		
		
		Mago harryPotter = new Mago("Harry Potter", 100, 100);
		Mago tomRiddle = new Mago("Lord Voldemort",200,90);
		Mago voldemort = tomRiddle;
		voldemort.setGenero('M');
		Mago elQueNoDebeSerNombrado = new Mago("Lord Voldemort", 200, 90);
		elQueNoDebeSerNombrado.setGenero('I');
		System.out.println("Poder TomRiddle: "+ tomRiddle.getPoder());
		System.out.println("Poder Voldemort: "+ voldemort.getPoder());
		System.out.println("Poder ElQueNoDebeSerNombrado: "+ elQueNoDebeSerNombrado.getPoder());
		
		/*
		voldemort.setPoder(100);
		System.out.println();
		
		System.out.println("Poder TomRiddle: "+ tomRiddle.getPoder());
		System.out.println("Poder Voldemort: "+ voldemort.getPoder());
		System.out.println("Poder ElQueNoDebeSerNombrado: "+ elQueNoDebeSerNombrado.getPoder());
		
		elQueNoDebeSerNombrado.setPoder(1500);
		System.out.println();
		
		System.out.println("Poder TomRiddle: "+ tomRiddle.getPoder());
		System.out.println("Poder Voldemort: "+ voldemort.getPoder());
		System.out.println("Poder ElQueNoDebeSerNombrado: "+ elQueNoDebeSerNombrado.getPoder());
		
		
		tomRiddle.setPoder(500);
		System.out.println();
		
		System.out.println("Poder TomRiddle: "+ tomRiddle.getPoder());
		System.out.println("Poder Voldemort: "+ voldemort.getPoder());
		System.out.println("Poder ElQueNoDebeSerNombrado: "+ elQueNoDebeSerNombrado.getPoder());
		
		tomRiddle.setPoder(800);
		elQueNoDebeSerNombrado = tomRiddle;
		System.out.println();
		
		System.out.println("Poder TomRiddle: "+ tomRiddle.getPoder());
		System.out.println("Poder Voldemort: "+ voldemort.getPoder());
		System.out.println("Poder ElQueNoDebeSerNombrado: "+ elQueNoDebeSerNombrado.getPoder());
		*/
		
		if(tomRiddle.esIgual(elQueNoDebeSerNombrado))
		{
			System.out.println("WOW TomRiddle ha sido Voldemort! FTW!");
		}else{
			System.out.println("Amague, tom y voldemort son diferentes");
		}
		/*
		
		while(harryPotter.getSalud()>0 && tomRiddle.getSalud()>0)
		{
			if(tomRiddle.getSalud()>0)
			tomRiddle.atacar(harryPotter);
			
			if(harryPotter.getSalud()>0)
			{
			harryPotter.curar(harryPotter);
			harryPotter.atacar(tomRiddle);
			}
		}
		*/

	}

}
