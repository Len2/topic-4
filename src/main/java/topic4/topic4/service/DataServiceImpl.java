package topic4.topic4.service;

import java.text.DecimalFormat;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import topic4.topic4.model.Data;
import topic4.topic4.repo.DataServiceRepo;

@Service
public class DataServiceImpl implements DataService {
    @Autowired
    private DataServiceRepo dataRepo;
    
    public List<Data> getAllData() {
        // fetch all rows with data structure List from Sql table "data"
        return dataRepo.findAll();
    }

    public Data[][] getMatrix() {
        List<Data> temp = this.getAllData();
        int x = dataRepo.maxPositionX() + 1;
        int y = dataRepo.maxPositionY() + 1;
        // create 2D matrix for positionX and positionY 
        Data[][] matrix = new Data[y][x];

        for (Data item : temp) {
            // if not Empty "format" change "value" through format places
            if (!item.getFormat().isEmpty()) {
                DecimalFormat decimalFormat = new DecimalFormat(item.getFormat());
                double number = Double.parseDouble(item.getValue());
                item.setValue(decimalFormat.format(number));
            }
            // Else only read item of Data list 
            matrix[item.getPositionY()][item.getPositionX()] = item;
        }

        return matrix;
    }

    public int getMaxPositionX() {
        return dataRepo.maxPositionX();
    }

    public int getMaxPositionY() {
        return dataRepo.maxPositionY();
    }

}
