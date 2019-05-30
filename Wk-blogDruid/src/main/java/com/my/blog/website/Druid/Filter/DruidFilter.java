package com.my.blog.website.Druid.Filter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(filterName="druidWebFilter",urlPatterns="/*",
		initParams= {@WebInitParam(name="exclusion",value="*.js,*.gif,*.jpg,/druid/*")})
public class DruidFilter {

}
