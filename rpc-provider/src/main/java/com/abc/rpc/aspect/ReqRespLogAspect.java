package com.abc.rpc.aspect;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by liujinwen on 2018-08-17
 */
@Component
@Aspect
@Order(-1)
@Slf4j
public class ReqRespLogAspect {

    @Pointcut("execution(public * com.abc.rpc.service..*.*(..))")
    public void webLog(){}

    @Around("webLog()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        // 1.接收到请求，记录请求内容
        String methodName = proceedingJoinPoint.getSignature().getDeclaringType().getSimpleName() + "." + proceedingJoinPoint.getSignature().getName();
        String reqData = JSON.toJSONString(proceedingJoinPoint.getArgs());
        log.info("resquest : methodName={},reqData={}", methodName, reqData);

        // 2.执行方法
        try {
            Object respResult = proceedingJoinPoint.proceed();
            log.info("response success : {}", JSON.toJSONString(respResult));
        } catch (Exception e) {
            e.printStackTrace();
            log.info("response error : {}", e.getMessage());
        }
    }
}
