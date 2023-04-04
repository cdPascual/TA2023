package oops.encapsulation;

public class Movie{
	private String rate;
	int duration;
	
	
	public void rateMovie() {
		System.out.println("10");
	}
	
	//setter
	public String getRate() {
		return rate;
	}
	
	//getter
	public void setRate(String Rate) {
		this.rate = Rate;
	}
}
