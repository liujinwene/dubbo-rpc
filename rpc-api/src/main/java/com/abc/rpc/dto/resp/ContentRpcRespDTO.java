package com.abc.rpc.dto.resp;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by liujinwen on 2018-08-09
 */
@Builder
@Data
public class ContentRpcRespDTO implements Serializable {
    private static final long serialVersionUID = 2913988824450842336L;

    @NotNull(message = "id不能为空")
    private String id;
    @NotNull(message = "name不能为空")
    private String name;
    @NotNull(message = "desc不能为空")
    private String desc;
}
