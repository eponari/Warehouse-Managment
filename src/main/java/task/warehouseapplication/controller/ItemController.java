package task.warehouseapplication.controller;

import org.springframework.web.bind.annotation.RestController;
import task.warehouseapplication.model.dto.ItemDTO;
import task.warehouseapplication.service.ItemService;
import task.warehouseapplication.util.CrudOperation;

@RestController("/item")
public class ItemController implements CrudOperation<ItemDTO, Long> {
    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @Override
    public ItemDTO create(ItemDTO object) {
        return itemService.create(object);
    }

    @Override
    public ItemDTO read(Long key) {
        return itemService.read(key);
    }

    @Override
    public ItemDTO update(ItemDTO object) {
        return itemService.update(object);
    }

    @Override
    public void delete(Long key) {
        itemService.delete(key);
    }
}
