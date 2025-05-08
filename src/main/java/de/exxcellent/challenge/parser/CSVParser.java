package de.exxcellent.challenge.parser;

/**
 *  Interface for parsing a dataset from a CSV file into a specific data type.
 */
public interface CSVParser<T> {

    public T parse(String[] dataSet);
}
