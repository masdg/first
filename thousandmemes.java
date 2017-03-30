import java.io.*;
import java.util.Scanner;
class frag {
	public static void main(String args[]) { 
		boolean memebeam = true;
		System.out.println("   ~ Primes ~");
		System.out.print("Entering 0 will exit.");
		Scanner meme = new Scanner(System.in);
		String yes = "yes";
		int b = 0;
		while(true) {
			while(memebeam) {
				try{
					System.out.print("\n> ");
					b = Math.abs(Integer.parseInt(meme.nextLine()));
					memebeam = false;
				}catch(Exception x) {
					System.out.println("\nInvalid input (Must be integer! Negatives will \nautomatically be converted to positive)");
					memebeam = true;
				}
			}
			if (b == 0) {
				System.out.print("\nQuit? (Enter yes to quit, else will resume) \n> ");
				String q = meme.nextLine();
				q = q.toLowerCase();
				if (q.equals(yes)) {
					System.exit(0);
				}
				memebeam = true;
			}
			if (b == 1)else {
				int d = 0;
				System.out.println("Prime #" + b +": ");
				for(int i = 1; i <= b; i++) {
					d++;
					for(int c = 2; c + d)
				}
				}
				System.out.print("\n");
				System.out.print("Again? (Yes to keep going, else will quit) \n>");
				String q = meme.nextLine();
				q = q.toLowerCase();
				if (!q.equals(yes)) {
					System.exit(0);
				}
				memebeam = true;
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