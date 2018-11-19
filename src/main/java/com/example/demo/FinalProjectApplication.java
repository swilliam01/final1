package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class FinalProjectApplication {
    private static final Logger log = LoggerFactory.getLogger(FinalProjectApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(FinalProjectApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {


            User user = restTemplate.getForObject("https://api.github.com/users/MelakMinlargilih", User.class);
            log.info(user.toString());


            ResponseEntity<List<User>> memberResponse =
                    restTemplate.exchange("https://api.github.com/orgs/github/members",
                            HttpMethod.GET, null, new ParameterizedTypeReference<List<User>>() {
                            });
            List<User> users = memberResponse.getBody();
            log.info(users.toString());

//            Repos_url repos_url = restTemplate.getForObject("https://api.github.com/users/MelakMinlargilih/repos", Repos_url.class);
//            log.info(repos_url.toString());
        };




            // MelakMinlargilih
//            Object[] MelakArray = Arrays.stream(users).filter(x -> x.getLogin().equalsIgnoreCase("Melak")).toArray();
//            log.info("Name :" + ((User) MelakArray[0]).getLogin());
//
//            log.info(" repositories :" + .valueOf(((Coin) vergeArray[0]).getPrice_usd()));
//
//            log.info("-------------------------------------------------");

    }
}