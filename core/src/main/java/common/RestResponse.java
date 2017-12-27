package common;

import java.io.Serializable;

public class RestResponse implements Serializable {
	private static final long serialVersionUID = -7488160143676062603L;

	private Integer code;
	private String message;
	private Object content;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}
}
