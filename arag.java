import java.io.*;
import java.util.Random; 
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
class arag {
	public static void main(String args[]) { 
		boolean bigmeme = true;
		int high = 1000;
		int low = 1;
		while(bigmeme) {
			Scanner reader = new Scanner(System.in);
			boolean memebeam = true;
			Random rand = new Random();
			int guesses = 1;
			int answer = ThreadLocalRandom.current().nextInt(low, high + 1);
			String bb = String.valueOf(Math.abs(answer));
			char[] aDigit = bb.toCharArray();
			int aLength = (int)(Math.log10(Math.abs(answer))+1); //aLength is length of aDigit
/*			for(int i = aLength-1; i >= 0; i--) {
				System.out.println(aDigit[i]);
			} testing only */
			int b = high + 1;
			int terminate = 0;
			if (low-1 > 0) {
				terminate = 0;
			}else {
				terminate = low-1;
			}
			int help = 0;
			if (terminate == 0) {
				help = -1;
			}else {
				help = terminate-1;
			}
			int sign = 0;
			if (terminate == 0) {
				sign = -2;
			}else {
				sign = terminate-2;
			}
			int signs = 0;
			String yes = "yes";
			System.out.println("\n  ~ Guessing game, integers " + low + " to " + high + " ~");
			System.out.println("           ~ Enter " + terminate + " to quit ~        ");
			System.out.println("          ~ Enter " + help + " for help ~        ");
			System.out.println(" ~ Enter " + sign + " to check for matching signs ~        ");
			boolean blargh = true; //and nobody did really expect what 
			while(true) {
				while(memebeam) {
					if (blargh == true){
						System.out.println("\nGuess #" + guesses);
						blargh = false; //laughing in understanding
					}
					System.out.print("> ");
					try{
						b = Integer.parseInt(reader.nextLine());
						memebeam = false;
					}catch(Exception e) {
						System.out.println("Int input only");
						memebeam = true;
					}
					if (b < low && b != terminate && b != help && b != sign && memebeam == false || b > high && memebeam == false) {
						System.out.println("Must be between " + low + " and " + high + " (" + terminate + " if terminating program)");
						memebeam = true;
					}
				}
				if (b==terminate){
					System.out.print("Quitting. Are you sure? \n(Anything other than 'Yes' resumes) \n> ");
					String q = reader.nextLine();
					q = q.toLowerCase();
					if (q.equals(yes)) {
						System.exit(0);
					}
					memebeam = true;
					blargh = true;
				}
				if (b==help) {
					System.out.println("\n ~ Tutorial ~\n");
					System.out.println("Input any integer within the given range to guess. Win by guessing \nthe right number as the one randomly selected within the given\nrange. The game will track the number of guesses, whether the \nsigns of the guess and answer match*, as well as number of matching \ndigits in your guess. Matching digits are case-by-case starting \nfrom the ones place and ignoring negatives. Example below.");
					System.out.println("Answer: 9450");
					System.out.println("        | ||");
					System.out.println("Guess: -9050");
					System.out.println("The output would be 'digit-by-digit similarities: 3' and 'Signs: Not matching'*. \n*If signs are toggled on. They are off by default. \n After winning, it will display 'Correct' and will ask you \nwhether you want to play again. You can change the range \nthe answer lies in now, although you can choose not to.");
					System.out.println("\n  ~ Resume ~\n");
					memebeam = true;
				}
				if (b==sign) {
					System.out.print("\nSigns toggled ");
					if (signs==0) {
						signs++;
						System.out.print("on\n\n");
					}else{
						signs--;
						System.out.print("off\n\n");
					}
					memebeam = true;
				}
				if (memebeam == false) {
					String a = String.valueOf(Math.abs(b));
					char[] bDigit = a.toCharArray();
					int bLength = (int)(Math.log10(Math.abs(b))+1);
/*					for(int i = bLength-1; i >= 0; i--) {
						System.out.println(bDigit[i]);
					} testing only */
					int similar = 0;
					if(bLength > aLength) {
						for(int i = 0; i < aLength; i++) {
							if (aDigit[i]==bDigit[i]) {
								similar++;
							}
						}
					}else{
						for(int i = 0; i < bLength; i++) {
							if (aDigit[i]==bDigit[i]) {
								similar++;
							}
						}
					}
					if (b==answer && memebeam == false){ 
						break; //seth is a real god
					}
					if (b > answer && memebeam == false){
						System.out.println("Too high");
						memebeam = true;
						blargh = true;
						guesses++;
					}else{
						System.out.println("Too low");
						memebeam = true;
						blargh = true;
						guesses++; //lul why are you even reading this
					}
					System.out.println("Digit-by-digit similarities: " + similar);
					if (signs==1){
						if(b < 0 && answer < 0 || b >= 0 && answer >= 0) {
							System.out.println("Signs: Matching");
						}else{
							System.out.println("Signs: Not matching");
						}
					}
				}
			}
			System.out.println("\n~ Correct ~");
			System.out.println("Guesses: " + guesses);
			System.out.print("Keep going? \n(Anything other than 'Yes' stops this program) \n> ");
			String q = reader.nextLine();
			q = q.toLowerCase();
			if (!q.equals(yes)) {
				System.exit(0);
			}
			System.out.print("\nSet random integer range for next game? \n(Anything other than 'Yes' keeps the current range of possible random answers) \n> ");
			q = reader.nextLine();
			q = q.toLowerCase();
			if (q.equals(yes)) {
				memebeam = true;
				blargh = true;
				while(memebeam) {
					if (blargh == true){
						System.out.println("\nLow range");
						blargh = false;
					}
					System.out.print("> ");
					try{
						low = Integer.parseInt(reader.nextLine());
						memebeam = false;
					}catch(Exception e) {
						System.out.println("Int input only");
						memebeam = true;
					}
				}
				memebeam = true;
				blargh = true;
				while(memebeam) {
					if (blargh == true){
						System.out.println("\nHigh range");
						blargh = false;
					}
					System.out.print("> ");
					try{
						high = Integer.parseInt(reader.nextLine());
						memebeam = false;
					}catch(Exception e) {
						System.out.println("Int input only");
						memebeam = true;
					}
					if (high < low) {
						System.out.println("High range must be lower than low range");
						memebeam = true;
					}
				}
			}
		}
	}
} 
//There are better things to do in life than to stare at this computer screen and read code from this program. Frankly, I don't see the point of doing this on your part. I do not see any benefit or positive incentive that you, the reader, get from looking at this code. Like come on, is there anything better you could be doing? I honestly don't even know who is still reading this because this is probably going to end up becoming a long winded rant about about climate change. 
/*
SOMEBODY ONCE TOLD ME 
THE WORLD WAS GONNA ROLL ME
I AIN'T THE SHARPEST TOOL IN THE SHEEEEED
SHE WAS LOOKIN KINDA DUMB WITH A FINGER AND A THUMB
IN THE SHAPE
OF AN L
ON HER FORE HEAD

class meme {
	public static void main(String args[]) {
		while(true) {
			System.print("we are number one ");
		}
	}
}

heyyyy that's pretty good
*/