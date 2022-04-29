package com.example.server_api.magnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class MagnitServiceImpl implements MagnitService {
    @Autowired
    private MagnitRepository magnitRepository;

        @Override
        public void create(Magnit client) {
            magnitRepository.save(client);
        }

        @Override
        public List< Magnit>  readAll() {
            return magnitRepository.findAll();
        }

        @Override
        public Magnit read(int id) {
            return magnitRepository.getOne(id);
        }

        @Override
        public boolean update(Magnit client, int id) {
            if (magnitRepository.existsById(id)) {
                client.setId(id);
                magnitRepository.save(client);
                return true;
            }

            return false;
        }

        @Override
        public boolean delete(int id) {
            if (magnitRepository.existsById(id)) {
                magnitRepository.deleteById(id);
                return true;
            }
            return false;
        }
    }