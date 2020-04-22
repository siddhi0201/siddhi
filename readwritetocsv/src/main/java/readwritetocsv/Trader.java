package readwritetocsv;
class Trader{
	private String city;
	private String country;
	private long income;
	private char gender;
	
	public Trader(String city, String country, long income, char gender) {
		super();
		this.city = city;
		this.country = country;
		this.income = income;
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getIncome() {
		return income;
	}

	public void setIncome(long income) {
		this.income = income;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
}