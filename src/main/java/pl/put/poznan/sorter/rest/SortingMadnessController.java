package pl.put.poznan.sorter.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import pl.put.poznan.sorter.logic.SortingMadness;

import java.util.Arrays;

@RestController
@RequestMapping("/sort")
public class SortingMadnessController {

    private static final Logger logger = LoggerFactory.getLogger(SortingMadnessController.class);

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public int[] get(
            @RequestParam("data") int[] data,
            @RequestParam(value = "sorts", defaultValue = "1") String[] sorts) {

        // Log parameters
        logger.debug("Data to sort: {}", Arrays.toString(data));
        logger.debug("Sorting algorithms: {}", Arrays.toString(sorts));

        // Sort the data
        SortingMadness sorter = new SortingMadness(sorts);
        return sorter.sort(data);
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public int[] post(
            @RequestBody SortingRequest request) {

        logger.debug("Data to sort: {}", Arrays.toString(request.getData()));
        logger.debug("Sorting algorithms: {}", Arrays.toString(request.getSorts()));

        // Sort the data
        SortingMadness sorter = new SortingMadness(request.getSorts());
        return sorter.sort(request.getData());
    }
}
