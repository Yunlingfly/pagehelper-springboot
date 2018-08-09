package cn.yunlingfly.pagehelperdemo.filter;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

@WebFilter(filterName = "druidWebStatFilter", urlPatterns = "/*",
        initParams = {
                @WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")//忽略资源
        }
)
public class DruidStatFilter extends WebStatFilter {
    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("No.3 Druid filter initialized successfully");
        super.init(config);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        System.out.println("No.3 Druid filter");
        super.doFilter(request, response, chain);
    }
}