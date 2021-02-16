import java.util.Scanner;

public class Pet {
	
	private static final String True = null;


	public static void main(String[] args) {
	  Scanner scnr = new Scanner(System.in);
	  System.out.println("Hello what kind of pet do you have.");
	  String petType = scnr.nextLine();	
	  }  	


	    public static void checkIn(String petType){
	      Scanner scnr = new Scanner(System.in);
	      int dogSpaces = 30;
	      int catSpaces = 12;
	        if (petType == "dog"){
	            if (dogSpaces >= 1){
	              dogSpaces = dogSpaces - 1;

	              Dog aDog = new Dog();
	              System.out.println("Help us keep our records up to date.");
	              System.out.println("Here is what we currently have on record:");
	              aDog.recordPrint();

	              System.out.println("Please enter the correct dog name:");
	              String correctName = scnr.nextLine();
	              aDog.setDogName(correctName);

	              System.out.println("Please enter the correct dog age:");
	              int correctAge = scnr.nextInt();
	              aDog.setDogAge(correctAge);

	              System.out.println("Please enter the correct dog weight:");
	              int correctWeight = scnr.nextInt();
	              aDog.setWeight(correctWeight);

	              System.out.println("My updated records now say:");
	              aDog.recordPrint();

	              System.out.println("How long will your pet be visiting?");
	              int lengthOfStay = scnr.nextInt();

	              if (lengthOfStay >= 2){
	              System.out.println("Would you like Grooming for your pet?");
	              boolean grooming = scnr.nextBoolean();
	              if (grooming){
	                aDog.setGrooming(True);
	              }
	              else{
	                aDog.setGrooming(False);
	              }
	            }
	              else{
	              System.out.println("Unfortunatly your pet is not eligible for grooming sevices.");
	            }
	              System.out.println("Please enter the space number the pet will be staying in");
	              int spaceNbr = scnr.nextInt();
	              aDog.setSpaceNbr(spaceNbr);

	              System.out.println ("Thank you for checking in with pet BAG!");
	              }

	            else{
	            System.out.println("Sorry there are no available spaces at this time.");
	            }
	          }

	        else if (petType == "cat"){


	        if (petType == "cat"){
	            if (catSpaces >= 1){
	              catSpaces = catSpaces - 1;

	              Cat aCat = new Cat();
	              System.out.println("Help us keep our records up to date.");
	              System.out.println("Here is what we currently have on record:");
	              aCat.recordPrint();

	              System.out.println("Please enter the correct cat name:");
	              String correctName = scnr.nextLine();
	              aCat.setCatName(correctName);

	              System.out.println("Please enter the correct cat age:");
	              int correctAge = scnr.nextInt();
	              aCat.setCatAge(correctAge);

	              System.out.println("Please enter the correct cat weight:");
	              int correctWeight = scnr.nextInt();
	              aCat.setWeight(correctWeight);

	              System.out.println("My updated records now say:");
	              aCat.recordPrint();

	              System.out.println("How long will your pet be visiting?");
	              int lengthOfStay = scnr.nextInt();

	              System.out.println("Please enter the space number the pet will be staying in");
	              int spaceNbr = scnr.nextInt();
	              aCat.setSpaceNbr(spaceNbr);

	              System.out.println ("Thank you for checking in with pet BAG!");
	            }

	              
	              }

	            else{
	            System.out.println("Sorry there are no available spaces at this time.");
	            }
	          }

	        else{
		          System.out.println("sorry we dont board pets of that type currently");
		        }
	        
	      };

	      


	    public void checkOut(String petType, String petName, int lengthOfStay) {
	    	
	    	if (petType == "dog") {
	    		
	    		int space = a.getDogSpaceNbr();
	    		int weight = a.getDogWeight();
	    		boolean grooming = a.getGrooming();
	    		double checkOutTotal = 0.0;
	    		double boardingFee = 0.0;
	    		double groomingFee = 0.0;
	    		int length = lengthOfStay;
	    		
	    		if (weight >= 30) {
	    			boardingFee = 34.00;
	    			groomingFee = 29.95;
	    			checkOutTotal = boardingFee * length;
	    			if (grooming) {
	    				checkOutTotal = checkOutTotal + length;
	    				System.out.println("Your total for " + petName + " for " + length + " days is " + checkOutTotal);
	    			}
	    			else{
	    				System.out.println("Your total for " + petName + " for " + length + " days is " + checkOutTotal);
	    			}
	    			
	    		if (weight < 30 && weight >= 20) {
	        		boardingFee = 29.00;
	        		groomingFee = 24.95;
	        		checkOutTotal = boardingFee * length;
	        		if (grooming) {
	        			checkOutTotal = checkOutTotal + length;
	        			System.out.println("Your total for " + petName + " for " + length + " days is " + checkOutTotal);
	        			}
	        		else{
	        			System.out.println("Your total for " + petName + " for " + length + " days is " + checkOutTotal);
	        			}
	        	}
	        			
	        	if (weight < 20) {
	            	boardingFee = 24.00;
	            	groomingFee = 19.95;
	            	checkOutTotal = boardingFee * length;
	            	if (grooming) {
	            		checkOutTotal = checkOutTotal + length;
	            		System.out.println("Your total for " + petName + " for " + length + " days is " + checkOutTotal);
	            			}
	            	else{
	            		System.out.println("Your total for " + petName + " for " + length + " days is " + checkOutTotal);
	            			}
	}


	}
	}
	    		if (petType == "cat") {
	    			int space = aCat.getCatSpaceNbr();
	        		double checkOutTotal = 0.0;
	        		double boardingFee = 0.0;
	        		int length = lengthOfStay;
	        		}
	    		
	    
	    }
	    		}


