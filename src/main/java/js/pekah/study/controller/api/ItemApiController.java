package js.pekah.study.controller.api;


import js.pekah.study.controller.CrudController;
import js.pekah.study.ifs.CrudInterface;
import js.pekah.study.model.entity.Item;
import js.pekah.study.model.network.Header;
import js.pekah.study.model.network.request.ItemApiRequest;
import js.pekah.study.model.network.response.ItemApiResponse;
import js.pekah.study.service.ItemApiLogicService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@Slf4j
@RestController
@RequestMapping("/api/item")
public class ItemApiController extends CrudController<ItemApiRequest, ItemApiResponse, Item> {

}
