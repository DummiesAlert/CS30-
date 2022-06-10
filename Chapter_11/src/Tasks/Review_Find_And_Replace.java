package Tasks;

/*

Program: Review_Find_And_Replace.java          Last Date of this Revision: June 9, 2022

Purpose: Create a FindAndReplace application that prompts the user for a file name, a search word or phrase,
and a replacement word or phrase. After entering the replacement word or phrase, FindAndReplace finds all 
occurrences of the search word or phrase in a file and replaces them with the specified replacement word or phrase.

Author: Zhuo Xi Hong, 
School: CHHS
Course: Computer Programming 30
 
*/

import java.io.*;
import java.util.Scanner;

public class Review_Find_And_Replace {

	/*
	 
	 use FAR.txt
	 
	 */
	
	public static void main(String[] args) 
	{
		String fileName, searchText, replaceText; //Create String
		try (Scanner input = new Scanner(System.in)) {
			BufferedReader readFile; //Reads and Gets into File
			FileReader in;
			String replaced; //Create String
			
			System.out.print("Enter the Name of the File:");
			fileName = input.nextLine();
			
			File textFile = new File(fileName); //Finds File
			
			try
			{
				System.out.println("What Letter/Word/Phrase would you like to replace?"); //Prompts User for Letter/Word/Phrase they want to replace
				searchText = input.nextLine();
				System.out.println("What Letter/Word/Phrase would you like to replace it with?"); //Prompts User for Letter/Word/Phrase they want to replace with
				replaceText = input.nextLine();
			
				in = new FileReader(textFile); //Reads the File 
				readFile = new BufferedReader(in);
				
				replaced = readFile.readLine(); //Replace Data in File
				System.out.println(replaced);


				System.out.println("Replacing " + searchText + " with " + replaceText); //Display to User the Changes Made, from input above
				System.out.println(replaced.replaceAll(searchText, replaceText));
				
				readFile.close();
				in.close();
			
			}catch(FileNotFoundException e)
			{
				System.out.println("File does not exist!"); //Catch if File Doesn't Exist
				System.err.println("FileNotFoundException: "+ e.getMessage());
			}
			catch(IOException e)
			{
				System.out.println("Problem reading file."); //See if the File has a Problem
				System.err.println("IOException: "+ e.getMessage());
			}
		}
	}
}	

