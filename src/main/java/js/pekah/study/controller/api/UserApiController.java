package js.pekah.study.controller.api;

import js.pekah.study.controller.CrudController;
import js.pekah.study.ifs.CrudInterface;
import js.pekah.study.model.network.Header;
import js.pekah.study.model.network.request.UserApiRequest;
import js.pekah.study.model.network.response.UserApiResponse;
import js.pekah.study.service.UserApiLogicService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserApiController extends CrudController<UserApiRequest, UserApiResponse> {

    @Autowired
    private UserApiLogicService userApiLogicService;

    @PostConstruct
    public void init() {
        this.baseService = userApiLogicService;
    }
}
