package js.pekah.study.controller.api;

import js.pekah.study.controller.CrudController;
import js.pekah.study.ifs.CrudInterface;
import js.pekah.study.model.network.Header;
import js.pekah.study.model.network.request.OrderGroupApiRequest;
import js.pekah.study.model.network.response.OrderGroupApiResponse;
import js.pekah.study.service.OrderGroupApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/api/orderGroup")
public class OrderGroupApiController extends CrudController<OrderGroupApiRequest, OrderGroupApiResponse> {

    @Autowired
    private OrderGroupApiLogicService orderGroupApiLogicService;

    @PostConstruct
    public void init() {
        this.baseService = orderGroupApiLogicService;
    }
}
