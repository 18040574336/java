/**
 * @Author: liangpeng
 * @Date: 2021/11/12 10:05
 */
public enum OperationTypeEnum {

    ADD("A"),UPDATE("U"),DELETE("D"),REPLACE("R");
    private String value;

    OperationTypeEnum(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
