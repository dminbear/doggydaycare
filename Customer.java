import java.util.ArrayList;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String phoneNumber;
	private String address;
	private ArrayList<Dog> dogs;
	
	public Customer(int id, String name, String emailAddress, String phoneNumber, String address) {
		if (name == null) 
		{
			throw new IllegalArgumentException("Name cannot be empty");
		}
		this.id = id;
		String[] splited = name.split("\\s+");
		this.firstName = splited[0];
		try {
			this.lastName = splited[1];
		} catch (Exception e) {
			this.lastName = "";
		}
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.dogs = new ArrayList<Dog>();
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public String getName()
	{
		return this.firstName + " " + this.lastName;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public String getEmailAddress()
	{
		return this.emailAddress;
	}
	
	public String getPhoneNumber()
	{
		return this.phoneNumber;
	}
	
	public String getAddress()
	{
		return this.address;
	}
	
	public ArrayList<Dog> getDogs()
	{
		return this.dogs;
	}
	
	public void addDogs(ArrayList<Dog> dogs) 
	{
		this.dogs = dogs;
	}

}
