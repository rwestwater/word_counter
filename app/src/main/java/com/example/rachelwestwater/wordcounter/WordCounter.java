package com.example.rachelwestwater.wordcounter;


    public class WordCounter {

        String word;

        public void setWord(String word){
            this.word = word;
        }

        public String getWord(){
            return this.word;
        }

        public int getWordCount(String word){
            return word.split("\\s").length;
        }


    }



