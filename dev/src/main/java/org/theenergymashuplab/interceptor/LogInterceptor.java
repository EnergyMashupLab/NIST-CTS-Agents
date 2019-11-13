package org.theenergymashuplab.interceptor;

import java.util.Enumeration;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class LogInterceptor  implements HandlerInterceptor{
	private static final Logger logger = LogManager.getLogger(LogInterceptor.class);
	
   @Override
   public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
	  Enumeration<String> params = request.getParameterNames(); 
	  while(params.hasMoreElements()){
		  String paramName = params.nextElement();
		  logger.info("Parameter Name - "+paramName+", Value - "+request.getParameter(paramName));
	  } 
      return true;
   }
   @Override
   public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
	   logger.info(response);
   }
   
   @Override
   public void afterCompletion(HttpServletRequest request, HttpServletResponse response, 
      Object handler, Exception exception) throws Exception {}
}