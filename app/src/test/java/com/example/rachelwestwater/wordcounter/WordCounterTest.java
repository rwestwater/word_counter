package com.example.rachelwestwater.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordCounterTest {

    WordCounter wordCounter;

    @Before
    public void before() {
        wordCounter = new WordCounter();
    }

    @Test
    public void canGetWord() {
        wordCounter.setWord("Hello");
        assertEquals("Hello", wordCounter.getWord());
    }

    @Test
    public void getWordCount() {
        wordCounter.setWord("you are awesome");
        assertEquals(3, wordCounter.getWordCount("you are awesome"));
    }

}

