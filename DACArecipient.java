import org.checkerframework.checker.units.qual.s;

/**
 * Represents one person receiving Deferred Action for Childhood Arrivals (DACA).
 * 
 * <TODO: add @author info here for all group-mates!>
 *
 *	@version 1.0
 **/

//TODO: Complete UML class diagram
/* UML CLASS DIAGRAM:
-----------------------------------------
<class name>
-----------------------------------------
<data, i.e. variables>
surname : String
givenName : String
uscisNumber : String
countryOfOrigin : String
birthday : int
validFormDate : int
expirationDate : int
sex : char
-----------------------------------------
<actions, i.e. methods>
getSurname()
getGivenName()
getUscisNumber()
getCountryOfOrigin()
getBirthday()
getValidFormDate()
getExpirationDate()
getSex()
-----------------------------------------
*/

public class DACArecipient
{
	/***** INSTANCE VARIABLES *****/
	//TODO: Declare the instance variables. 
	private String surname;
	private String givenName;
	private String uscisNumber;
	private String countryOfOrigin;
	private int birthday, validFromDate, expirationDate;
	private char sex;

	public String getSurname(){
		return this.surname;
	}
	public String getGivenName(){
		return this.givenName;
	}
	public String getUscisNumber(){
		return this.uscisNumber;
	}
	public String getCountryOfOrigin(){
		return this.countryOfOrigin;
	}
	public int getBirthday(){
		return this.birthday;
	}
	public int getValidFromDate(){
		return this.validFromDate;
	}
	public int getExpirationDate(){
		return this.expirationDate;
	}
	public char getSex(){
		return this.sex;
	}
	/***** ACCESSORS *****/
	//TODO: Write the getter for each instance variable. Remember to include documentation for each method.
	 
	/***** MUTATORS *****/
	//TODO: Write the setter for each instance variable. Remember to include documentation for each method.
	public void setSurname(String surname){
		this.surname = surname;
	}
	public void setGivenName(String givenName){
		this.givenName = givenName;
	}
	public void setUscisNumber(String uscisNumber){
		this.uscisNumber = uscisNumber;
	}
	public void setCountryOfOrigin(String countryOfOrigin){
		this.countryOfOrigin = countryOfOrigin;
	}
	public void setBirthday(int birthday){
		this.birthday = birthday;
	}
	public void setValidFromDate(int validFromDate){
		this.validFromDate = validFromDate;
	}
	public void setExpirationDate(int expirationDate){
		this.expirationDate = expirationDate;
	}
	public void setSex(char sex){
		this.sex = sex;
	}
	//TODO: Write the setAll method. Remember to include documentation.
	public void setAll(String surname, String givenName, String uscisNumber, String countryOfOrigin,
	int birthday, int validFromDate, int expirationDate, char sex){
		this.setSurname(surname);
		this.setGivenName(givenName);
		this.setUscisNumber(uscisNumber);
		this.setCountryOfOrigin(countryOfOrigin);
		this.setBirthday(birthday);
		this.setValidFromDate(validFromDate);
		this.setExpirationDate(expirationDate);
		this.setSex(sex);
	}
}