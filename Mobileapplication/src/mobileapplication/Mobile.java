package mobileapplication;

public class Mobile {
	private int screensize;
	private String companyname;
	private String operatingsystem;
	private int batterypercentage;
	
	
	


	public Mobile(int Screensize, String Companyname, String Operatingsystem) {
		super();
		this.screensize = Screensize;
		this.companyname = Companyname;
		this.operatingsystem = Operatingsystem;
	}


	public int getScreensize() {
		return screensize;
	}


	public void setScreensize(int screensize) {
		this.screensize = screensize;
	}


	public String getCompanyname() {
		return companyname;
	}


	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}


	public String getOperatingsystem() {
		return operatingsystem;
	}


	public void setOperatingsystem(String operatingsystem) {
		this.operatingsystem = operatingsystem;
	}


	public int getBatterypercentage() {
		return batterypercentage;
	}
	 public void takePicture() {
		 if(batterypercentage < 10) {
			 System.out.println("You cannot take picture, Battery insufficient");
			 
		 }
		 else {
			 System.out.println("The picture is taken");
			 batterypercentage -= 10;
			 
		 }
		
	 }
	 public void recordVideo() {
		 if(batterypercentage < 30) {
			 System.out.println("You cannot take video, Battery insufficient");
			 
		 }
		 else {
			 System.out.println("The video is recorded");
			 batterypercentage -= 30;
			 
		 }
		
	 }
	 public void playGames() {
		 if(batterypercentage < 60) {
			 System.out.println("You cannot play games ,Battery insufficient");
		 }
		 else {
			 System.out.println("You can play games");
			 batterypercentage -= 60;
		 }
	 }
	 
	 public void charge() {
		 batterypercentage = 100;
		 System.out.println("Battery is fully charged");
	 }

}
