package de.exxcellent.challenge.dataloader;

import java.util.List;

/**
 *  Interface for loading data into a list of a specific type
 */
public interface DataLoader<T> {

    public List<T> load(String filePath);
}
