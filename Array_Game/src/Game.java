
import java.util.Scanner;

public class Game {
	
	public static void questions(int v) { // method to store questions and print when called upon
		String []questions=new String[10];
		questions[0]="What is the term for a word that is similar in meaning to another word?";
		questions[1]="How many states are in the United States of America?";
		questions[2]="Earth is located in what galaxy?";
		questions[3]="What number is the Roman numeral XVI? ";
		questions[4]="First Julius Caesar was the emperor of what empire?";
		questions[5]="What phenomenon might be felt on the surface when two tectonic plates rub against each other?";
		questions[6]="What type of word is “truthfully\"?";
		questions[7]="What attaches muscles to bones?";
		questions[8]="The region known as the “Fertile Crescent” is located where in present day?";
		questions[9]="You collect 48 pieces of Halloween candy." + 
				"Your parents say you can eat 2 pieces per day, plus an extra piece on Saturdays and Sundays." + 
				"How many weeks/days will it take to finish all of your candy?";
		System.out.println(questions[v]);

	}
	public static void mc_answer(int g) { // method to store answers and print when called upon
		String [][]mc_answer=new String[10][4];
		mc_answer[0][0]= "A. Flashback";
		mc_answer[0][1]= "B. Synonym";
		mc_answer[0][2]= "C. Renaissance";
		mc_answer[0][3]= "D. Antonyms";

		mc_answer[1][0]= "A. 53";
		mc_answer[1][1]= "B. 52";
		mc_answer[1][2]= "C. 49";
		mc_answer[1][3]= "D. 50";

		mc_answer[2][0]= "A. Tadpole Galaxy";
		mc_answer[2][1]= "B. Milky Way";
		mc_answer[2][2]= "C. Stephan's Quintet";
		mc_answer[2][3]= "D. Hoag's Object";

		mc_answer[3][0]= "A. 15";
		mc_answer[3][1]= "B. 13";
		mc_answer[3][2]= "C. 16";
		mc_answer[3][3]= "D. 18";

		mc_answer[4][0]= "A. Mongol Empire";
		mc_answer[4][1]= "B. The Roman Empire";
		mc_answer[4][2]= "C. Ottoman Empire";
		mc_answer[4][3]= "D. Portuguese Empire";

		mc_answer[5][0]= "A. Earthqauke";
		mc_answer[5][1]= "B. Tsunami";
		mc_answer[5][2]= "C. Tornado";
		mc_answer[5][3]= "D. Floods";

		mc_answer[6][0]= "A. Pronoun";
		mc_answer[6][1]= "B. Verb";
		mc_answer[6][2]= "C. Noun";
		mc_answer[6][3]= "D. Adverb";

		mc_answer[7][0]= "A. Elastic";
		mc_answer[7][1]= "B. Tendons";
		mc_answer[7][2]= "C. Nerves";
		mc_answer[7][3]= "D. Veins";

		mc_answer[8][0]= "A. Africa";
		mc_answer[8][1]= "B. UAE";
		mc_answer[8][2]= "C. Middle East";
		mc_answer[8][3]= "D. Kuwait";

		mc_answer[9][0]= "A. 3 weeks and 4 days";
		mc_answer[9][1]= "B. 2 weeks and 5 days";
		mc_answer[9][2]= "C. 4 weeks";
		mc_answer[9][3]= "D. 3 weeks";

		for(int x=0; x<=mc_answer[0].length-1; x++) {
			System.out.println(mc_answer[g][x]);
		}


	}

