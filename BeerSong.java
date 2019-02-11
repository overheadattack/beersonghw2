public class BeerSong {

    public static void main(String[] args) {
        Ninety_Nine_Bottles_of_Beer();
    }


    public static void Ninety_Nine_Bottles_of_Beer(){

        int beerNumber = 99;
        String word = "bottles";
	while (beerNumber > 0){

	    System.out.println(beerNumber + " " + word + " of beer on the wall, " + beerNumber + " " + word + " of beer");
            beerNumber = beerNumber - 1;


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
