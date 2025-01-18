package io.mingachevir.mingchaverrealestateserver.model.dto.base;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseIdNameDto extends BaseIdDto {
    private static final long serialVersionUID = 7387470308490229460L;
    private String name;
}
