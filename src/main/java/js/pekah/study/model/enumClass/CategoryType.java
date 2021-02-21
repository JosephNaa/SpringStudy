package js.pekah.study.model.enumClass;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CategoryType {

    COMPUTER(0, "컴퓨터", "컴퓨터 카테고리"),
    ;

    private Integer id;
    private String title;
    private String description;
}
