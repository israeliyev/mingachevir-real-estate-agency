package io.mingachevir.mingchaverrealestateserver.model.dto.base;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseIdNameCodeDto extends BaseIdNameDto {
    private static final long serialVersionUID = 9209559628156891816L;
    private String code;
}
