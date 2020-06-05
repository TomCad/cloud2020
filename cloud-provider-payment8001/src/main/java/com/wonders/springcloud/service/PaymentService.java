package com.wonders.springcloud.service;

import com.wonders.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public int save(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
