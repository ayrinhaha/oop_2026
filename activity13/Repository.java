import java.util.ArrayList;
import java.util.List;

/**
 * A generic repository class used to store and manage a collection of items.
 *
 * @param <T> the type of objects stored in the repository
 */
public class Repository<T> {

    private List<T> items;

    /**
     * Constructs an empty repository.
     */
    public Repository() {
        items = new ArrayList<>();
    }

    /**
     * Adds an item to the repository.
     *
     * @param item the item to be added
     */
    public void add(T item) {
        items.add(item);
    }

    /**
     * Retrieves an item at a specific index.
     *
     * @param index position of the item
     * @return the item at the given index
     */
    public T get(int index) {
        return items.get(index);
    }

    /**
     * Returns all items in the repository.
     *
     * @return list of all items
     */
    public List<T> getAll() {
        return items;
    }

    /**
     * Returns the number of items in the repository.
     *
     * @return size of the repository
     */
    public int size() {
        return items.size();
    }
}