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
    }
    }
}
