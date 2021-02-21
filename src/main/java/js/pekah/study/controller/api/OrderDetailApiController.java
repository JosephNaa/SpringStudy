package js.pekah.study.controller.api;

import js.pekah.study.controller.CrudController;
import js.pekah.study.ifs.CrudInterface;
import js.pekah.study.model.network.Header;
import js.pekah.study.model.network.request.OrderDetailApiRequest;
import js.pekah.study.model.network.response.OrderDetailApiResponse;
import js.pekah.study.service.OrderDetailApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/api/orderDetail")
public class OrderDetailApiController extends CrudController<OrderDetailApiRequest, OrderDetailApiResponse> {

    @Autowired
    private OrderDetailApiLogicService orderDetailApiLogicService;

    @PostConstruct
    public void init() {
        this.baseService = orderDetailApiLogicService;
    }

}
