package topic4.topic4.service;
import java.util.List;
import topic4.topic4.model.Data;

public interface DataService {
    List<Data> getAllData();
    Data[][] getMatrix();
    int getMaxPositionX();
    int getMaxPositionY();
}
