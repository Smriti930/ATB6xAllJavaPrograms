package C_06242024.Abstraction.LoanEx;

public class Son extends Father {

    @Override
    void loan50k() {
        System.out.println("50K loan-Paid by son");
        System.out.println("Accessed by son");
    }
}
