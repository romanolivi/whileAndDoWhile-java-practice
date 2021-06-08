package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int count = 0;

	    // WHILE LOOP HAS THE SAME OUTPUT HAS FOR LOOP BELOW, BUT LESS TO TYPE

	    while(count != 6) {
	        System.out.println("Count value is " + count);
	        count++;
        }

	    count = 1;
	    while(true) {
	    	if(count == 6) {
	    		break;
			}
	    	System.out.println("Count value is " + count);
	    	count++;
		}

	    do {
	    	System.out.println("Count value is " + count);
	    	count++;

	    	if(count > 100) {
	    		break;

			}
		} while(count != 6);

	    // FOR LOOP BELOW IS IDENTICAL TO WHILE LOOP ABOVE

	    for(count = 1; count != 6; count++) {
	    	System.out.println("Count value is " + count);
		}

	    int number = 4;
	    int finishNumber = 20;

	    int newCount = 0;
	    while (number <= finishNumber) {
	    	number ++;
	    	if(!isEvenNumber(number)) {
	    		continue;
			} else {
				newCount++;
				System.out.println("Even number " + number);
			}

	    	if(newCount == 5) {
	    		break;
			}
		}
    }


    // Method to determine if number is even

    public static boolean isEvenNumber(int num) {
    	if(num % 2 == 0) {
    		return true;
		} else {
    		return false;
		}
	}
}
