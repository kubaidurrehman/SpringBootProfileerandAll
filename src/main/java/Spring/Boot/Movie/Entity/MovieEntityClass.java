package Spring.Boot.Movie.Entity;

public class MovieEntityClass {

	private int id;
	private String customerName;
	private String movieName;
	private int amount;

	public MovieEntityClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MovieEntityClass(int id, String customerName, String movieName, int amount) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.movieName = movieName;
		this.amount = amount;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the movieName
	 */
	public String getMovieName() {
		return movieName;
	}

	/**
	 * @param movieName the movieName to set
	 */
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	/**
	 * @return the amount
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "MovieEntityClass [id=" + id + ", customerName=" + customerName + ", movieName=" + movieName
				+ ", amount=" + amount + "]";
	}

}
