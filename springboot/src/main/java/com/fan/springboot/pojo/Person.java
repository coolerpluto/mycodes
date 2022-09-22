package com.fan.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
@ConfigurationProperties("person")
public class Person {

    private String name;

    private Date birthday;

    private Pet pet;

    private String[] interests;

    private Map<String, Object> score;

    private Set<Double> salarys;

    private Map<String, List<Pet>> allPets;
}
