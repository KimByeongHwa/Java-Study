package poly.ex.pay0;

public class NaverPay {

    public boolean pay(int amount) {
        System.out.println("네이버페이 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }

    public static class PayMain0 {

        public static void main(String[] args) {
            PayService payService = new PayService();

            //kakao 결제
            String payOption1 = "kakao";
            int amount1 = 5000;
            payService.processPay(payOption1, amount1);

            //naver 결제
            String payOption2 = "naver";
            int amount2 = 10000;
            payService.processPay(payOption2, amount2);

            //잘못된 결제 수단 선택
            String payOption3 = "bad";
            int amount3 = 15000;
            payService.processPay(payOption3, amount3);

        }

    }
}
