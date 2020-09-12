package filter;

import javax.servlet.*;
import java.io.IOException;

public class LogFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init");
        // 获取初始化参数
        String site = filterConfig.getInitParameter("Site");
        // 输出初始化参数
        System.out.println("网站名称: " + site);
    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter");
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
