package com.abc.rpc.controller;

import com.abc.rpc.dto.req.GetContentRpcReqDTO;
import com.abc.rpc.dto.resp.ContentRpcRespDTO;
import com.abc.rpc.dto.resp.base.BaseRpcRespDTO;
import com.abc.rpc.service.ContentRpcService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liujinwen on 2018-08-06
 */
@RestController
public class ContentController {

    @Reference
    private ContentRpcService contentRpcService;

    @RequestMapping("getContent")
    public String getContent(@RequestBody GetContentRpcReqDTO reqDTO) {
        BaseRpcRespDTO<ContentRpcRespDTO> respDTO = contentRpcService.getContent(reqDTO);
        return JSON.toJSONString(respDTO);
    }


}
