package com.project.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class VehicleThreadConfiguration {
	
		@Bean
	    public TaskExecutor defaultExecutor() {
	        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
	        executor.setCorePoolSize(4);
	        executor.setMaxPoolSize(4);
	        executor.setThreadNamePrefix("default_task_executor_thread");
	        executor.initialize();
	        return executor;
	    } 
	
}
