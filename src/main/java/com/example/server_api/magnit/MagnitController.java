package com.example.server_api.magnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MagnitController {

    private final MagnitService magnitService;

    @Autowired
    public MagnitController(MagnitService magnitService) {
        this.magnitService = magnitService;
    }

    @PostMapping(value = "/clients")
    public ResponseEntity<?> create(@RequestBody Magnit magnit) {
        magnitService.create(magnit);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/clients")
    public ResponseEntity<List<Magnit>> read() {
        final List<Magnit> clients = magnitService.readAll();

        return clients != null &&  !clients.isEmpty()
                ? new ResponseEntity<>(clients, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @GetMapping(value = "/clients/{id}")
    public ResponseEntity<Magnit> read(@PathVariable(name = "id") int id) {
        final Magnit magnit = magnitService.read(id);

        return magnit != null
                ? new ResponseEntity<>(magnit, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PutMapping(value = "/clients/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int id, @RequestBody Magnit magnit) {
        final boolean updated = magnitService.update(magnit, id);

        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }

    @DeleteMapping(value = "/clients/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int id) {
        final boolean deleted = magnitService.delete(id);

        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
    }
}