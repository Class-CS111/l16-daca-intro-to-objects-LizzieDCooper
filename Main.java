/********************************************
*	DEVELOPER:	<name>
* COLLABORATORS: <names>
*	LAST MODIFIED:	<date>
********************************************/
/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/

class Main 
{
  public static void main(String[] args) 
	{
    //TODO PART 3: test your setter/getter here!

    DACArecipient test = new DACArecipient();
    DACArecipient test2 = new DACArecipient();

    test.setAll("Cooper", "Lizzie", "12-06-006", 
    "US", 03052005, 03052023, 03052027, 'F');
    
    test2.setAll("Mendez", "Javier", "56-3-445", 
    "Venezuela", 2451564, 3956753, 3956840, 'M');

    System.out.println("");
    System.out.println("Person 1");
    System.out.println("-----------------------------");
    System.out.println("Surname: " + test2.getSurname());
    System.out.println("Given name: " + test2.getGivenName());
    System.out.println("USCIS Number: " + test2.getUscisNumber());
    System.out.println("Country of Origin: " + test2.getCountryOfOrigin());
    System.out.println("Birthday(JDN): " + test2.getBirthday());
    System.out.println("Valid From Date(JDN): " + test2.getValidFromDate());
    System.out.println("Expiration Date(JDN): " + test2.getExpirationDate());
    System.out.println("Sex: " + test2.getSex());
    System.out.println("```");
  }
}