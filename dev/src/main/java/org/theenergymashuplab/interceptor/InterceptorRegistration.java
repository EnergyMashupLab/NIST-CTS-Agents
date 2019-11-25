/**
 * @author Dhrumil Shah
 * @version 1.0
 */
package org.theenergymashuplab.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SuppressWarnings("deprecation")
@Component
public class InterceptorRegistration extends WebMvcConfigurerAdapter{

   @Autowired
   LogInterceptor logInterceptor;//instance of LogInterceptor

   @Override
   public void addInterceptors(InterceptorRegistry registry) {
      registry.addInterceptor(logInterceptor);//register our LogInterceptor
   }
}