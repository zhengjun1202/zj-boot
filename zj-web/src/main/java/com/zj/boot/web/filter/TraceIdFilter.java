package com.zj.boot.web.filter;

import cn.hutool.core.lang.UUID;
import cn.hutool.core.net.NetUtil;
import com.zj.boot.web.constant.HeaderConstant;
import org.slf4j.MDC;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 增加traceId的过滤器
 *
 * @author 郑军
 * @date 2022-07-26 22:30
 */
public class TraceIdFilter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        // 设置trace_id
        MDC.put(HeaderConstant.TRACE_ID, NetUtil.getLocalhostStr());
        chain.doFilter(request, response);
    }

}
