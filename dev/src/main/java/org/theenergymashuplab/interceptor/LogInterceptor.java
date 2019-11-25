/**
 * @author Dhrumil Shah
 * @version 1.0
 */
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
	  Enumeration<String> params = request.getParameterNames(); //get all the request parameters
	  while(params.hasMoreElements()){ // iterate over it
		  String paramName = params.nextElement();
		  logger.trace("Parameter Name - "+paramName+", Value - "+request.getParameter(paramName));// log them 
	  } 
      return true;
   }
   @Override
   public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
	   logger.trace(response); // trace the response
   }
   
   @Override
   public void afterCompletion(HttpServletRequest request, HttpServletResponse response, 
      Object handler, Exception exception) throws Exception {}
}