package com.plantplus.plantplusecommerce.service;


import com.plantplus.plantplusecommerce.dto.Purchase;
import com.plantplus.plantplusecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
