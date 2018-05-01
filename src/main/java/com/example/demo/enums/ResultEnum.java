package com.example.demo.enums;

public enum ResultEnum {

	 UNKONW_ERROR(-1, "未知错误"),
	 SUCCESS(0, "成功"),
	 PRIMARY_SCHOOL(100, "小学生"),
	 MIDDLE_SCHOOL(101, "初中生"),
	 COLLEGE_SCHOOL(102, "大学生"),
	 SOCIAL_SCHOOL(103, "社会人员"),;
	
	private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
