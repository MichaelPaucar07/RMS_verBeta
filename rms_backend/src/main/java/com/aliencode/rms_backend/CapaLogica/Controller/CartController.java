package com.aliencode.rms_backend.CapaLogica.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.aliencode.rms_backend.CapaDatos.Entity.CartItem;

@RestController
@RequestMapping("/api/reports")
public class CartController {
     private List<CartItem> cartItems = new ArrayList<>();

    @PostMapping("/items")
    public void addItemToCart(@RequestBody CartItem item) {
        cartItems.add(item);
    }

    @DeleteMapping("/items/{index}")
    public void removeItemFromCart(@PathVariable int index) {
        if (index >= 0 && index < cartItems.size()) {
            cartItems.remove(index);
        }
    }

    @GetMapping("/total")
    public double calculateCartTotal() {
        double total = 0;
        for (CartItem item : cartItems) {
            total += item.getPrecio();
        }
        return total;
    }
}
