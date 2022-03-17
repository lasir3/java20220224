package chap08.book.s080303;

import chap08.book.s080200.RemoteControl;

public class SmartTelevision implements RemoteControl, Searchable{
	private int volume;

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int voluem) {
		if(voluem > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(voluem < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = voluem;
		}
		
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
}
