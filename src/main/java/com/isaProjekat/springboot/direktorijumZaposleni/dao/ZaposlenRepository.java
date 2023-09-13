package com.isaProjekat.springboot.direktorijumZaposleni.dao;

import com.isaProjekat.springboot.direktorijumZaposleni.entity.Zaposlen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ZaposlenRepository extends JpaRepository<Zaposlen, Integer> {

    List<Zaposlen> findAllByOrderByPrezimeAsc();

}
