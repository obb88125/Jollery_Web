<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
  <head>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <meta charset="utf-8" />
    <link rel="icon" href="https://static.toss.im/icons/png/4x/icon-toss-logo.png" />
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/toss/css/style.css' />" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>토스페이먼츠 샘플 프로젝트</title>
    <!-- 토스페이먼츠 SDK 추가 -->
    <script src="https://js.tosspayments.com/v2/standard"></script>
  </head>

  <body>
    <!-- 주문서 영역 -->
    <div class="wrapper">
      <div class="box_section" style="padding: 40px 30px 50px 30px; margin-top: 30px; margin-bottom: 50px">
        <!-- 결제 UI -->
        <div id="payment-method"></div>
        <!-- 이용약관 UI -->
        <div id="agreement"></div>
        <!-- 결제하기 버튼 -->
        <div class="result wrapper">
          <button class="button" id="payment-button" style="margin-top: 30px">
            결제하기
          </button>
        </div>
      </div>
    <script>
      main();

      async function main() {
        const button = document.getElementById("payment-button");
        const amount = {
          currency: "KRW",
          value: 100,
        };
        // ------  결제위젯 초기화 ------
        // TODO: clientKey는 개발자센터의 결제위젯 연동 키 > 클라이언트 키로 바꾸세요.
        // TODO: 구매자의 고유 아이디를 불러와서 customerKey로 설정하세요. 이메일・전화번호와 같이 유추가 가능한 값은 안전하지 않습니다.
        // @docs https://docs.tosspayments.com/sdk/v2/js#토스페이먼츠-초기화
        const clientKey = "test_gck_docs_Ovk5rk1EwkEbP0W43n07xlzm";
        const customerKey = generateRandomString();
        const tossPayments = TossPayments(clientKey);
        // 회원 결제
        const widgets = tossPayments.widgets({
          customerKey,
        });
        // 비회원 결제
        // const widgets = tossPayments.widgets({customerKey: TossPayments.ANONYMOUS});

        // ------  주문서의 결제 금액 설정 ------
        // TODO: 위젯의 결제금액을 결제하려는 금액으로 초기화하세요.
        // TODO: renderPaymentMethods, renderAgreement, requestPayment 보다 반드시 선행되어야 합니다.
        await widgets.setAmount(amount);

        // ------  결제 UI 렌더링 ------
        // @docs https://docs.tosspayments.com/sdk/v2/js#widgetsrenderpaymentmethods
        await widgets.renderPaymentMethods({
          selector: "#payment-method",
          // 렌더링하고 싶은 결제 UI의 variantKey
          // 결제 수단 및 스타일이 다른 멀티 UI를 직접 만들고 싶다면 계약이 필요해요.
          // @docs https://docs.tosspayments.com/guides/v2/payment-widget/admin#새로운-결제-ui-추가하기
          variantKey: "DEFAULT",
        });

        // ------  이용약관 UI 렌더링 ------
        // @docs https://docs.tosspayments.com/reference/widget-sdk#renderagreement선택자-옵션
        await widgets.renderAgreement({ selector: "#agreement", variantKey: "AGREEMENT" });


        // ------ '결제하기' 버튼 누르면 결제창 띄우기 ------
        // @docs https://docs.tosspayments.com/sdk/v2/js#widgetsrequestpayment
        button.addEventListener("click", async function () {
          // 결제를 요청하기 전에 orderId, amount를 서버에 저장하세요.
          // 결제 과정에서 악의적으로 결제 금액이 바뀌는 것을 확인하는 용도입니다.
          await widgets.requestPayment({
            orderId: generateRandomString(),
            orderName: "상품 앞에서 받아와야됨",
            successUrl: window.location.origin + "/jollery/pcpay/success",
            failUrl: window.location.origin + "/jollery/pcpay/fail",
            customerEmail: "customer123@gmail.com" ,
            customerName: "김수한무거북이와두루미삼천갑자동방삭치치카포사리사리센타워리워리세브리깡무두셀라구름이허리케인에담벼락담벼락에서생원서생원에고양이고양이엔바둑이바둑이는돌돌이",
            customerMobilePhone: "01012341234",
          });
        });
      }

      function generateRandomString() {
        return window.btoa(Math.random()).slice(0, 20);
      }
    </script>
  </body>
</html>
