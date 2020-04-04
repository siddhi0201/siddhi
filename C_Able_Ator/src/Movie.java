
public class Movie {

	public int dateOfRelease;

	public String name;
	public int rating;



	@Override
	public String toString() {
		return "Movie [dateOfRelease=" + dateOfRelease + ", name=" + name + ", rating=" + rating + "]";
	}

	public Movie(int dateOfRelease,String name,int rating) {
		super();
		this.dateOfRelease = dateOfRelease;
		this.name = name;
		this.rating = rating;
	}

	public int getDateOfRelease() {
		return dateOfRelease;
	}

	public void setDateOfRelease(int dateOfRelease) {
		this.dateOfRelease = dateOfRelease;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
	}
	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}


}
