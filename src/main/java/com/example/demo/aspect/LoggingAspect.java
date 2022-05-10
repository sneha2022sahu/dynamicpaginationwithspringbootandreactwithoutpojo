package com.example.demo.aspect;



import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	 private final Logger log = LoggerFactory.getLogger(this.getClass());

	    /**
	     * Pointcut that matches all repositories, services and Web REST endpoints.
	     */
	    @Pointcut("within(@org.springframework.stereotype.Repository *)" +
	        " || within(@org.springframework.stereotype.Service *)" +
	        " || within(@org.springframework.web.bind.annotation.RestController *)")
	    public void springBeanPointcut() {
	        // Method is empty as this is just a Pointcut, the implementations are in the advices.
	    }

	    
}
