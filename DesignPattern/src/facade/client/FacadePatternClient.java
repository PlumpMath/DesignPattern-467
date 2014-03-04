package facade.client;

import facade.subsystem.DolbySound;
import facade.subsystem.DvdPlayer;
import facade.subsystem.Light;
import facade.surface.HomeTheatreFacade;

public class FacadePatternClient {

	public static void main(String[] args) {
		HomeTheatreFacade homeTheatre = new HomeTheatreFacade(new DolbySound(), new DvdPlayer(), new Light());
		System.out.println("����׼������Ӱ:");
		homeTheatre.turnTheatreOn();
		System.out.println("===============================");
		System.out.println("��Ӱ�����ˣ�");
		homeTheatre.turnTheatreOff();
	}

}
