package br.com.sidneydev.payrollapi.resources;

import br.com.sidneydev.payrollapi.domain.Payroll;
import br.com.sidneydev.payrollapi.domain.User;
import br.com.sidneydev.payrollapi.feingClients.UserFeing;
import br.com.sidneydev.payrollapi.services.PayrollService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/payments")
public class PayrollResource {

    private final PayrollService service;

    @GetMapping(value = "/{workerId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payment) {
        return ResponseEntity.ok().body(service.getPayment(workerId, payment));
    }
}
