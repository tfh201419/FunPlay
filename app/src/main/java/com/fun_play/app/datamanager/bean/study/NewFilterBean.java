package com.fun_play.app.datamanager.bean.study;

public class NewFilterBean {

    private String option;
    private String id;

    public NewFilterBean(String option, String id) {
        this.option = option;
        this.id = id;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
