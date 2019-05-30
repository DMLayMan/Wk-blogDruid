package com.my.blog.website.Druid.Servlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns="/druid/*",
		initParams= {@WebInitParam(name="loginUsername",value="root"),
					 @WebInitParam(name="loginPassword",value="root"),
		})
public class DruidServlet {

	private static final long serialVersionUID=1L;
}
