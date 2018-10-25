package com.gq.gqrhm.dto;

import lombok.Data;

@Data
public class Msg {
    private String title;
    private String content;
    private String extraInfo;

    public Msg() {
    }
    public Msg(String title, String content, String extraInfo) {
        this.title = title;
        this.content = content;
        this.extraInfo = extraInfo;
    }
}
