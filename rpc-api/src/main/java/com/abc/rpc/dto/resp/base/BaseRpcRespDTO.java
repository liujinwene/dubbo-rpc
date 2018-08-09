package com.abc.rpc.dto.resp.base;

import com.abc.rpc.enums.RpcCodeEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by liujinwen on 2018-08-02
 */
@Data
public class BaseRpcRespDTO<T> implements Serializable {
    private static final long serialVersionUID = -112021968446631099L;
    private Integer code;
    private String msg;
    private T data;

    public BaseRpcRespDTO(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BaseRpcRespDTO(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static BaseRpcRespDTO success() {
        return new BaseRpcRespDTO(RpcCodeEnum.SUCCESS.getCode(), RpcCodeEnum.SUCCESS.getMsg());
    }

    public static <T> BaseRpcRespDTO<T> success(T data) {
        return new BaseRpcRespDTO(RpcCodeEnum.SUCCESS.getCode(), RpcCodeEnum.SUCCESS.getMsg(), data);
    }

    public static BaseRpcRespDTO unknowError() {
        return new BaseRpcRespDTO(RpcCodeEnum.UNKNOW_ERROR.getCode(), RpcCodeEnum.UNKNOW_ERROR.getMsg());
    }

    public static BaseRpcRespDTO methodError() {
        return new BaseRpcRespDTO(RpcCodeEnum.METHOD_ERROR.getCode(), RpcCodeEnum.METHOD_ERROR.getMsg());
    }

    public boolean isSuccess() {
        return RpcCodeEnum.SUCCESS == RpcCodeEnum.get(code);
    }

    public static boolean isSuccess(BaseRpcRespDTO rpcReqDTO) {
        if (rpcReqDTO != null) {
            return RpcCodeEnum.SUCCESS == RpcCodeEnum.get(rpcReqDTO.getCode());
        }
        return false;
    }

    public static boolean isSuccess(Integer code) {
        return RpcCodeEnum.SUCCESS == RpcCodeEnum.get(code);
    }
}
