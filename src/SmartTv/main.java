package SmartTv;

public class main {

	public static void main(String[] args) {


		SmartTv smartTv = new SmartTv();
		System.out.println("Tv ligada? "+ smartTv.ligada);
		smartTv.ligar();
		System.out.println("Tv ligada? "+ smartTv.ligada);
		System.out.println("Volume? "+ smartTv.volume);
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		System.out.println("Volume? "+ smartTv.volume);
		System.out.println("Canal? "+ smartTv.canal);
		smartTv.mudarCanal(20);
		System.out.println("Canal? "+ smartTv.canal);
		

	}

}
