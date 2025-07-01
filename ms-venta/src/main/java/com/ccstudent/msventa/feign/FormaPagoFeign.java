package com.ccstudent.msventa.feign;

import com.ccstudent.msventa.dto.ClienteDto;
import com.ccstudent.msventa.dto.FormaPagoDto;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-formapago", path = "/formapago")
public interface FormaPagoFeign {
    @GetMapping("/{id}")
    @CircuitBreaker(name = "formapagoListarPorIdCB", fallbackMethod = "fallbackFormapagoListarById")
    public ResponseEntity<FormaPagoDto> buscarformapago(@PathVariable Integer id);

    default ResponseEntity<FormaPagoDto> fallbackFormapagoListarById(Integer id, Exception e) {
        FormaPagoDto formaPagoDto = new FormaPagoDto();
        formaPagoDto.setFormapago("Servicio no disponible de formapago");
        return ResponseEntity.ok(formaPagoDto);
    }
}