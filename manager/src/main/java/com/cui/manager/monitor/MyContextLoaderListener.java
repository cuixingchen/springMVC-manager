package com.cui.manager.monitor;

import javax.servlet.ServletContext;

import org.springframework.web.context.ConfigurableWebApplicationContext;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * spring web监听器
 * 
 * @author cuipengfei
 *
 */
public class MyContextLoaderListener extends ContextLoaderListener {

	@Override
	protected void customizeContext(ServletContext servletContext,
			ConfigurableWebApplicationContext applicationContext) {
		// TODO Auto-generated method stub
		super.customizeContext(servletContext, applicationContext);
		if (applicationContext instanceof XmlWebApplicationContext) {
			XmlWebApplicationContext context = (XmlWebApplicationContext) applicationContext;
			context.setAllowBeanDefinitionOverriding(false);//设置是否可以覆盖相同的bean：false当有相同的bean时抛出异常
		}
	}
}
