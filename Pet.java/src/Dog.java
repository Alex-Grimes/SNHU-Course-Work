
public class Dog {
	private String dogName;
  	private int dogAge;
  	public int dogSpaceNbr;
  	public int dogWeight;
  	public boolean grooming;

  	/* constructor Methods */

  	public Dog() {
  		dogName = "Placeholder";
  		dogAge = 0;
  		dogSpaceNbr = 0;
  		dogWeight = 0;
  		this.grooming = false;
  	}

  	public Dog(String name, int age, int spaceNbr, int weight, boolean questionGrooming) {
  		dogName = name;
  		dogAge = age;
  		dogSpaceNbr = spaceNbr;
  		dogWeight = weight;
  		grooming = questionGrooming;
  	}

  	/* Setter Methods */

  	public void setDogName(String name) {
  		dogName = name;
  	}

  	public void setDogAge(int age) {
  		dogAge = age;
  	}

  	public void setSpaceNbr(int spaceNbr) {
  		dogSpaceNbr = spaceNbr;
  	}

  	public void setWeight(int weight) {
  		dogWeight = weight;
  	}

  	public void setGrooming(boolean groomingStatus) {
  		groomingStatus = grooming;

  	}

  	/* end of setter methods */

  	/* getter methods */

  	public String getDogName() {
  		return dogName;
  	}

  	public int getDogAge() {
  		return dogAge;
  	}

  	public int getDogSpaceNbr() {
  		return dogSpaceNbr;
  	}

  	public int getDogWeight() {
  		return dogWeight;
  		}

  	public boolean getGrooming() {
  		return grooming;
  		}

  	/* end of getter methods */

  	/* information Output Method */

  	public void recordPrint() {
  		System.out.println("Name: " + dogName);
  		System.out.println("Age: " + dogAge);
  		System.out.println("Space Number: " + dogSpaceNbr);
  		System.out.println("Weight: " + dogWeight);
  		System.out.println("Grooming: " + grooming);
  	}


  }

