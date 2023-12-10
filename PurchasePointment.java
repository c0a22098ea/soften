import java.time.LocalDateTime;
    class PurchasePointPayment {
    final CustomerId customerId;
    final ComicId comicId;
    final PurchasePoint consumptionPoint;
    final LocalDateTime paymentDateTime;

    PurchasePointPayment(final Customer customer, final Comic comic) {
        if (customer.isEnabled()) {
            throw new IllegalArgumentException("有効な購入者ではありません。");
        }
	if (comic.isEnabled()) {
	    throw new IllegalArgumentException("現在取り扱いのできないコミックです。");
	}    if (customer.possessionPoint.amount < comic.currentPurchasePoint.amount) {
	  throw new RuntimeException("所持ポイントが不足しています。");
	}
	customerId = customer.id;
	comicId = comic.id;
	consumptionPoint = comic.currentPurchasePoint;
	paymentDateTime = LocalDateTime.now();
    }
}
