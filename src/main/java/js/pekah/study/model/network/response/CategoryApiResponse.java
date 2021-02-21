package js.pekah.study.model.network.response;

import js.pekah.study.model.enumClass.CategoryType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoryApiResponse {

    private Long id;

    private String type;

    private String title;

}
