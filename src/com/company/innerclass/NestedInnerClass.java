package com.company.innerclass;

class OuterV1 {
    private Integer field1;

    class Inner {
        public void show() {
            field1 = 10;
            System.out.println("In a nested class method");
        }
    }

    public Integer getField1() {
        return field1;
    }

    public void setField1(Integer field1) {
        this.field1 = field1;
    }
}

public class NestedInnerClass {
    public static void main(String[] args) {
        OuterV1.Inner innerClassObject = new OuterV1().new Inner();
        innerClassObject.show();
        OuterV1.Inner object = new OuterV1().new Inner();
    }
}
