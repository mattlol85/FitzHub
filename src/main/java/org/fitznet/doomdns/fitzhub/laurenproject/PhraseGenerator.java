package org.fitznet.doomdns.fitzhub.laurenproject;

import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

@Setter
@Getter
public class PhraseGenerator {
    private String sentence;
    // Funny name to call lauren lol
    private String petName;
    private String completedPhrase;

    ArrayList<String> phrases = new ArrayList<>();
    ArrayList<String> petNames = new ArrayList<>();

    public PhraseGenerator() {
        // Connect to database and get phrase and petName
        this.sentence = "";
        this.petName = "";
        populatePhrasesAndNames();
        this.completedPhrase = setFinalSentence();
    }

    private String setFinalSentence() {
        String finalStr = this.sentence.replace("X", this.petName);
        return finalStr;
    }

    private void populatePhrasesAndNames() {

        File namesFile = new File("names.txt");
        File phrasesFile = new File("phrases.txt");

        try {
            Scanner nameScanner = new Scanner(namesFile);
            Scanner phraseScanner = new Scanner(phrasesFile);
            while (nameScanner.hasNextLine()) {
                petNames.add(nameScanner.nextLine());
            }
            while (phraseScanner.hasNextLine()) {
                phrases.add(phraseScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // Set a random sentence and name
        this.sentence = phrases.get((int) (Math.random() * phrases.size()));
        this.petName = petNames.get((int) (Math.random() * petNames.size()));
    }
}
