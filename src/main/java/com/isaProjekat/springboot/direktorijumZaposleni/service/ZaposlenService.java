package com.isaProjekat.springboot.direktorijumZaposleni.service;

import com.isaProjekat.springboot.direktorijumZaposleni.entity.Zaposlen;

import java.util.List;

public interface ZaposlenService {

    List<Zaposlen> findAll();

    Zaposlen findById(int p_Id);

    void save(Zaposlen p_Zaposlen);

    void deleteById(int p_Id);

}
