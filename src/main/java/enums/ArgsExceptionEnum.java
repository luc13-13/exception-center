package enums;

/**
 * @author: lucheng
 * @data: 2021/11/23 13:56
 * @version: 1.0
 */
public enum ArgsExceptionEnum {

    ILLEGAL(5001,"请检查参数"),
    OUT_OF_RANGE(5002,"参数范围非法"),
    NOT_LESS_THAN_ZERO(5003,"参数不能小于0"),
    NOT_GREATER_THAN_ZERO(5004,"参数不能大于0"),
    NOT_NULL(4002,"参数非空"),
    FORBIDDEN_ARGS(4001,"参数非法");


    private Integer code;
    private String message;

    ArgsExceptionEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static String getMessage(Integer code) {
        for(ArgsExceptionEnum argsExceptionEnum : values()) {
            if(argsExceptionEnum.code.equals(code)) {
                return argsExceptionEnum.message;
            }
        }
        return null;
    }

    public String getMessage() {
        return this.message;
    }

    public static ArgsExceptionEnum valueOf(Integer code) {
        for(ArgsExceptionEnum argsExceptionEnum : values()) {
            if(argsExceptionEnum.code.equals(code)) {
                return argsExceptionEnum;
            }
        }
        return null;
    }

    public Integer getCode() {
        return code;
    }

    public Integer getCode(String message) {

        return null;
    }
}
