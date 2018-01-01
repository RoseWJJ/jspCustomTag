package com.et;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class LoginTag extends TagSupport {
	@Override
	public int doStartTag() throws JspException {
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
		String datStr = sim.format(new Date());
		try {
			pageContext.getOut().print(datStr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return super.doStartTag();
	}
}
