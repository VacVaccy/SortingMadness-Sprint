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

    public Object[] getDataAsObjects() {
        return data;
    }

}
