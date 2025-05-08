package de.exxcellent.challenge.dataloader;

import de.exxcellent.challenge.parser.CSVParser;

import java.util.List;

/**
 *  Class for loading data of a CSV file into a list of a specific type
 */
public class CSVDataLoader<T> implements DataLoader<T>{

    CSVParser<T> parser;

    @Override
    public List<T> load(String filePath) {
        return List.of();
    }

}
