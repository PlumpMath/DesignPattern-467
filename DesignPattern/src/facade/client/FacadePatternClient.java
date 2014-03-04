package facade.client;

import facade.subsystem.DolbySound;
import facade.subsystem.DvdPlayer;
import facade.subsystem.Light;
import facade.surface.HomeTheatreFacade;

public class FacadePatternClient {

	public static void main(String[] args) {
		HomeTheatreFacade homeTheatre = new HomeTheatreFacade(new DolbySound(), new DvdPlayer(), new Light());
		System.out.println("就坐准备开电影:");
		homeTheatre.turnTheatreOn();
		System.out.println("===============================");
		System.out.println("电影看完了：");
		homeTheatre.turnTheatreOff();
	}

}
