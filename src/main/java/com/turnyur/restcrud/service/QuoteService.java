package com.turnyur.restcrud.service;

import com.turnyur.restcrud.model.Quote;
import com.turnyur.restcrud.model.SpringQuote;

import java.util.List;

public interface QuoteService {
    public Quote getRandomQuote();
    public List<Quote> getAllQuotes();
}
