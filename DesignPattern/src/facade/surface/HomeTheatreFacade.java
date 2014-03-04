package facade.surface;

import facade.subsystem.DolbySound;
import facade.subsystem.DvdPlayer;
import facade.subsystem.Light;

/**
 * ��ͥӰԺϵͳ�����˶ű�����(DolbySound),DVD������(DvdPlayer)�͵ƹ�(Light).
 * ӰԺ���ֻΪ�ͻ��ṩ��ӰԺ�Ŀ��͹صĹ��ܣ���Щ���ܵĵײ�ʵ�ֶ����û���˵��͸����.
 * ���ģʽ�Ǻ�ʵ�õ�ģʽ֮һ,���԰���ϵͳ����Ϊ��
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
	 * ������ͥӰԺ�������򿪶űȻ������죬�صƣ�����Ӱ��
	 * */
	public void turnTheatreOn(){
		dolby.open();
		light.turnOff();
		dvdPlayer.play();
	}
	

	/**
	 * �رռ�ͥӰԺ�������رնűȻ������죬���ƣ�ֹͣ����Ӱ��
	 * */
	public void turnTheatreOff(){
		dolby.close();
		light.turnOn();
		dvdPlayer.stop();
	}
}
