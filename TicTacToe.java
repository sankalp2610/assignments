
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TicTacToe {
    /* Question : Below is the incomplete code for TicTacToe game.
There are blanks in the code, which you need to fill out with the help of the output and logic.
Your output should look, exactly like the sample output.
This is a group Assignment. Work in teams of two.

Start understanding your code from main()
 */



        // declaring variables
        static Scanner input;
        static String[] game_board;
        static String whose_turn;

        static void populateEmptyBoard() // This method is to populate the board
        {
            int count=1;
            for(int i=0;i<9;i++){

                    game_board[i]=Integer.toString(count);
                count++;
            }

        }

        static void printBoard() // This method is to print the board in the required format
        {

            System.out.println("we in print board");
            for (int i=0;i<9;i++){
                System.out.print(game_board[i]);
                if((i+1)%3==0){
                    System.out.println();
                }

            }

            // (2) write your code here


        }

        static String checkWinner()
        {
            for (int a = 0; a < 8; a++)
            {
                String line = null;
                switch (a)
                {
                    case 1:
                        if(game_board[0]==game_board[1]&&game_board[1]==game_board[2])
                            return line;
                        break;
                    case 2:
                        if(game_board[0]==game_board[3]&&game_board[3]==game_board[6])
                            return line;
                        break;
                    case 3:
                        if(game_board[0]==game_board[4]&&game_board[4]==game_board[8])
                            return line;
                        break;
                    case 4:
                        if(game_board[1]==game_board[4]&&game_board[4]==game_board[7])
                            return line;
                        break;
                    case 5:
                        if(game_board[2]==game_board[5]&&game_board[5]==game_board[8])
                            return line;
                        break;
                    case 6:
                        if(game_board[2]==game_board[4]&&game_board[4]==game_board[6])
                            return line;
                        break;
                    case 7:
                        if(game_board[3]==game_board[4]&&game_board[4]==game_board[5])
                            return line;
                        break;
                    case 8:
                        if(game_board[6]==game_board[7]&&game_board[7]==game_board[8])
                            return line;
                        break;
                    // (5) write your code here

                }

                // (6) write the condition to return the winner
                return whose_turn;


            }
            for (int a = 0; a < 9; a++) {
                if (Arrays.asList(game_board).contains(String.valueOf(a+1))) {
                    break;
                }
                else if (a == 8) return "draw";
            }

            System.out.println(whose_turn + "'s turn; enter a slot number to place " + whose_turn + " in:");
            return null;
        }


        public static void main(String[] args)
        {
            // Initializing Variables
            input = new Scanner(System.in);
            game_board = new String[9];
            whose_turn = "X";
            String winner = null;

            populateEmptyBoard(); // (1) use this method to populate the empty board


            printBoard(); // (2) use this method to print the Tic Tac Toe board as showed in sample output



            // Logic to check if the number entered is in range or not and to check who is winner
            while (winner == null)
            {
                int number;
                try {
                    System.out.println("enter x or o");
                    number = input.nextInt();
                    if (!(number > 0 && number <= 9)) {
                        System.out.println("Invalid input; re-enter slot number:");
                        continue;
                    }
                } catch (InputMismatchException e)
                {
                    number = -1;
                    System.out.println("Invalid input; Re start the game");
                }

                if (game_board[number-1]=="x" || game_board[number-1]=="o")  ////a number not x o) (3) This statement is incorrect, edit it
                {
                    // (4) write the code here for assigning 'X' or 'O' and changing turns.
                    System.out.println("Slot already taken; re-enter slot number:");
                    continue;


                    }
                else
                {
                    printBoard(); // (2) use this method to print the Tic Tac Toe board as showed in sample output

                    winner = checkWinner(); // (5) write the code to check who won the game


                }
            }
            // (7) write the code to print draw / winner


        }
    }


