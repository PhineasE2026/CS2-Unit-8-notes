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
   }
}
