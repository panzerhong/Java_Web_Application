
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class AuditFilter implements Filter
{
    static int counts=0;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException{
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        counts++;
        request.setAttribute("count",counts);
        chain.doFilter(request, response);
    }
    @Override
    public void destroy() {
        
    }
}