	public static void main(String[] args) {
		int []money=new int[20]; // array to hold money values
		money[0]=1000;
		money[1]=1000;

		money[2]=2000;
		money[3]=2000;

		money[4]=3000;
		money[5]=3000;

		money[6]=4000;
		money[7]=4000;

		money[8]=5000;
		money[9]=5000;


		int prize = 0;
		int prize2 = 0;
		System.out.println("Welcome to Are You Smarter Then A 5th Grader\n");

		System.out.println("Here are the rules and instructions to play the game:\n");// print game rules and instructions

		System.out.println("1. The game begins by asking you for a sample game of full game which you decide with 1 or 2.");
		System.out.println("2. If the sample game is chosen, you will see a game sample and you will need to restart to select the full game.");
		System.out.println("3. If the full game is chosen, game will let you know that and allow you to choose a category with numbers\n   and don’t worry if you input the wrong number as you can try again but if you put a character the game will not work.");
		System.out.println("4. After that categories will be shown and they will always be shown after both players answer their respective questions.");
		System.out.println("5. You then will choose that category, and will be questioned.");
		System.out.println("6. When answering the questions, you have to be careful to choose a letter from A to D as you will not\n   get another try to choose if any wrong character is inputted. ");
		System.out.println("7. After you answer the question, you will be shown how much money you have made in that question\n   and how much money you have in total.");
		System.out.println("8. IMPORTANT: Do not try to cheat the game and choose a category again as you will lose a turn and will\n   not get any money from that question. ");
		System.out.println("9. At the end of the game, the player’s winnings will be compared and player with the most cash walks\n   away with it and if a tie occurs, no player wins.");
		System.out.println("10.The game begins by asking you for a sample game of full game which you decide with 1 or 2.\n");
		System.out.println("You may now begin to play the game :)\n");

		System.out.println("Here are the categories that 2 players will be completing in.\n");

		
		

		String[][] matrix = { // array to hold categories
				{ "Grade 1:", "	Grade 2:", "	Grade 3:", "	Grade 4:", "	Grade 5:"  },
				{ "English(1)", "	Astronomy(3)", "	History(5)", "	English(7)", "	History(9)" },
				{ "Geography(2)", "	Maths(4)", "	Science(6)", "	Science(8)", "	Maths(10)" }
		};


		for (int i = 0; i < matrix.length; i++) { // prints categories    
			for (int j = 0; j < matrix[i].length; j++) {   
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(); 
		}

		System.out.println("\nChoosing grade 1 gives $1000,grade 2 gives $2000, grade 3 gives $3000 and so on");
		System.out.println("\nTo choose a category, please input the number in the brakcets ()\n");
		System.out.println("Would You Like To See a Sample Game or Would You Like To Play A Tutorial Game For One Player? (Press 1 for Sample Game or 2 for Full Game)");
		Scanner game = new Scanner( System.in ); //initialize scanner class

		boolean fixed = false; 
		double input = 0; // creates input variable

		while (!fixed) {//checks to see if input is valid
			input = game.nextDouble();	// stores values inputed by player 1

			if(input==1) { //prints sample game
				fixed = true;
				System.out.println("Tutorial Game Selected\n");
				System.out.println("So, in the full game you will be given a category to choose\nbut here, you will be given a question where we assume you have choosen Grade 1 Math");

				System.out.println("\nHere is your question:\n");
				System.out.println("What is 1 + 1?\n");

				System.out.println("The computer will give you a multiple choice where you will choose an answer.");
				System.out.println("If you choose the right answer, you will get the money, if not then you are simply incorrect.");
				System.out.println("Please restart the game to play the full version.");
			}

			else if(input==2) {//prints full game
				fixed = true;
				System.out.println("Full Game Selected");

				for(int x =0; x<5 ; x++) { // runs questions 5 times

					System.out.println("\nTake a look at the categories:");

					for (int i = 0; i < matrix.length; i++) {    //prints categories     
						for (int j = 0; j < matrix[i].length; j++) {   
							System.out.print(matrix[i][j] + " ");
						}
						System.out.println(); 
					}

					System.out.println("\nTo choose a category, please input the number in the brakcets ()\n");

					System.out.println("Player 1, Please Select a Category:"); //asks for category choice
					Scanner category = new Scanner( System.in );

					boolean Y = false;
					int P1 = 0; // creates P1 variable

					while(!Y) {//checks to see if input is valid
						P1 = category.nextInt();	// stores input in P1 variable

						if (P1 == 1) { //category 1 chosen
							Y = true;
							System.out.println("You have choosen English Grade 1");
							System.out.println("Here is your question:\n");

							questions(0);//prints question
							System.out.print("\n");
							mc_answer(0);//prints options

							System.out.println("Enter your answer below");
							Scanner answer = new Scanner( System.in );
							String B = answer.next();// inputs answer

							if (B.equals("b")||B.equals("B")) { // checks answer
								System.out.println("You are correct!");		
								prize = prize + money[0];

								if (money[0] == 0) { // makes sure answer is not chosen again
									System.out.println("But... you choose an already answered category, you answered the right answer but make no money");
								}

								money [0] = 0;
								System.out.println("You have made $" + prize + " dollars in total");


							}
							else { // if incorrect answer chosen
								System.out.println("You are incorrect!");

								if (money[0] == 0) {
									System.out.println("And you choose an already answered category");
								}
								money [0] = 0;

							}

						}


						else if (P1 == 2) { //category 2 chosen
							Y = true;
							System.out.println("You have choosen Geography Grade 1");
							System.out.println("Here is your question:");

							questions(1);//prints question
							System.out.print("\n");
							mc_answer(1);//prints options

							System.out.println("Enter your answer below");
							Scanner answer = new Scanner( System.in );
							String B = answer.next();// inputs answer

							if (B.equals("D")||B.equals("d")) {// checks answer
								System.out.println("You are correct!");
								prize = prize + money[1];

								if (money[1] == 0) {// makes sure answer is not chosen again
									System.out.println("But... you choose an already answered category, you answered the right answer but make no money");
								}

								money [1] = 0;

								System.out.println("You have made $" + prize + " dollars");


							}
							else {// if incorrect answer chosen
								System.out.println("You are incorrect!");

								if (money[1] == 0) {
									System.out.println("And you choose an already answered category");
								}
								money [1] = 0;
							}
						}

						else if (P1 == 3) {//category 3 chosen
							Y = true;
							System.out.println("You have choosen Astronmy Grade 2");
							System.out.println("Here is your question:");

							questions(2);//prints question
							System.out.print("\n");
							mc_answer(2);//prints options

							System.out.println("Enter your answer below");
							Scanner answer = new Scanner( System.in );
							String B = answer.next();// inputs answer

							if (B.equals("B")||B.equals("b")) {// checks answer
								System.out.println("You are correct!");
								prize = prize + money[2];

								if (money[2] == 0) {// makes sure answer is not chosen again
									System.out.println("But... you choose an already answered category, you answered the right answer but make no money");
								}

								money [2] = 0;
								System.out.println("You have made $" + prize + " dollars");
							}
							else {// if incorrect answer chosen
								System.out.println("You are incorrect!");
								if (money[2] == 0) {
									System.out.println("And you choose an already answered category");
								}
								money [2] = 0;

							}
						}

						else if (P1 == 4) {//category 4 chosen
							Y = true;
							System.out.println("You have choosen Maths Grade 2");
							System.out.println("Here is your question:");

							questions(3);//prints question
							System.out.print("\n");
							mc_answer(3);//prints options

							System.out.println("Enter your answer below");
							Scanner answer = new Scanner( System.in );
							String B = answer.next();// inputs answer

							if (B.equals("C")||B.equals("c")) {// checks answer
								System.out.println("You are correct!");
								prize = prize + money[3];

								if (money[3] == 0) {// makes sure answer is not chosen again
									System.out.println("But... you choose an already answered category, you answered the right answer but make no money");
								}

								money [3] = 0;
								System.out.println("You have made $" + prize + " dollars");
							}
							else {// if incorrect answer chosen
								System.out.println("You are incorrect!");
								if (money[3] == 0) {
									System.out.println("And you choose an already answered category");
								}
								money [3] = 0;
							}
						}


						else if (P1 == 5) {//category 5 chosen
							Y = true;
							System.out.println("You have choosen History Grade 3");
							System.out.println("Here is your question:");

							questions(4);//prints question
							System.out.print("\n");
							mc_answer(4);//prints options

							System.out.println("Enter your answer below");
							Scanner answer = new Scanner( System.in );
							String B = answer.next();// inputs answer

							if (B.equals("B")||B.equals("b")) {// checks answer
								System.out.println("You are correct!");
								prize = prize + money[4];

								if (money[4] == 0) {// makes sure answer is not chosen again
									System.out.println("But... you choose an already answered category, you answered the right answer but make no money");
								}

								money [4] = 0;
								System.out.println("You have made $" + prize + " dollars");
							}
							else {// if incorrect answer chosen
								System.out.println("You are incorrect!");
								if (money[4] == 0) {
									System.out.println("And you choose an already answered category");
								}
								money [4] = 0;
							}
						}

						else if (P1 == 6) {//category 6 chosen
							Y = true;
							System.out.println("You have choosen Science Grade 3");
							System.out.println("Here is your question:");

							questions(5);//prints question
							System.out.print("\n");
							mc_answer(5);//prints options

							System.out.println("Enter your answer below");
							Scanner answer = new Scanner( System.in );
							String B = answer.next();// inputs answer

							if (B.equals("A")||B.equals("a")) {// checks answer
								System.out.println("You are correct!");
								prize = prize + money[5];

								if (money[5] == 0) {// makes sure answer is not chosen again
									System.out.println("But... you choose an already answered category, you answered the right answer but make no money");
								}

								money [5] = 0;
								System.out.println("You have made $" + prize + " dollars");
							}
							else {// if incorrect answer chosen
								System.out.println("You are incorrect!");
								if (money[5] == 0) {
									System.out.println("And you choose an already answered category");
								}
								money [5] = 0;
							}
						}

						else if (P1 == 7) {//category 7 chosen
							Y = true;
							System.out.println("You have choosen English Grade 4");
							System.out.println("Here is your question:");

							questions(6);//prints question
							System.out.print("\n");
							mc_answer(6);//prints answers

							System.out.println("Enter your answer below");
							Scanner answer = new Scanner( System.in );
							String B = answer.next();// inputs answer

							if (B.equals("D")||B.equals("d")) {// checks answer
								System.out.println("You are correct!");
								prize = prize + money[6];

								if (money[6] == 0) {// makes sure answer is not chosen again
									System.out.println("But... you choose an already answered category, you answered the right answer but make no money");
								}

								money [6] = 0;
								System.out.println("You have made $" + prize + " dollars");
							}
							else {// if incorrect answer chosen
								System.out.println("You are incorrect!");
								if (money[6] == 0) {
									System.out.println("And you choose an already answered category");
								}
								money [6] = 0;
							}
						}

						else if (P1 == 8) {//category 8 chosen
							Y = true;
							System.out.println("You have choosen Science Grade 4");
							System.out.println("Here is your question:");

							questions(7);//prints question
							System.out.print("\n");
							mc_answer(7);//prints answer

							System.out.println("Enter your answer below");
							Scanner answer = new Scanner( System.in );
							String B = answer.next();// inputs answer

							if (B.equals("B")||B.equals("b")) {// checks answer
								System.out.println("You are correct!");
								prize = prize + money[7];

								if (money[7] == 0) {// makes sure answer is not chosen again
									System.out.println("But... you choose an already answered category, you answered the right answer but make no money");
								}

								money [7] = 0;
								System.out.println("You have made $" + prize + " dollars");
							}
							else {// if incorrect answer chosen
								System.out.println("You are incorrect!");
								if (money[7] == 0) {
									System.out.println("And you choose an already answered category");
								}
								money [7] = 0;
							}
						}

						else if (P1 == 9) {//category 9 chosen
							Y = true;
							System.out.println("You have choosen History Grade 5");
							System.out.println("Here is your question:");

							questions(8);//prints question
							System.out.print("\n");
							mc_answer(8);//prints answer

							System.out.println("Enter your answer below");
							Scanner answer = new Scanner( System.in );
							String B = answer.next();// inputs answer

							if (B.equals("C")||B.equals("c")) {// checks answer
								System.out.println("You are correct!");
								prize = prize + money[8];

								if (money[8] == 0) {// makes sure answer is not chosen again
									System.out.println("But... you choose an already answered category, you answered the right answer but make no money");
								}

								money [8] = 0;
								System.out.println("You have made $" + prize + " dollars");
							}
							else {// if incorrect answer chosen
								System.out.println("You are incorrect!");
								if (money[8] == 0) {
									System.out.println("And you choose an already answered category");
								}
								money [8] = 0;
							}
						}

						else if (P1 == 10) {//category 10 chosen
							Y = true;
							System.out.println("You have choosen Maths Grade 5");
							System.out.println("Here is your question:");

							questions(9);//prints question
							System.out.print("\n");
							mc_answer(9);//prints answer

							System.out.println("Enter your answer below");
							Scanner answer = new Scanner( System.in );
							String B = answer.next();// inputs answer

							if (B.equals("D")||B.equals("d")) {// checks answer
								System.out.println("You are correct!");
								prize = prize + money[9];

								if (money[9] == 0) {// makes sure answer is not chosen again
									System.out.println("But... you choose an already answered category, you answered the right answer but make no money");
								}

								money [9] = 0;
								System.out.println("You have made $" + prize + " dollars");
							}
							else {// if incorrect answer chosen
								System.out.println("You are incorrect!");
								if (money[9] == 0) {
									System.out.println("And you choose an already answered category");
								}
								money [9] = 0;
							}
						}
						else {// if wrong category number is chosen
							System.out.println("Incorrect Input! Try Again");
							System.out.println("Input the number beside the category");
						}
					}

					//player two
					System.out.println("Player 2, Please Select a Category:");
					Scanner category2 = new Scanner( System.in );

					boolean X = false;

					int P2 = 0;

					while(!X) {
						P2 = category2.nextInt(); 


						if (P2 == 1) {//category 1 chosen
							X = true;			     		 				
							System.out.println("You have choosen English Grade 1");
							System.out.println("Here is your question:");

							questions(0);//prints question
							System.out.print("\n");
							mc_answer(0);//prints answer

							System.out.println("Enter your answer below");
							Scanner answer = new Scanner( System.in );
							String B = answer.next();// inputs answer

							if (B.equals("b")||B.equals("B")) {// checks answer
								System.out.println("You are correct!");		
								prize2 = prize2 + money[0];

								if (money[0] == 0) {// makes sure answer is not chosen again
									System.out.println("But... you choose an already answered category, you answered the right answer but make no money");
								}

								money [0] = 0;

								System.out.println("You have made $" + prize2 + " dollars in total");


							}
							else {// if incorrect answer chosen
								System.out.println("You are incorrect!");
								if (money[0] == 0) {
									System.out.println("And you choose an already answered category");
								}
								money [0] = 0;
							}

						}


						else if (P2 == 2) {//category 2 chosen
							X = true;
							System.out.println("You have choosen Geography Grade 1");
							System.out.println("Here is your question:");

							questions(1);//prints question
							System.out.print("\n");
							mc_answer(1);//prints answer

							System.out.println("Enter your answer below");
							Scanner answer = new Scanner( System.in );
							String B = answer.next();// inputs answer

							if (B.equals("D")||B.equals("d")) {// checks answer
								System.out.println("You are correct!");
								prize2 = prize2 + money[1];

								if (money[1] == 0) {// makes sure answer is not chosen again
									System.out.println("But... you choose an already answered category, you answered the right answer but make no money");
								}

								money [1] = 0;


								System.out.println("You have made $" + prize2 + " dollars");
							}
							else {// if incorrect answer chosen
								System.out.println("You are incorrect!");
								if (money[1] == 0) {
									System.out.println("And you choose an already answered category");
								}
								money [1] = 0;
							}
						}

						else if (P2 == 3) {//category 3 chosen
							X = true;
							System.out.println("You have choosen Astronmy Grade 2");
							System.out.println("Here is your question:");

							questions(2);//prints question
							System.out.print("\n");
							mc_answer(2);//prints answer

							System.out.println("Enter your answer below");
							Scanner answer = new Scanner( System.in );
							String B = answer.next();// inputs answer

							if (B.equals("B")||B.equals("b")) {// checks answer
								System.out.println("You are correct!");
								prize2 = prize2 + money[2];

								if (money[2] == 0) {// makes sure answer is not chosen again
									System.out.println("But... you choose an already answered category, you answered the right answer but make no money");
								}

								money [2] = 0;

								System.out.println("You have made $" + prize2 + " dollars in total");
							}
							else {// if incorrect answer chosen
								System.out.println("You are incorrect!");
								if (money[2] == 0) {
									System.out.println("And you choose an already answered category");
								}
								money [2] = 0;
							}
						}

						else if (P2 == 4) {//category 4 chosen
							X = true;
							System.out.println("You have choosen Maths Grade 2");
							System.out.println("Here is your question:");

							questions(3);//prints question
							System.out.print("\n");
							mc_answer(3);//prints answer

							System.out.println("Enter your answer below");
							Scanner answer = new Scanner( System.in );
							String B = answer.next();// inputs answer

							if (B.equals("C")||B.equals("c")) {// checks answer
								System.out.println("You are correct!");
								prize2 = prize2 + money[3];

								if (money[3] == 0) {// makes sure answer is not chosen again
									System.out.println("But... you choose an already answered category, you answered the right answer but make no money");
								}

								money [3] = 0;

								System.out.println("You have made $" + prize2 + " dollars in total");
							}
							else {// if incorrect answer chosen
								System.out.println("You are incorrect!");
								if (money[3] == 0) {
									System.out.println("And you choose an already answered category");
								}
								money [3] = 0;
							}
						}

						else if (P2 == 5) {//category 5 chosen
							X = true;
							System.out.println("You have choosen History Grade 3");
							System.out.println("Here is your question:");

							questions(4);//prints question
							System.out.print("\n");
							mc_answer(4);//prints answer

							System.out.println("Enter your answer below");
							Scanner answer = new Scanner( System.in );
							String B = answer.next();// inputs answer

							if (B.equals("B")||B.equals("b")) {// checks answer
								System.out.println("You are correct!");
								prize2 = prize2 + money[4];

								if (money[4] == 0) {// makes sure answer is not chosen again
									System.out.println("But... you choose an already answered category, you answered the right answer but make no money");
								}

								money [4] = 0;

								System.out.println("You have made $" + prize2 + " dollars in total");
							}
							else {// if incorrect answer chosen
								System.out.println("You are incorrect!");
								if (money[4] == 0) {
									System.out.println("And you choose an already answered category");
								}
								money [4] = 0;
							}
						}

						else if (P2 == 6) {//category 6 chosen
							X = true;
							System.out.println("You have choosen Science Grade 3");
							System.out.println("Here is your question:");

							questions(5);//prints question
							System.out.print("\n");
							mc_answer(5);//prints answer

							System.out.println("Enter your answer below");
							Scanner answer = new Scanner( System.in );
							String B = answer.next();// inputs answer

							if (B.equals("A")||B.equals("a")) {// checks answer
								System.out.println("You are correct!");
								prize2 = prize2 + money[5];

								if (money[5] == 0) {// makes sure answer is not chosen again 
									System.out.println("But... you choose an already answered category, you answered the right answer but make no money");
								}

								money [5] = 0;

								System.out.println("You have made $" + prize2 + " dollars in total");
							}
							else {// if incorrect answer chosen
								System.out.println("You are incorrect!");
								if (money[5] == 0) {
									System.out.println("And you choose an already answered category");
								}
								money [5] = 0;
							}
						}

						else if (P2 == 7) {//category 7 chosen
							X = true;
							System.out.println("You have choosen English Grade 4");
							System.out.println("Here is your question:");

							questions(6);//prints question
							System.out.print("\n");
							mc_answer(6);//prints answer

							System.out.println("Enter your answer below");
							Scanner answer = new Scanner( System.in );
							String B = answer.next();// inputs answer

							if (B.equals("D")||B.equals("d")) {// checks answer
								System.out.println("You are correct!");
								prize2 = prize2 + money[6];

								if (money[6] == 0) {// makes sure answer is not chosen again
									System.out.println("But... you choose an already answered category, you answered the right answer but make no money");
								}

								money [6] = 0;

								System.out.println("You have made $" + prize2 + " dollars in total");
							}
							else {// if incorrect answer chosen
								System.out.println("You are incorrect!");
								if (money[6] == 0) {
									System.out.println("And you choose an already answered category");
								}
								money [6] = 0;
							}
						}

						else if (P2 == 8) {//category 8 chosen
							X = true;
							System.out.println("You have choosen Science Grade 4");
							System.out.println("Here is your question:");

							questions(7);//prints question
							System.out.print("\n");
							mc_answer(7);//prints answer

							System.out.println("Enter your answer below");
							Scanner answer = new Scanner( System.in );
							String B = answer.next();// inputs answer

							if (B.equals("B")||B.equals("b")) {// checks answer
								System.out.println("You are correct!");
								prize2 = prize2 + money[7];

								if (money[7] == 0) {// makes sure answer is not chosen again
									System.out.println("But... you choose an already answered category, you answered the right answer but make no money");
								}

								money [7] = 0;

								System.out.println("You have made $" + prize2 + " dollars in total");
							}
							else {// if incorrect answer chosen
								System.out.println("You are incorrect!");
								if (money[7] == 0) {
									System.out.println("And you choose an already answered category");
								}
								money [7] = 0;
							}
						}

						else if (P2 == 9) {//category 9 chosen
							X = true;
							System.out.println("You have choosen History Grade 5");
							System.out.println("Here is your question:");

							questions(8);//prints question
							System.out.print("\n");
							mc_answer(8);//prints answer

							System.out.println("Enter your answer below");
							Scanner answer = new Scanner( System.in );
							String B = answer.next();// inputs answer

							if (B.equals("C")||B.equals("c")) {// checks answer
								System.out.println("You are correct!");
								prize2 = prize2 + money[8];

								if (money[8] == 0) {// makes sure answer is not chosen again
									System.out.println("But... you choose an already answered category, you answered the right answer but make no money");
								}

								money [8] = 0;

								System.out.println("You have made $" + prize2 + " dollars in total");
							}
							else {// if incorrect answer chosen
								System.out.println("You are incorrect!");
								if (money[8] == 0) {
									System.out.println("And you choose an already answered category");
								}
								money [8] = 0;
							}
						}

						else if (P2 == 10) {//category 10 chosen
							X = true;
							System.out.println("You have choosen Maths Grade 5");
							System.out.println("Here is your question:");

							questions(9);//prints question
							System.out.print("\n");
							mc_answer(9);//prints answer

							System.out.println("Enter your answer below");
							Scanner answer = new Scanner( System.in );
							String B = answer.next();// inputs answer

							if (B.equals("D")||B.equals("d")) {// checks answer
								System.out.println("You are correct!");
								prize2 = prize2 + money[9];

								if (money[9] == 0) {// makes sure answer is not chosen again
									System.out.println("But... you choose an already answered category, you answered the right answer but make no money");
								}

								money [9] = 0;

								System.out.println("You have made $" + prize2 + " dollars in total");
							}
							else {// if incorrect answer chosen
								System.out.println("You are incorrect!");
								if (money[9] == 0) {
									System.out.println("And you choose an already answered category");
								}
								money [9] = 0;
							}
						}
						else { //if wrong category is chosen
							System.out.println("Incorrect Input! Try Again");
							System.out.println("Input the number beside the category");

						}
					}

				}
			}

			else { //if no game type is selected
				System.out.println("Invalid Input, Try Again");
				System.out.println("(Press 1 for Sample Game or 2 for Full Game)");
			}     	

		}
		if (input == 2) { // if full game was played
			System.out.println("\n\nCongratualtions for making it to the end of todays game.\nLets figure out who the winner is:");
			if (prize>prize2) {
				System.out.println("AND THE WINNER IS... PLAYER 1.\nYou will be walking home with $" + prize + " dollars and knowing that you are smarter than a 5th grader.");
			}
			else if (prize<prize2) {
				System.out.println("AND THE WINNER IS... PLAYER 2.\nYou will be walking home with $" + prize2 + " dollars and knowing that you are smarter than a 5th grader.");
			}
			else {
				System.out.println("You both are smarter then a 5th grader.\nBut you both walk way with 0 dollars :(");
			}
		}
	}
}
	


