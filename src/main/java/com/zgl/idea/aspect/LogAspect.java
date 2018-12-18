package com.zgl.idea.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HandlerAdapter;

@Component
@Aspect
public class LogAspect {

    private static final Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Pointcut("execution( * com.zgl.idea.controller.*.*(..))")
    private void poin2t() {

    }

    @After("poin2t()")
    public void after(JoinPoint point) {
        logger.info("方法签名：" + point.getSignature().getName());
    }

    @Before("poin2t()")
    public void before(JoinPoint point) {
        logger.info("方法签名：" + point.getSignature().getName());
    }

    @AfterReturning("poin2t()")
    public void ret(JoinPoint point) {
        logger.info("结束方法签名：" + point.getSignature().getName());
        System.out.println("方法");
    }
}
