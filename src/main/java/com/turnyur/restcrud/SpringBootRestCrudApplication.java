package com.turnyur.restcrud;

import com.turnyur.restcrud.model.Quote;
import com.turnyur.restcrud.model.SpringQuote;
import com.turnyur.restcrud.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.*;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootRestCrudApplication implements CommandLineRunner {

	@Autowired
	QuoteService quoteService;
	private static Logger LOG = LoggerFactory
			.getLogger(SpringBootRestCrudApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestCrudApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Quote quote = quoteService.getRandomQuote();
		         	LOG.info("\nRestService\n");
		         	LOG.info(quote.toString());

	}       		
					
		    		
/*	@Bean
	public CommandLineRunner run(RestTemplateBuilder restTemplateBuilder) throws Exception {

		RestTemplate restTemplate = restTemplateBuilder.build();
//		return args -> {
//			Quote quote = restTemplate.getForObject(
//					"https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
//			LOG.info(quote.toString());
//		};

		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				Quote quote = restTemplate.getForObject(
						"https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
				LOG.info(quote.toString());
			}
		};
	}    */

}
