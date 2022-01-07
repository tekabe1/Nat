package practiceJava;

public class JavaPrcts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    int day=4;
    String dayname;
    switch(day)
    {
    case 1:
    	dayname="Sunday";
    	break;
    case 2:
    	dayname="Monday";
    	break;
    case 3:
    	dayname="Tuesday";
    	break;
    case 4:
    	dayname="Wedensday";
    	break;
    case 5:
    	dayname="Thursday";
        break;    	 
    case 6:
    	dayname="Friday";
    	break;
    default:
    	dayname="Saturday";
    	break;    }
	System.out.println(" Today is " + dayname);
    
    
	}

}
