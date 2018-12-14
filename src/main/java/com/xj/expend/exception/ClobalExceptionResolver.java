package com.xj.expend.exception;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ClobalExceptionResolver implements HandlerExceptionResolver {
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:sss");
    private static StringBuilder sb = new StringBuilder();

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        //错误信息
        System.out.println("异常时间：" + dateFormat.format(new Date()));
        System.out.println("请求地址：" + request.getRequestURI());
        System.out.println("错误原因: " + ex.toString());

        //详细异常
        sb.setLength(0);
        StackTraceElement[] error=ex.getStackTrace();
        for (StackTraceElement stackTraceElement:error){
            sb.append(stackTraceElement.toString()+"\n");
        }
        System.out.println("详细原因："+sb.toString());

        return new ModelAndView("error");
    }

}
