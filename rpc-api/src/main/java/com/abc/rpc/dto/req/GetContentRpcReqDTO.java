package com.abc.rpc.dto.req;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by liujinwen on 2018-07-30
 */
@Builder
@Data
public class GetContentRpcReqDTO implements Serializable {
    private static final long serialVersionUID = -7245744117766898109L;

    @NotEmpty(message = "id不能为空")
    private String id;
    @NotEmpty(message = "name不能为空")
    private String name;
}
