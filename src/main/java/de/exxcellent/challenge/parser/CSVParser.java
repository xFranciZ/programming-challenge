package de.exxcellent.challenge.parser;

public interface CSVParser<T> {

    public T parse(String[] dataSet);
}
