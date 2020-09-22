package com.turnyur.restcrud.service;

import com.turnyur.restcrud.model.Quote;
import com.turnyur.restcrud.model.SpringQuote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class QuoteServiceImpl implements QuoteService {
    @Autowired
    RestTemplateBuilder restTemplateBuilder;

    @Override
    public Quote getRandomQuote() {
        RestTemplate restTemplate =	restTemplateBuilder.build();
        SpringQuote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random",
                SpringQuote.class);

        return quote;
    }

    @Override
    public List<Quote> getAllQuotes() {
        return null;
    }
}
