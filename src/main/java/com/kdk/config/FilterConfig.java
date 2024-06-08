package com.kdk.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.navercorp.lucy.security.xss.servletfilter.XssEscapeServletFilter;

/**
 * <pre>
 * -----------------------------------
 * 개정이력
 * -----------------------------------
 * 2024. 6. 8. 김대광	최초작성
 * </pre>
 *
 *
 * @author 김대광
 */
@Configuration
public class FilterConfig {

    @Bean
    FilterRegistrationBean<XssEscapeServletFilter> getXssEscapeServletFilter() {
		FilterRegistrationBean<XssEscapeServletFilter> registrationBean = new FilterRegistrationBean<>(new XssEscapeServletFilter());
		return registrationBean;
	}

}
