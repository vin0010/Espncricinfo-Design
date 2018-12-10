package com.codex.ec.user;

public class GeneralAdmin implements User {
	private String userName;
	private Long userMobile;

	public GeneralAdmin(String userName, Long userMobile) {
		this.userMobile = userMobile;
		this.userName = userName;
	}

	@Override
	public String getUserName() {
		return userName;
	}

	@Override
	public Long getUserMobile() {
		return userMobile;
	}

}
