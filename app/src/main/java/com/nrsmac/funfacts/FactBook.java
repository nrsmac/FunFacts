package com.nrsmac.funfacts;

import java.util.Random;

/**
 * Created by nrsmac on 2/10/15.
 */
public class FactBook {
    //Member variables
    public String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
            "Donald Duck comics were banned from Finland because he doesn’t wear pants!",
            "There are more than 10 million bricks in the Empire State Building.",
            "Dolphins sleep with one eye open.",
            "In the White House, there are 13,092 knives, forks and spoons",
            "Recycling one glass jar, saves enough energy to watch T.V for 3 hours.",
            "Owls are one of the only birds who can see the colour blue.",
            "A jellyfish is 95 percent water.",
            "In Bangladesh, kids as young as 15 can be jailed for cheating on their finals.",
            "Humans are the only primates that don’t have pigment in the palms of their hands.",
            "Months that begin on a Sunday will always have a ‘Friday the 13th’.",
            "The fingerprints of koala bears are virtually indistinguishable from those of humans, so much so that they can be easily confused at a crime scene.",
            "Only one person in two billion will live to be 116 or older.",
            "It’s possible to lead a cow upstairs but not downstairs.",
            "Americans travel 1,144,721,000 miles by air every day.",
            "The the U.S. you dial ’911′. In Stockholm, Sweden you dial 90000.",
            "The U.S. military operates 234 golf courses.",
            "100% of lottery winners do gain weight.",
            "A cat has 32 muscles in each ear.",
            "A duck’s quack doesn’t echo, and no one knows why.",
            "Cats urine glows under a black light.",
            "The average lifespan of an eyelash is five months.",
            "A spider has transparent blood.",
            "Every acre of American crops harvested contains 100 pounds of insects.",
            "Prince Charles is an avid collecter of toilet seats.",
            "The most common street name in the U.S. is Second Street.",
            "Babies are most likely to be born on Tuesdays.",
            "The HyperMart outside of Garland Texas has 58 check-outs.",
            "In the 1980′s American migraines increased by 60%.",
            "The Minneapolis phone book has 21 pages of Andersons.",
            "Poland is the 'stolen car capital of the world'.",
            "Jefferson invented the dumbwaiter, the monetary system, and the folding attic ladder.",
            "The S in Harry S. Truman did not stand for anything.",
            "A horse can look forward with one eye and back with the other.",
            "Shakespeare is quoted 33,150 times in the Oxford English dictionary.",
            "The word Pennsylvania is misspelled on the Liberty Bell.",
            "You spend 7 years of your life in the bathroom.",
            "A family of 26 could go to the movies in Mexico city for the price of one in Tokyo.",
            "10,000 Dutch cows pass through the Amsterdam airport each year.",
            "Approximately every seven minutes of every day, someone in an aerobics class pulls their hamstring.",
            "Simplistic passwords contribute to over 80% of all computer password break-ins.",
            "The top 3 health-related searches on the Internet are (in this order): Depression, Allergies, & Cancer.",
            "Dentists have recommended that a toothbrush be kept at least 6 feet away from a toilet to avoid airborne particles resulting from the flush.",
            "Venus is the only planet that rotates clockwise.",
            "Most dust particles in your house are made from dead skin.",
            "Oak trees do not produce acorns until they are fifty years of age or older.",
            "The first owner of the Marlboro company died of lung cancer.",
            "All US Presidents have worn glasses; some just didn’t like being seen wearing them in public.",
            "Mosquito repellents don’t repel. They hide you. The spray blocks the mosquito’s sensors so they don’t know you’re there.",
            "Walt Disney was afraid of mice.",
            "The king of hearts is the only king without a moustache.",
            "Pearls melt in vinegar",
            "It takes 3,000 cows to supply the NFL with enough leather for a year’s supply of footballs.",
            "The site with the highest number of women visitors between the age of 35 and 44 years old: Alka-Seltzer.com",
            "Thirty-five percent of people who use personal ads for dating are already married.",
            "The 3 most valuable brand names on earth are Marlboro, Coca-Cola, and Budweiser (in that order).",
            "Cost of raising a medium-sized dog to the age of 11: £4000",
            "The name Jeep came from the abbreviation used in the army for the “General Purpose” vehicle, G.P.",
            "The cruise liner Queen Elizabeth II, moves only six inches for each gallon of fuel that it burns.",
            "The dot over the letter ‘i’ is called a tittle."


    };
    //Methods
    public String getFact() {

        String fact = "";
        Random randomGenerator = new Random(); //Construct new random generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;

    }
}
