
import java.util.*;


class handCricket{
    int playerScore;
    int computerScore;
    public int check = 0;
    Random rd;
    Scanner in;

    handCricket(Scanner in, Random rd){
        this.playerScore = 0;
        this.computerScore = 0;
        this.in = in;
        this.rd = rd;
    }

    public void playerBat(){
        if (check == 0){
            System.out.println("Player bats first");
            check = 1;
        }
        else{
            System.out.println("Player bats second");
            check = 0;
        }
        
        int choicePlay4;
        int choiceComp3;
        
        while (true){
            while(true){
                try{
                    System.out.print("Player choice between 1 to 6: ");
                    choicePlay4 = in.nextInt();
                    if(choicePlay4 < 1 || choicePlay4 > 6){
                        continue;
                    }
                    break;
                }
                catch(Exception e){
                    System.out.print("Enter valid data!\n");
                }
                
            }
            choiceComp3 = rd.nextInt(1,7);
            System.out.println("Computer choice : " + choiceComp3);
            if (choiceComp3 == choicePlay4){
                System.out.println("Player out");

                // Second bats computer or game over
                if (check == 1){
                    computerBat();
                }
                else{
                    if (playerScore > computerScore){
                        System.out.println("Player Score : " + playerScore);
                        System.out.println("Computer Score : " + computerScore);
                        System.out.println("Player wins!");
                    }
                    if (computerScore > playerScore){
                        System.out.println("Computer Score : " + computerScore);
                        System.out.println("Player Score : " + playerScore);
                        System.out.println("Computer wins!");
                    }
                    System.out.println("Game Over");
                    
                }
                break;
                
            }
            else{
                playerScore += choicePlay4;

                if (check == 0){
                    if (playerScore > computerScore) {
                        System.out.println("Player Score : " + playerScore);
                        System.out.println("Computer Score : " + computerScore);
                        System.out.println("Player wins!");
                        System.out.println("Game Over");
                        break;
                    }
                    
                }

            }
        }


    }

    public void computerBat(){
        if (check == 0){
            System.out.println("Computer bats first");
            check = 1;
        }
        else{
            System.out.println("Computer bats second");
            check = 0;
        }

        int choicePlay5;
        int choiceComp4;
        
        while (true) {
            while (true) {
                try {
                    System.out.print("Player choice between 1 to 6: ");
                    choicePlay5 = in.nextInt();
                    if (choicePlay5 < 1 || choicePlay5 > 6) {
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.print("Enter valid data !\n");
                }

            }
            choiceComp4 = rd.nextInt(1, 7);
            System.out.println("Computer choice : " + choiceComp4);
            if (choiceComp4 == choicePlay5) {
                System.out.println("Computer out");

                // Second bats computer or game over
                if (check == 1){
                    playerBat();
                }
                else {
                    if (playerScore > computerScore) {
                        System.out.println("Player Score : " + playerScore);
                        System.out.println("Computer Score : " + computerScore);
                        System.out.println("Player wins!");
                    }
                    if (computerScore > playerScore) {
                        System.out.println("Computer Score : " + computerScore);
                        System.out.println("Player Score : " + playerScore);
                        System.out.println("Computer wins!");
                    }
                    System.out.println("Game Over");
                    
                }
                break;
            } 
            else {
                computerScore += choiceComp4;

                // If second bats then they might win if they beat 1st played team.

                if (check == 0){
                    if (computerScore > playerScore){
                        System.out.println("Computer Score : " + computerScore);
                        System.out.println("Player Score : " + playerScore);
                        System.out.println("Computer wins!");
                        System.out.println("Game Over");
                        break;
                    }
                    
                }
                
            }
        }

    }

    public static void main(String[] args) {
        
        System.out.println(" Game Starts");
        Scanner in = new Scanner(System.in);
        Random rd = new Random();
        handCricket obj = new handCricket(in, rd);

        int toss;
        System.out.print("odd or even : ");
        while(true){
            String choicePlay1 = in.next();
            
            if(choicePlay1.equals("odd")){
                toss = 1;
                break;
            }
            else if(choicePlay1.equals("even")){
                toss = 0;
                break;
            }
            else{
                System.out.print("odd or even : ");
                continue;
            }

        }
        
        int choicePlay2;
    
        while(true){
            try{
                System.out.print("Player choice between 1 to 6: ");
                choicePlay2 = in.nextInt();
                if(choicePlay2 < 1 || choicePlay2 > 6){
                    
                    continue;
                }

                break;
            }
            catch(Exception e){
                System.out.print("Enter valid data!\n");
            }
        }

        int choiceComp1 = rd.nextInt(1,7);
        System.out.println("Computer choice : "+choiceComp1);

        int total1 = choiceComp1 + choicePlay2;

        String choicePlay3;

        if ((toss % 2 == 0) && (total1 % 2 == 0)){
            System.out.println("Player wins toss.");
            System.out.print("Choose to bat or bowl : ");


            

            choicePlay3 = in.next();
            if (choicePlay3.equals("bat")){
                obj.playerBat();
               
            }
            else if(choicePlay3.equals("bowl")){
                obj.computerBat();
                
            }
            else{
                System.out.print("Choose to bat or bowl : ");
                
            }

            


        }
        else if((toss % 2 != 0) && (total1 % 2 != 0)){
            System.out.println("Player wins toss.");
            System.out.print("Choose to bat or bowl : ");


            

            choicePlay3 = in.next();
            if (choicePlay3.equals("bat")) {
                obj.playerBat();
                
            } 
            else if (choicePlay3.equals("bowl")) {
                obj.computerBat();
               
            } 
            else {
                System.out.print("Choose to bat or bowl : ");
                
            }

            
     
        }
        else{
            System.out.println("Computer wins toss.");

            String[] choices = {"bat","bowl"};

            String choiceComp2 = choices[rd.nextInt(2)];
            System.out.println("Computer opted " + choiceComp2);
            if (choiceComp2.equals("bat")){
                obj.computerBat();
            }
            else{
                obj.playerBat();
            }



        }

        System.out.println("END");
    }
}