interface Payment {
    void pay();
}

class GooglePay implements Payment {
    public void pay() {
        System.out.println("Payment using GooglePay");
    }
}

class PhonePe implements Payment {
    public void pay() {
        System.out.println("Payment using PhonePe");
    }
}

public class InterfaceEx5{
    public static void main(String[] args) {
        Payment p1 = new GooglePay();
        p1.pay();

        Payment p2 = new PhonePe();
        p2.pay();
    }
}
