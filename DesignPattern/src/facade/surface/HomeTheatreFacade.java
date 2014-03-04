package facade.surface;

import facade.subsystem.DolbySound;
import facade.subsystem.DvdPlayer;
import facade.subsystem.Light;

/**
 * 家庭影院系统包含了杜比音响(DolbySound),DVD播放器(DvdPlayer)和灯光(Light).
 * 影院外观只为客户提供了影院的开和关的功能，这些功能的底层实现对于用户来说是透明的.
 * 外观模式是很实用的模式之一,可以帮助系统化繁为简
 * */
public class HomeTheatreFacade {

	private DolbySound dolby;
	private DvdPlayer dvdPlayer;
	private Light light;
	
	public HomeTheatreFacade(DolbySound dolby, DvdPlayer dvdPlayer, Light light) {
		super();
		this.dolby = dolby;
		this.dvdPlayer = dvdPlayer;
		this.light = light;
	}
	/**
	 * 开启家庭影院包括，打开杜比环绕音响，关灯，播放影碟
	 * */
	public void turnTheatreOn(){
		dolby.open();
		light.turnOff();
		dvdPlayer.play();
	}
	

	/**
	 * 关闭家庭影院包括，关闭杜比环绕音响，开灯，停止播放影碟
	 * */
	public void turnTheatreOff(){
		dolby.close();
		light.turnOn();
		dvdPlayer.stop();
	}
}
