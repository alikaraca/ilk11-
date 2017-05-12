import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class player {
	private String adsoyad;
	private String ayak;
	private String mevki;
	private String rate;
	private String takim;
	public String getMevki() {
		return mevki;
	}
	public void setMevki(String mevki) {
		this.mevki = mevki;
	}
	public String getAyak() {
		return ayak;
	}
	public void setAyak(String ayak) {
		this.ayak = ayak;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getAdsoyad() {
		return adsoyad;
	}
	public void setAdsoyad(String adsoyad) {
		this.adsoyad = adsoyad;
	}
	public player(){
		int i;
		try{
			FileReader fr=new FileReader("futbolcu bilgileri/Futbolcular");
			BufferedReader bf=new BufferedReader(fr);
			String str;
			String[] kelime;

			
			/*
			str=bf.readLine();
			kelime=str.split("-");
			setAdsoyad(kelime[0]);
			setMevki(kelime[1]);
			setTakim(kelime[2]);
			setAyak(kelime[3]);
			setRate(kelime[4]);
			System.out.println(getAdsoyad());
			System.out.println(getRate());
			System.out.println(getTakim());*/
			/*
			List liste=new ArrayList();
			liste.add(rate);
			
			while((str=bf.readLine())!=null){
				kelime=str.split("-");
				setAdsoyad(kelime[0]);
				setMevki(kelime[1]);
				setTakim(kelime[2]);
				setAyak(kelime[3]);
				setRate(kelime[4]);
				liste.add(getAdsoyad());
				
				
				System.out.println(getAdsoyad()+"-"+getTakim()+"-"+getMevki());
				
			}
			System.out.println(liste);*/
		}catch (Exception e) {
			System.out.println("Dosya okunamadı");
		}
		
	}
	public static void main(String[] args) {
		player p=new player();
		
	}
	public String getTakim() {
		return takim;
	}
	public void setTakim(String takim) {
		this.takim = takim;
	}

}
