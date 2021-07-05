package service;

import db.Storage;
import model.Fruit;

import java.util.Map;

public class FruitServiceImpl implements FruitService {
    @Override
    public String getReport() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("fruit,quantity").append(System.lineSeparator());
        for (Map.Entry<Fruit, Integer> storage : Storage.storage.entrySet()) {
            stringBuilder.append(storage.getKey().getName())
                    .append(",")
                    .append(storage.getValue())
                    .append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }
}