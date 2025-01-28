package pl.put.poznan.sorter.logic;

import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * Service class for data validation and processing.
 * <p>
 * The {@code DataCheckService} provides methods to verify the type of data
 * and access it as an array of objects. This service is designed to handle
 * validation checks and offer utility methods for data processing.
 * </p>
 */
@Service
@Data
public class DataCheckService {
    private Object[] data;

    /**
     * Checks if the provided array of objects contains only numeric strings.
     * <p>
     * This method iterates through the array and validates each object to ensure
     * it is a string that matches a numeric pattern (positive or negative integers).
     * </p>
     *
     * @param data The array of objects to validate.
     * @return {@code true} if all objects in the array are numeric strings, {@code false} otherwise.
     */
    public boolean isNumericArray(Object[] data) {
        for (Object obj : data) {
            if (!(obj instanceof String) || !((String) obj).matches("-?\\d+")) {
                return false; // Nie jest liczbą
            }
        }
        return true;
    }

    /**
     * Retrieves the data stored in the service as an array of objects.
     * <p>
     * This method returns the current state of the {@code data} field, allowing access to the stored data.
     * </p>
     *
     * @return The array of objects currently stored in the service.
     */
    public Object[] getDataAsObjects() {
        return data;
    }

}
