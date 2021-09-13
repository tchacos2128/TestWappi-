package com.jikkosoft.wappi.utils;

public enum SuitUrl {
    WAPPI("https://automation-wappi.vercel.app/login");

    private String url;

    SuitUrl(String url) {
        this.url = url;
    }

    public String url() {
        return this.url;
    }
}