package com.abc.rpc.dto.resp;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * Created by liujinwen on 2018-08-09
 */
@Builder
@Data
public class ContentRpcRespDTO implements Serializable {
    private static final long serialVersionUID = 2913988824450842336L;

    @NotEmpty(message = "id不能为空")
    private String id;
    @NotEmpty(message = "name不能为空")
    private String name;
    @NotEmpty(message = "desc不能为空")
    private String desc;
}
