package task.warehouseapplication.controller;

import task.warehouseapplication.model.dto.OrderDTO;
import task.warehouseapplication.service.OrderService;
import task.warehouseapplication.util.CrudOperation;

public class OrderController implements CrudOperation<OrderDTO,Long> {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public OrderDTO create(OrderDTO object) {
        return orderService.create(object);
    }

    @Override
    public OrderDTO read(Long aLong) {
        return orderService.read(aLong);
    }

    @Override
    public OrderDTO update(OrderDTO object) {
        return orderService.update(object);
    }

    @Override
    public void delete(Long aLong) {
        orderService.delete(aLong);
    }
}
