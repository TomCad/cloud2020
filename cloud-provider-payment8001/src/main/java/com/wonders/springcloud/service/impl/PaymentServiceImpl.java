package com.wonders.springcloud.service.impl;

import com.wonders.springcloud.dao.PaymentDao;
import com.wonders.springcloud.entity.Payment;
import com.wonders.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: cloud2020
 * @description: 服务实现类
 * @author: jorey
 * * @create: 2020-06-05 14:42
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int save(Payment payment) {
        return paymentDao.save(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
