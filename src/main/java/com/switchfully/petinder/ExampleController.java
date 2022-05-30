package com.switchfully.petinder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ExampleController {
    Logger logger = LoggerFactory.getLogger(ExampleController.class);

    @RequestMapping("/")
    public String helloExample() {
        logger.trace("I'll update you on every heartbeat 💓");
        logger.debug("I'm taking a (sub)step 🚶");
        logger.info("Business as usual, I processed an action correctly");
        logger.warn("Warning ⚠ I do not trust this situation?!");
        logger.error("Help 🆘 Something is broken!");
        return "<h1>`System.out.println();` is forbidden!</h1><p>Logging for the win!</p>";
    }
}