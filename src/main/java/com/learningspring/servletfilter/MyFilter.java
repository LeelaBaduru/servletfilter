package com.learningspring.servletfilter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/*
The following example shows the code for reading the remote host and remote address from the ServletRequest object before sending the request to the controller.
In doFilter() method, we have added the System.out.println statements to print the remote host and remote address.
*/

@Component
public class MyFilter implements Filter {
    @Override
    public void destroy() {}

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterchain)
            throws IOException, ServletException {
        // place to perform request processing
        System.out.println("Remote Host:"+request.getRemoteHost());
        System.out.println("Remote Address:"+request.getRemoteAddr());
        filterchain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig filterconfig) throws ServletException {}
}

