package js.pekah.study.controller.api;

import js.pekah.study.controller.CrudController;
import js.pekah.study.ifs.CrudInterface;
import js.pekah.study.model.entity.Category;
import js.pekah.study.model.network.Header;
import js.pekah.study.model.network.request.CategoryApiRequest;
import js.pekah.study.model.network.response.CategoryApiResponse;
import js.pekah.study.service.CategoryApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/api/category")
public class CategoryApiController extends CrudController<CategoryApiRequest, CategoryApiResponse, Category> {

}
