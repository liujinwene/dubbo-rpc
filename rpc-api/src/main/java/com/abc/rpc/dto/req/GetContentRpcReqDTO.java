package com.abc.rpc.dto.req;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by liujinwen on 2018-07-30
 */
@Builder
@Data
public class GetContentRpcReqDTO implements Serializable {
    private static final long serialVersionUID = -7245744117766898109L;

    @NotNull(message = "id不能为空")
    private String id;
    @NotNull(message = "name不能为空")
    private String name;
}
