/*package com.aliencode.rms_backend.CapaLogica.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class ReportController {
    @Autowired
    private ReportService reportService;

    @GetMapping("/sales")
    public ResponseEntity<List<SalesReport>> getSalesReport() {
        List<SalesReport> salesReport = reportService.generateSalesReport();
        return ResponseEntity.ok(salesReport);
    }

    @GetMapping("/inventory")
    public ResponseEntity<List<InventoryReport>> getInventoryReport() {
        List<InventoryReport> inventoryReport = reportService.generateInventoryReport();
        return ResponseEntity.ok(inventoryReport);
    }

}*/
