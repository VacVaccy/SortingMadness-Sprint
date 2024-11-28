package pl.put.poznan.sorter.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import pl.put.poznan.sorter.logic.SortingMadness;

import java.util.Arrays;


@RestController
@RequestMapping("/{text}")
public class SortingMadnessController {

    private static final Logger logger = LoggerFactory.getLogger(SortingMadnessController.class);

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public String get(@PathVariable String text,
                              @RequestParam(value="sorts", defaultValue="upper,escape") String[] sorts) {

        // log the parameters
        logger.debug(text);
        logger.debug(Arrays.toString(sorts));

        // perform the transformation, you should run your logic here, below is just a silly example
        SortingMadness sorter = new SortingMadness(sorts);
        return sorter.transform(text);
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public String post(@PathVariable String text,
                      @RequestBody String[] sorts) {

        // log the parameters
        logger.debug(text);
        logger.debug(Arrays.toString(sorts));

        // perform the transformation, you should run your logic here, below is just a silly example
        SortingMadness sorter = new SortingMadness(sorts);
        return sorter.transform(text);
    }



}


