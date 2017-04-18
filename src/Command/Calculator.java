package Command;

/**
 * Created by Tom on 13.12.2016.
 */
public class Calculator {
    private int result = 0;

    public Calculator() {
        super();
    }

    public void plus(int a) {
        this.result += a;
    }

    public void minus(int a) {
        this.result -= a;
    }

    public final int getResult() {
        return this.result;
    }
}
