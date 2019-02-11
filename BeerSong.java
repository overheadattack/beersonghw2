package beersong;
//run on netbeans code language java
public class BeerSong {

    public static void main(String[] args) {
        Ninety_Nine_Bottles_of_Beer(); //calls the function
    }


    public static void Ninety_Nine_Bottles_of_Beer(){

        int beerNumber = 99;//intialized the beer numbers
        String word = "bottles";//uses for to print the word bottles
        //while loop to run through the 99 bottles
	while (beerNumber > 0){

	    System.out.println(beerNumber + " " + word + " of beer on the wall, " + beerNumber + " " + word + " of beer");
            beerNumber = beerNumber - 1;

        //declairing the if statement conditions of the while loop
	if (beerNumber == 1){
           word = "bottle"; //when the number equals 1
           }

	if(beerNumber > 0) {
            System.out.println("Take one down, pass it round " + beerNumber + " " + word + " of beer");
            }
        if (beerNumber == 0) {
            System.out.println("No more bottles of beer");
        }
    }
    }
}
