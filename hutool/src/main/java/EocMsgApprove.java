public enum EocMsgApprove {
    EOC_BASIS_APPLY("EOC基础数据申请单"),EOC_PUBLISH("EOC发布单"),PART_NAME("零件名称发布单"),PRODUCT_STRUCTURE("CPSC/PAF发布单")
    ,COLOR_CHANGE_ORDER("颜色变更单"),ENGINEERING_CHANGE("工程变更单"),MANUFACTURE_CHANGE("制造变更单"),TWO_CHANGE("临时变更单")
    ,SVO_CHANGE_ORDER("SVO变更单");
    private String value;

    EocMsgApprove(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
