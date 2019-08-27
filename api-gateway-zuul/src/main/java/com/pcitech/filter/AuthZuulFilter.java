package com.pcitech.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;


/**
 * 自定义权限过滤器
 */
public class AuthZuulFilter extends ZuulFilter {

    private static Logger logger = LoggerFactory.getLogger(AuthZuulFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        // 获取request
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        logger.info("send {} request to {}", request.getMethod(), request.getRequestURL().toString());

        Object token = request.getParameter("token");
        if (token == null){
            logger.warn("access token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
        }
        logger.info("access token ok");
        return null;
    }
}
