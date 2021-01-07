package com.example.jokesapp.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService{

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    //Constructor Injected - requires chucknorris bean
    public JokeServiceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }
    //property injected
    //public JokeServiceImpl() {
        //this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    //}

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
