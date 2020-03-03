package com.slk.single.register;

public enum    EnumSignle {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSignle getInstance(){return INSTANCE;}
}
