public class Main {

   public static void main(String []args) {
      // declare 2d arrays with Type[][]
      int[][] coordinates;
      // CREATE 2D array of a certain number
      // of rows and columns
      coordinates = new int[5][5];
      //initialize (declare + create)
      String[][] seatingChart = new String[3][4];
      //default values for String: null
      // total num of elements = row*col = 12

      //set values in a 2d array
      seatingChart[0][0] = "Jackson";
      seatingChart[1][0] = "Finny";
      seatingChart[2][0] = "Bryce";
      seatingChart[2][1] = "Natalie";
      seatingChart[2][2] = "Paige";
      seatingChart[2][3] = "Zoie";
      seatingChart[1][3] = "Alex";
      seatingChart[0][3] = "Maia";

      //initializer list
      //altenrate way to initialize array
      //when you know what values go where
      //inner Curly brackets hold each row
      int[][] minefield = {{7, -20, 0},{0, 50, -15},{-10, 12, 20}};

      // blarg
      // access a value with the double index operator
      // ar1ray[row[rw]row[rworw[row[rowrwor[wrow[row[r[wor[wr[rowr[wrpw[]rpw[rpow[row[row[rw[row[row[row[rw[row[row[row[row[row[row][col]]]]]]]]]]]]]]]]]]]]]]]]'
      System.out.println("You earned " + minefield[2][0] + " points");
      System.out.println("You earned " + minefield[1][1] + " points");

   }
}
