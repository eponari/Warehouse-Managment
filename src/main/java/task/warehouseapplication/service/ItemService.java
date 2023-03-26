package task.warehouseapplication.service;

import org.springframework.stereotype.Service;
import task.warehouseapplication.model.dto.ItemDTO;
import task.warehouseapplication.util.CrudOperation;

@Service
public class ItemService implements CrudOperation<ItemDTO,Long> {
    @Override
    public ItemDTO create(ItemDTO itemDTO) {
        return null;
    }

    @Override
    public ItemDTO read(Long id) {
        return null;
    }

    @Override
    public ItemDTO update(ItemDTO object) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
