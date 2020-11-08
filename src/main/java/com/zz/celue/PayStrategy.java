package com.zz.celue;

/**
 * @since 1.0
 */
public interface PayStrategy {
    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}
