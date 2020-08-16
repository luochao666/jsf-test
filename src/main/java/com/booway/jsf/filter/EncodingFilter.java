package com.booway.jsf.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter implements Filter
{
    private String encode;

    @Override
    public void destroy()
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException
    {
        request.setCharacterEncoding(encode);
        chain.doFilter(request, response);
        
    }

    @Override
    public void init(FilterConfig request) throws ServletException
    {
         this.encode=request.getInitParameter("encode");
        
    }

}
