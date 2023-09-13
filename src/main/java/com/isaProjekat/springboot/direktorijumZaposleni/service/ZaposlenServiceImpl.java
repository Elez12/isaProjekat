package com.isaProjekat.springboot.direktorijumZaposleni.service;

import com.isaProjekat.springboot.direktorijumZaposleni.dao.ZaposlenRepository;
import com.isaProjekat.springboot.direktorijumZaposleni.entity.Zaposlen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ZaposlenServiceImpl implements ZaposlenService {

    private final ZaposlenRepository zaposlenRepository;

    @Autowired
    public ZaposlenServiceImpl(ZaposlenRepository p_ZaposlenRepository) {
        zaposlenRepository = p_ZaposlenRepository;
    }

    @Override
    public List<Zaposlen> findAll() {
        return zaposlenRepository.findAllByOrderByPrezimeAsc();
    }

    @Override
    public Zaposlen findById(int p_Id) {
        Optional<Zaposlen> result = zaposlenRepository.findById(p_Id);

        Zaposlen zaposlen = null;

        if (result.isPresent()) {
            zaposlen = result.get();
        } else {
            // we didn't find the zaposlen
            throw new RuntimeException("Ne postoji zaposlen sa id - " + p_Id);
        }

        return zaposlen;
    }

    @Override
    public void save(Zaposlen p_Zaposlen) {
        zaposlenRepository.save(p_Zaposlen);
    }

    @Override
    public void deleteById(int p_Id) {
        zaposlenRepository.deleteById(p_Id);
    }

}






