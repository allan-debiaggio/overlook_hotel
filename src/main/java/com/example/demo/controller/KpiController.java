package com.example.demo.controller;

import com.example.demo.model.Kpi;
import com.example.demo.service.KpiService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/kpis")
public class KpiController {

    private final KpiService service;

    public KpiController(KpiService service) {
        this.service = service;
    }

    // GET /api/kpis
    @GetMapping
    public List<Kpi> getAllKpis() {
        return service.findAll();
    }

    // GET /api/kpis/{id}
    @GetMapping("/{id}")
    public Kpi getKpi(@PathVariable Long id) {
        return service.findById(id);
    }

    // POST /api/kpis
    @PostMapping
    public Kpi createKpi(@RequestBody Kpi kpi) {
        return service.save(kpi);
    }

    // PUT /api/kpis/{id}/valeur/{valeur}
    @PutMapping("/{id}/valeur/{valeur}")
    public Kpi updateValeur(@PathVariable Long id, @PathVariable double valeur) {
        return service.updateValeur(id, valeur);
    }

    // DELETE /api/kpis/{id}
    @DeleteMapping("/{id}")
    public void deleteKpi(@PathVariable Long id) {
        service.delete(id);
    }
}

