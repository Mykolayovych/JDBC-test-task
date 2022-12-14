package mate.jdbc.dao;

import java.util.List;
import mate.jdbc.model.Manufacturer;

public interface ManufacturerDao {
    //Return value of the method is never used
    Manufacturer create(Manufacturer manufacturer);

    Manufacturer get(Long id);

    //Method getAll() is never used
    List<Manufacturer> getAll() throws RuntimeException;

    ////Return value of the method is never used
    Manufacturer update(Manufacturer manufacturer);

    void delete(Long id);
}
