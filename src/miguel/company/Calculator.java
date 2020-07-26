package miguel.company;

public class Calculator {
    private float num1;
    private float num2;

    // Getter Method
    public float getNum1AddNum2() {
        return num1 + num2;
    }

    public float getNum1SubNum2() {
        return num1 - num2;
    }

    public float getNum1MulNum2() {
        return num1 * num2;
    }

    public float getNum1DivNum2() {
        return num1 / num2;
    }

    // Setter Method
    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

}
