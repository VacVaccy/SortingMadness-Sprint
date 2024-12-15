package pl.put.poznan.sorter.logic;

import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class DataCheckService {
    private Object[] data;

    public boolean isNumericArray(Object[] data) {
        for (Object obj : data) {
            if (!(obj instanceof String) || !((String) obj).matches("-?\\d+")) {
                return false; // Nie jest liczbą
            }
        }
        return true;
    }

    public boolean isStringArray(Object[] data) {
        for (Object obj : data) {
            // Sprawdzenie, czy element jest ciągiem znaków
            if (!(obj instanceof String)) {
                return false;
            }

            // Sprawdzenie, czy ciąg nie zawiera cyfr
            String str = (String) obj;
            if (str.matches(".*\\d.*")) {  // Jeśli ciąg zawiera cyfrę
                return false;
            }
        }
        return true;
    }

    public Object[] getDataAsObjects() {
        return data;
    }

}
