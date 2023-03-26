package task.warehouseapplication.util;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface CrudOperation<ClassName,PrimaryKey> {
    @RequestMapping(method = RequestMethod.POST)
    ClassName create(ClassName object);
    @RequestMapping(method = RequestMethod.GET)
    ClassName read(PrimaryKey key);
    @RequestMapping(method = RequestMethod.PUT)
    ClassName update(ClassName object);
    @RequestMapping(method = RequestMethod.DELETE)
    void delete(PrimaryKey key);
}
