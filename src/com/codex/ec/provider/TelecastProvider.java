package com.codex.ec.provider;

public class TelecastProvider {
	private String providerName;

	public TelecastProvider(String providerName) {
		this.providerName = providerName;
	}

	public String getPlayerName() {
		return providerName;
	}
}
