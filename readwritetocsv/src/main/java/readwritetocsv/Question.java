//package readwritetocsv;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//class Trader{
//	private String city;
//	private String country;
//	private long income;
//	private char gender;
//	
//	public Trader(String city, String country, long income, char gender) {
//		super();
//		this.city = city;
//		this.country = country;
//		this.income = income;
//		this.gender = gender;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//
//	public String getCountry() {
//		return country;
//	}
//
//	public void setCountry(String country) {
//		this.country = country;
//	}
//
//	public long getIncome() {
//		return income;
//	}
//
//	public void setIncome(long income) {
//		this.income = income;
//	}
//
//	public char getGender() {
//		return gender;
//	}
//
//	public void setGender(char gender) {
//		this.gender = gender;
//	}
//}
//
//public class Question {
//
//	public static void prepareData(List<Trader> traders) {
//		traders.add(new Trader("New Delhi", "IND", 10, 'M'));
//		traders.add(new Trader("New Delhi", "IND", 20, 'M'));
//		traders.add(new Trader("New Delhi", "IND", 10, 'F'));
//		traders.add(new Trader("New Delhi", "IND", 10, 'F'));
//		traders.add(new Trader("New Delhi", "", 10, 'M'));
//		traders.add(new Trader("New Delhi", "", 10, 'M'));
//		traders.add(new Trader("New Delhi", "", 10, 'F'));
//		traders.add(new Trader("New Delhi", "", 10, 'F'));
//		
//		traders.add(new Trader("Faridabad", "HAR", 10, 'M'));
//		traders.add(new Trader("Faridabad", "HAR", 20, 'M'));
//		traders.add(new Trader("Faridabad", "HAR", 10, 'F'));
//		traders.add(new Trader("Faridabad", "HAR", 10, 'F'));
//		traders.add(new Trader("Faridabad", "", 10, 'M'));
//		traders.add(new Trader("Faridabad", "", 10, 'M'));
//		traders.add(new Trader("Faridabad", "", 10, 'F'));
//		traders.add(new Trader("Faridabad", "", 10, 'F'));
//		
//	}
//	
//	public static String groupByCityorCountry(Trader t) {
//		if(t.getCountry().isEmpty()) return t.getCity();
//		return t.getCountry();
//	}
//	
//	public static char groupByGender(Trader t) {
//		return t.getGender();
//	}
//	
//	
//	public static void main(String[] args) {
//		List<Trader> traders = new ArrayList<>();
//		prepareData(traders);
//		
//		Map<String,Map<Character,Double>> result = traders.stream().collect(Collectors.groupingBy(
//				Question::groupByCityorCountry,
//				Collectors.groupingBy(Question::groupByGender,Collectors.averagingLong(t->t.getIncome()))));
//		result.forEach((province,genderMap)->{
//			genderMap.forEach((gender,income)->{
//				System.out.println(province+" "+gender+" "+income);
//			});
//		});
//		
//	}
//	
//	
//}
