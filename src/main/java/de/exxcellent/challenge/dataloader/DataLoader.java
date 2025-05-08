package de.exxcellent.challenge.dataloader;

import java.util.List;

public interface DataLoader<T> {

    public List<T> load(String filePath);
}
