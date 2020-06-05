package com.wonders.springcloud.dao;

import com.wonders.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
public interface PaymentDao {
    public int save(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
