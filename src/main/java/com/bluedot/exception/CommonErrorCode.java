package com.bluedot.exception;

/**
 * @author FireRain
 * @version 1.0
 * @date 2022/8/17 11:47
 * @created: 用户异常信息枚举类
 */
public enum CommonErrorCode implements ErrorCode {

    /**
     * 用户模块错误:E_1xxx
     */
    E_1001(1001,"登录失败"),
    E_1002(1002,"该邮箱已注册"),
    E_1003(1003,"非法邮箱"),
    E_1004(1004,"验证码错误"),
    E_1005(1005,"该用户邮箱不存在"),
    E_1006(1006,"用户信息非法修改"),
    E_1007(1007,"禁止进行未验证的密码修改"),
    E_1008(1008,"账号或密码错误"),
    E_1009(1009,"查询分页不存在"),
    E_1010(1010,"图片验证码失效或不存在"),
    E_1011(1011,"用户未登录"),
    E_1012(1012,"没有可用的邮箱验证码"),
    E_1013(1013,"请传入有效分析文件"),
    E_1014(1014,"缺少业务所需参数"),
    E_1015(1015,"密码错误"),
    E_1016(1016,"用户冻结中，请申请解冻"),
    E_1017(1017,"解冻申请审核中，请耐心等待审核通过"),
    E_1018(1018,"异常用户状态"),
    E_1019(1019,"不存在此算法"),

    /**
     * 数据管理模块错误:E_2xxx
     */
    E_2001(2001,"数据管理失败!"),
    E_2002(2002,"同意申请异常时，出现了异常"),

    /**
     * 权限方面的异常
     */
    E_3001(3001,"您没有此操作的权限"),

    /**
     * 算法执行方面的异常:E_4xxx
     */
    E_4001(4001, "数据不能为空"),
    E_4002(4002, "编译错误"),
    E_4003(4003, "运行错误"),
    E_4004(4004, "方法返回值不正确！"),
    E_4005(4005, "找不到算法！"),
    E_4006(4006, "建模所选实验数据过少，请至少选择10条"),

    /**
     * 通用异常
     */
    E_5001(5001,"错误的请求参数"),
    E_5002(5002,"非法数据传入"),
    E_5003(5003,"异常文件上传"),

    /**
     * 系统异常
     */
    E_6001(6001,"系统出现异常"),

    /**
     * 算法service异常
     */
    E_7001(7001, "该算法名已存在"),
    E_7002(7002, "该算法测试不通过"),
    E_7003(7003, "该算法不存在"),
    E_7004(7004, "存在不属于该用户的算法"),
    /**
     * mapper异常
     */
    E_8001(8001,"mapper操作类型错误"),
    E_8002(8002,"自动生成的sql语句为空"),
    E_8003(8003,"更新数据错误"),

    /**
     * 备份service异常
     */
    E_9001(9001,"数据库备份文件不存在"),


    /**
     * 文件操作方面异常
     */
    E_10001(10001,"上传算法文件失败!"),
    E_10002(10002,"执行算法python文件失败")
    ;
    private final int code;
    private String msg;

    CommonErrorCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }

    @Override
    public CommonErrorCode setMsg(String msg) {
        this.msg = msg;
        return this;
    }
}
