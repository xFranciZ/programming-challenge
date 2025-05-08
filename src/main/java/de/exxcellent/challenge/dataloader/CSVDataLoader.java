package de.exxcellent.challenge.dataloader;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import com.sun.tools.javac.Main;
import de.exxcellent.challenge.parser.CSVParser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *  Class for loading data of a CSV file into a list of a specific type
 */
public class CSVDataLoader<T> implements DataLoader<T>{

    CSVParser<T> parser;

    public CSVDataLoader(CSVParser<T> parser) {
        this.parser = parser;
    }

    @Override
    public List<T> load(String filePath) {

        List<T> data = new ArrayList<>();

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(filePath);

        if (inputStream == null) {
            System.err.println("File " + filePath + "not found!");
            return null;
        }

        try {
            CSVReader reader = new CSVReader(new InputStreamReader(inputStream));
            reader.readNext();

            String[] dataSet;
            while ((dataSet = reader.readNext()) != null) {
                T dataElement = parser.parse(dataSet);
                data.add(dataElement);
            }

        } catch (IOException | CsvValidationException e) {
            System.out.println(e.getMessage());
        }

        return data;
    }

}
