package js.pekah.study.service;

import js.pekah.study.ifs.CrudInterface;
import js.pekah.study.model.entity.Category;
import js.pekah.study.model.network.Header;
import js.pekah.study.model.network.request.CategoryApiRequest;
import js.pekah.study.model.network.response.CategoryApiResponse;
import js.pekah.study.model.network.response.UserApiResponse;
import js.pekah.study.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryApiLogicService extends BaseService<CategoryApiRequest, CategoryApiResponse, Category> {

    @Override
    public Header<CategoryApiResponse> create(Header<CategoryApiRequest> request) {

        CategoryApiRequest body = request.getData();

        Category category = Category.builder()
                .type(body.getType())
                .title(body.getTitle())
                .build();

        Category newCategory = baseRepository.save(category);

        return Header.OK(response(newCategory));
    }

    @Override
    public Header<CategoryApiResponse> read(Long id) {
        return baseRepository.findById(id)
                .map(this::response)
                .map(Header::OK)
                .orElseGet(()->Header.ERROR("no data"));
    }

    @Override
    public Header<CategoryApiResponse> update(Header<CategoryApiRequest> request) {

        CategoryApiRequest body = request.getData();

        return baseRepository.findById(body.getId())
                .map(category -> {
                    category
                            .setType(body.getType())
                            .setTitle(body.getTitle())
                            ;

                    return category;
                })
                .map(changeCategory -> baseRepository.save(changeCategory))
                .map(this::response)
                .map(Header::OK)
                .orElseGet(()->Header.ERROR("no data"));
    }

    @Override
    public Header delete(Long id) {
        return baseRepository.findById(id)
                .map(cateogry -> {
                    baseRepository.delete(cateogry);
                    return Header.OK();
                })
                .orElseGet(()->Header.ERROR("no data"));
    }

    private CategoryApiResponse response(Category category){

        CategoryApiResponse categoryApiResponse = CategoryApiResponse.builder()
                .id(category.getId())
                .type(category.getType())
                .title(category.getTitle())
                .build();

        return categoryApiResponse;
    }

    @Override
    public Header<List<CategoryApiResponse>> search(Pageable pageable) {
        return null;
    }
}
