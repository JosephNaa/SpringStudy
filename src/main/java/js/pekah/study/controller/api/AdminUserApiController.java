package js.pekah.study.controller.api;

import js.pekah.study.controller.CrudController;
import js.pekah.study.ifs.CrudInterface;
import js.pekah.study.model.entity.AdminUser;
import js.pekah.study.model.network.Header;
import js.pekah.study.model.network.request.AdminUserApiRequest;
import js.pekah.study.model.network.response.AdminUserApiResponse;
import js.pekah.study.service.AdminUserApiLogicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/api/adminUser")
public class AdminUserApiController extends CrudController<AdminUserApiRequest, AdminUserApiResponse, AdminUser> {

}
