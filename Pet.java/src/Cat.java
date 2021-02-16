
public class Cat {
	private String catName;
  	private int catAge;
  	public int catSpaceNbr;
  	public int catWeight;


  	/* constructor Methods */

  	public Cat() {
  		catName = "Placeholder";
  		catAge = 0;
  		catSpaceNbr = 0;
  		catWeight = 0;

  	}

  	public Cat(String name, int age, int spaceNbr, int weight, boolean questionGrooming) {
  		catName = name;
  		catAge = age;
  		catSpaceNbr = spaceNbr;
  		catWeight = weight;
  	}

  	/* Setter Methods */

  	public void setCatName(String name) {
  		catName = name;
  	}

  	public void setCatAge(int age) {
  		catAge = age;
  	}

  	public void setSpaceNbr(int spaceNbr) {
  		catSpaceNbr = spaceNbr;
  	}

  	public void setWeight(int weight) {
  		catWeight = weight;
  	}

  	/* end of setter methods */

  	/* getter methods */

  	public String getCatName() {
  		return catName;
  	}

  	public int getCatAge() {
  		return catAge;
  	}

  	public int getCatSpaceNbr() {
  		return catSpaceNbr;
  	}

  	public int getCatWeight() {
  		return catWeight;
  		}


  	/* end of getter methods */

  	/* information Output Method */

  	public void recordPrint() {
  		System.out.println("Name: " + catName);
  		System.out.println("Age: " + catAge);
  		System.out.println("Space Number: " + catSpaceNbr);
  		System.out.println("Weight: " + catWeight);
  	}


  }

