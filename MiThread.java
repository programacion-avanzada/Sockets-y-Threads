
public class MiThread extends Thread {
	
	MiThread(String nombreHilo) {
		super(nombreHilo);
	}
	
	public void run() {
		for(int i = 0; i < 10; i++) 
			System.out.println(i + " - " + getName());
		System.out.println("Hilo finalizado");
	}

	public static void main(String[] args) {

		new MiThread("Julio").start();
		new MiThread("Lucas").start();

	}

}
