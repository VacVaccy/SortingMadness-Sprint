package pl.put.poznan.sorter.rest;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import pl.put.poznan.sorter.logic.DataCheckService;
import pl.put.poznan.sorter.logic.SortingMadness;
import pl.put.poznan.sorter.logic.SortingResponse;

import java.util.Arrays;
import java.util.List;
// import java.util.Objects;

@RestController
@AllArgsConstructor
@Data
@RequestMapping("/app/sortingmadness")
public class SortingMadnessController {

    private final DataCheckService dataCheckService;
    private static final Logger logger = LoggerFactory.getLogger(SortingMadnessController.class);

    @RequestMapping(path="/sort", method = RequestMethod.GET, produces = "application/json")
    public List<SortingResponse> get(
            @RequestParam("data") Object[] data,
            @RequestParam(value = "algorithms", defaultValue = "1") String[] algorithms) throws IllegalAccessException {

        // Log parameters
        logger.debug("Data to sort: {}", Arrays.toString(data));
        logger.debug("Sorting algorithms: {}", Arrays.toString(algorithms));

        // Sort the data
        SortingMadness sorter = new SortingMadness(algorithms);
        //!
        if (dataCheckService.isNumericArray(data)) {
            int[] parsedData = Arrays.stream(data)
                    .mapToInt(o -> Integer.parseInt((String) o))  // Convert string to int
                    .toArray();
            List<SortingResponse> responses = sorter.sortInts(parsedData);
            responses.forEach(response -> logger.debug(response.toString()));
            return responses;
        } else if (dataCheckService.isStringArray(data)) {
            String[] parsedData = Arrays.stream(data)
                    .map(Object::toString)
                    .toArray(String[]::new);
            List<SortingResponse> responses = sorter.sortStrings(parsedData);
            responses.forEach(response -> logger.debug(response.toString()));
            return responses;

        }else{
            throw new IllegalAccessException();
        }

        //!
        // return sorter.sort(data);
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public List<SortingResponse> post(
            @RequestBody SortingRequest request) {

        logger.debug("Data to sort: {}", Arrays.toString(request.getData()));
        logger.debug("Sorting algorithms: {}", Arrays.toString(request.getSorts()));

        // Sort the data
        SortingMadness sorter = new SortingMadness(request.getSorts());
        //!
        List<SortingResponse> responses = sorter.sortInts(request.getData());
        responses.forEach(response -> logger.debug(response.toString()));
        return responses;
        //!
        // return sorter.sort(request.getData());
    }
}
