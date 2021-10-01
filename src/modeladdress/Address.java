package modeladdress;

public class Address {
	String streetName;
	String landMark;
	String city;
	long pin;
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Long getPin() {
		return pin;
	}
	public void setPin(int i) {
		this.pin = i;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", landMark=" + landMark + ", city=" + city + ", pin=" + pin + "]";
	}

		
	}


