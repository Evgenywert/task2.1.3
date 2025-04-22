package app.model;

import lombok.Data;
import lombok.Getter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Data
@Getter
@Component
public class AnimalsCage {
    private static final Logger log = LoggerFactory.getLogger(AnimalsCage.class);

    @Autowired
    @Qualifier("dog")
    private Animal animal;

    @Autowired
    private Timer timer;

    public void whatAnimalSay() {
        log.info("Say:");
        log.info(animal.toString());
        log.info("At:");
        log.info("{}", timer.getNanoTime());
        log.info("________________________");
    }
}
