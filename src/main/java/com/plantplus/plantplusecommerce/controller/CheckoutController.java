package com.plantplus.plantplusecommerce.controller;

import com.plantplus.plantplusecommerce.dto.Purchase;
import com.plantplus.plantplusecommerce.dto.PurchaseResponse;
import com.plantplus.plantplusecommerce.service.CheckoutService;
import com.plantplus.plantplusecommerce.dto.Purchase;
import com.plantplus.plantplusecommerce.dto.PurchaseResponse;
import com.plantplus.plantplusecommerce.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }

}