/*

Run #1: (to test code and .txt)

Enter the Name of the File:FAR.txt
What Letter/Word/Phrase would you like to replace?
a
What Letter/Word/Phrase would you like to replace it with?
v
I can hear your heart beating.
Replacing a with v
I cvn hevr your hevrt bevting.

Run #2: (to fix and test .txt)

Enter the Name of the File:FAR.txt
What Letter/Word/Phrase would you like to replace?
h
What Letter/Word/Phrase would you like to replace it with?
t
I can hear your heart beating.
Replacing h with t
I can tear your teart beating.

Run #3:

Enter the Name of the File:FAR.txt
What Letter/Word/Phrase would you like to replace?
do
What Letter/Word/Phrase would you like to replace it with?
to
The “live” performance of Hamlet led me to wonder what it was really like in Shakespeare's time and I got to see the actors acting right at the Globe Theater. The part that surprised me the most was the gender changes in roles, this showed some entirely different motives, postures and the thought I had from reading the play instead of in a non-stop performance. Like in the scene where Ophelia, singing her chorus being “crazy” came out different, I can feel more sorrow from losing Polonius and the regret of losing the love of Hamlet. I also expected that the audience in the pit isn’t seated like a modern performance, and is willing to stand for an entire 2 hours for the play, unlike the modern ones. Also, the color choices of the outfits and stage set a better theme of the Shakespearean times. For example, the back doors and walls, remain the dark olden colors, as they didn’t have as many colors we have today. Additionally, I was surprised when the cast decided to utilize most of the stage in every scene to highlight the movement they would be in while acting. I expected the play to be more sticks and stones, but I can see some jokes added by the producer and the actions the actors did to make the jokes funnier, like when Polonius and Claudius read Hamlet's letter to Ophelia, and the jokes and laughs they made while reading it. Moreover, the building itself surpassed my expectations because I thought it was really huge as it fits a lot of people. But after looking at the performance, the stage is quite large, but the audience space is much smaller and made me think of how squishy it was back in the days. During Shakespearian days, production never had women in performances and that young men/children would play women roles like the Queen because they had a higher pitch that was more suitable for a women role. It was ironic that the producer decided to reverse genders for roles and let women into the play. This changed entirely to how I expected the dialogue in the book compared to the live performance and how I can picture the costumes that fit with the play. Especially, when a man is playing Ophelia’s role and the costumes for her, Gertrude and Claudius were expected, with the older aesthetic. However, the modernization of the Hamlet and Horiatios costumes gave me a feeling of how they were future thinkers and they would lead the country as the future generation. The coat that Hamlet had during the grave scene made me astonished, cause it showed how his curious and wondering thoughts about the grave being dug and, when he asked, who was it for? My favorite costume comes back to Ophelias because I never expected to see a man wearing a dress on the stage in a Shakespearean play and that style of the dress, white showed how Ophelia is innocent and how she didn’t have a “right” to make choices towards a love to Hamlet. Whereas my least favorite costume was the one for Claudius because the costume was too plain and it didn’t show the greed and his intentions as I had expected. I expected a costume with more riches, treasures, and a brighter outfit in the colors red and white. As the red showed his bloodied hands and the white showed the innocence he showed to the other characters and the audience. I felt that Horatio was the most convincing and impressive actor because Horatio was always there for Hamlet and that he was always there for Hamlet. He acted like a true friend, someone you could trust your secrets with, like Hamlet's secret of putting an antic disposition Hamlet had to put on. On the other hand, the not convincing character was Gertrude because he didn’t reveal that much emotion when telling Laertes that Ophelia drowned and that when Hamlet killed Polonius right in front of her. Which made me feel like Gertrude was cold-blooded, and maybe intended by the producer, I would never know . . . My favorite scene of the play was when Gertrude and Claudius saw the players reenact the poisoning of the King and that the Queen wouldn’t remarry part because the face Clausius made to emphasize like a secret has been revealed (which it did) and showed the (“How the hell did he know”) face. Also, the scene when Claudius asks Hamlet where Polonius was and how Hamlet used the jokes about him at supper or somewhere else. When Hamlet said that if you want to see him again, going to heaven was the best, but my least favorite scene was the soliloquy “To Be or Not to Be.” The part was one of the most important parts of the play and the actor didn’t make me feel the sorrows and the consequences of living and dying, something felt missing. My favorite character had to be Polonius because he was the one making jokes and that he was the one teaching his children life lessons like a good father would do or his humor and non-stopping talk-backs to jokes and puns. Additionally, the part when he says “I am slain” was really funny because he normally would say a whole passage to just say yes to something and died without going in a circle with words. Although Polonius didn’t give Ophelia the chance to continue loving Hamlet and the choices of other things. The play showed how Ophelia obeyed her father until Polonius died and that Ophelia finally made a choice to suicide and maybe think of joining her father. My least favorite character would be a person who does anything to achieve his goal, the crown and queen, but, I support the idea that you do anything to achieve your goal, but without hurting others, without leaving the past and family behind for that, I am unsupportive of that. Also, the King would say funny things to humor others and himself to cheer up, especially after his own soliloquy admitting his murder of Old King Hamlet. Which are something I embed in my own life and something I do everything to cheer myself up. In addition, during the Shakespearian days, people couldn't admit to their wrongs because that would lead to their heads migrating somewhere else. I enjoyed the parts when the production added jokes and gave emotions to the scenes and when the music gave a spotlight tallying to the theme of the scene. Like a sad song for deaths and happy songs for the arrival of the King. Also, the accent of the actor for Polonius suited his role, that's what I think. . .  What I didn’t enjoy about the play was that it was quite long and made me a little sleepy. Additionally, the play made me want to press the next button many times. Moreover, I didn’t like the part when they used a flower watering pot to “poison the king” when the players were acting out. Overall, I rate this live performance 4/10 because of the lack of attractiveness it didn't have as the book/novel did. 
Replacing do with to
The “live” performance of Hamlet led me to wonder what it was really like in Shakespeare's time and I got to see the actors acting right at the Globe Theater. The part that surprised me the most was the gender changes in roles, this showed some entirely different motives, postures and the thought I had from reading the play instead of in a non-stop performance. Like in the scene where Ophelia, singing her chorus being “crazy” came out different, I can feel more sorrow from losing Polonius and the regret of losing the love of Hamlet. I also expected that the audience in the pit isn’t seated like a modern performance, and is willing to stand for an entire 2 hours for the play, unlike the modern ones. Also, the color choices of the outfits and stage set a better theme of the Shakespearean times. For example, the back toors and walls, remain the dark olden colors, as they didn’t have as many colors we have today. Additionally, I was surprised when the cast decided to utilize most of the stage in every scene to highlight the movement they would be in while acting. I expected the play to be more sticks and stones, but I can see some jokes added by the producer and the actions the actors did to make the jokes funnier, like when Polonius and Claudius read Hamlet's letter to Ophelia, and the jokes and laughs they made while reading it. Moreover, the building itself surpassed my expectations because I thought it was really huge as it fits a lot of people. But after looking at the performance, the stage is quite large, but the audience space is much smaller and made me think of how squishy it was back in the days. During Shakespearian days, production never had women in performances and that young men/children would play women roles like the Queen because they had a higher pitch that was more suitable for a women role. It was ironic that the producer decided to reverse genders for roles and let women into the play. This changed entirely to how I expected the dialogue in the book compared to the live performance and how I can picture the costumes that fit with the play. Especially, when a man is playing Ophelia’s role and the costumes for her, Gertrude and Claudius were expected, with the older aesthetic. However, the modernization of the Hamlet and Horiatios costumes gave me a feeling of how they were future thinkers and they would lead the country as the future generation. The coat that Hamlet had during the grave scene made me astonished, cause it showed how his curious and wondering thoughts about the grave being dug and, when he asked, who was it for? My favorite costume comes back to Ophelias because I never expected to see a man wearing a dress on the stage in a Shakespearean play and that style of the dress, white showed how Ophelia is innocent and how she didn’t have a “right” to make choices towards a love to Hamlet. Whereas my least favorite costume was the one for Claudius because the costume was too plain and it didn’t show the greed and his intentions as I had expected. I expected a costume with more riches, treasures, and a brighter outfit in the colors red and white. As the red showed his bloodied hands and the white showed the innocence he showed to the other characters and the audience. I felt that Horatio was the most convincing and impressive actor because Horatio was always there for Hamlet and that he was always there for Hamlet. He acted like a true friend, someone you could trust your secrets with, like Hamlet's secret of putting an antic disposition Hamlet had to put on. On the other hand, the not convincing character was Gertrude because he didn’t reveal that much emotion when telling Laertes that Ophelia drowned and that when Hamlet killed Polonius right in front of her. Which made me feel like Gertrude was cold-blooded, and maybe intended by the producer, I would never know . . . My favorite scene of the play was when Gertrude and Claudius saw the players reenact the poisoning of the King and that the Queen wouldn’t remarry part because the face Clausius made to emphasize like a secret has been revealed (which it did) and showed the (“How the hell did he know”) face. Also, the scene when Claudius asks Hamlet where Polonius was and how Hamlet used the jokes about him at supper or somewhere else. When Hamlet said that if you want to see him again, going to heaven was the best, but my least favorite scene was the soliloquy “To Be or Not to Be.” The part was one of the most important parts of the play and the actor didn’t make me feel the sorrows and the consequences of living and dying, something felt missing. My favorite character had to be Polonius because he was the one making jokes and that he was the one teaching his children life lessons like a good father would to or his humor and non-stopping talk-backs to jokes and puns. Additionally, the part when he says “I am slain” was really funny because he normally would say a whole passage to just say yes to something and died without going in a circle with words. Although Polonius didn’t give Ophelia the chance to continue loving Hamlet and the choices of other things. The play showed how Ophelia obeyed her father until Polonius died and that Ophelia finally made a choice to suicide and maybe think of joining her father. My least favorite character would be a person who toes anything to achieve his goal, the crown and queen, but, I support the idea that you to anything to achieve your goal, but without hurting others, without leaving the past and family behind for that, I am unsupportive of that. Also, the King would say funny things to humor others and himself to cheer up, especially after his own soliloquy admitting his murder of Old King Hamlet. Which are something I embed in my own life and something I to everything to cheer myself up. In addition, during the Shakespearian days, people couldn't admit to their wrongs because that would lead to their heads migrating somewhere else. I enjoyed the parts when the production added jokes and gave emotions to the scenes and when the music gave a spotlight tallying to the theme of the scene. Like a sad song for deaths and happy songs for the arrival of the King. Also, the accent of the actor for Polonius suited his role, that's what I think. . .  What I didn’t enjoy about the play was that it was quite long and made me a little sleepy. Additionally, the play made me want to press the next button many times. Moreover, I didn’t like the part when they used a flower watering pot to “poison the king” when the players were acting out. Overall, I rate this live performance 4/10 because of the lack of attractiveness it didn't have as the book/novel did. 

*/
