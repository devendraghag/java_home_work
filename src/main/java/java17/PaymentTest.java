package java17;

sealed interface Payment permits CardPayment, CashPayment,CryptoPayment { }

non-sealed class CardPayment implements Payment { }

final class CashPayment implements Payment { }

non-sealed class CryptoPayment implements  Payment{ }

//Preview feature
public class PaymentTest {
    public static void main(String[] args) {

        Payment payment = new CryptoPayment();

        PaymentTest paymentTest = new PaymentTest();

    //    String result = paymentTest.makePayment(payment);
     //   System.out.println(result);
    }

//    public String makePayment(Payment payment) {
//         return switch (payment){
//            case CardPayment cardPayment -> "Paying by card";
//            case CashPayment cashPayment -> "Paying by cash";
//            case CryptoPayment cryptoPayment -> "Paying using cryptos";
//        };
//    }
}
