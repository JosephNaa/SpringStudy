package js.pekah.study.controller.api;

import js.pekah.study.ifs.CrudInterface;
import js.pekah.study.model.network.Header;
import js.pekah.study.model.network.request.OrderGroupApiRequest;
import js.pekah.study.model.network.response.OrderGroupApiResponse;
import js.pekah.study.service.OrderGroupApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orderGroup")
public class OrderGroupApiController implements CrudInterface<OrderGroupApiRequest, OrderGroupApiResponse> {

    @Autowired
    private OrderGroupApiLogicService orderGroupApiLogicService;

    @Override
    @PostMapping("")
    public Header<OrderGroupApiResponse> create(@RequestBody Header<OrderGroupApiRequest> request) {
        return orderGroupApiLogicService.create(request);
    }

    @Override
    @GetMapping("{id}")
    public Header<OrderGroupApiResponse> read(@PathVariable Long id) {
        return orderGroupApiLogicService.read(id);
    }

    @Override
    @PutMapping("")
    public Header<OrderGroupApiResponse> update(@RequestBody Header<OrderGroupApiRequest> request) {
        return orderGroupApiLogicService.update(request);
    }

    @Override
    @DeleteMapping("{id}")
    public Header delete(@PathVariable Long id) {
        return orderGroupApiLogicService.delete(id);
    }
}
