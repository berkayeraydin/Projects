package com.berkay.fullStackProjeBackend.core.config;

// todo
/*
@Component
@Order(1)
public class GlobalFilter implements Filter {

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        ((HttpServletResponse)response).setHeader("Access-Control-Allow-Origin", "*");
        ((HttpServletResponse)response).setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        ((HttpServletResponse)response).setHeader("Access-Control-Max-Age", "3600");
        ((HttpServletResponse)response).setHeader("Access-Control-Allow-Headers", "authorization, content-type, xsrf-token");
        ((HttpServletResponse)response).addHeader("Access-Control-Expose-Headers", "xsrf-token");
        if ("OPTIONS".equals(((HttpServletRequest) request).getMethod())) {
            ((HttpServletResponse) response).setStatus(HttpServletResponse.SC_OK);
            return;
        }
        String path = ((HttpServletRequest) request).getRequestURI();
        String x = req.getHeader("Authorization");
        if(path.contains("swagger") || path.contains("api-docs")){
            chain.doFilter(request, response);
            return;
        }
        if(( x==null || !x.equals("Bearer ERAYDIN")) ){
            ErrorResponse errorResponse = new ErrorResponse();
            errorResponse.setCode(401);
            errorResponse.setMessage("Unauthorized Access");
            byte[] responseToSend = restResponseBytes(errorResponse);
            ((HttpServletResponse) response).setHeader("Content-Type", "application/json");

            ((HttpServletResponse) response).setStatus(401);
            response.getOutputStream().write(responseToSend);
        }else{
            chain.doFilter(request, response);
        }
    }

    private byte[] restResponseBytes(ErrorResponse eErrorResponse) throws IOException {
        String serialized = new ObjectMapper().writeValueAsString(eErrorResponse);
        return serialized.getBytes();
    }
    // other methods
}

 */