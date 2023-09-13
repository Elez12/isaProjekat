package com.isaProjekat.springboot.direktorijumZaposleni.controller;

import com.isaProjekat.springboot.direktorijumZaposleni.entity.Zaposlen;
import com.isaProjekat.springboot.direktorijumZaposleni.service.ZaposlenService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/zaposleni")
public class ZaposlenController {

    private final ZaposlenService zaposlenService;

    public ZaposlenController(ZaposlenService p_ZaposlenService) {
        zaposlenService = p_ZaposlenService;
    }

    @GetMapping("/lista")
    public String listaZaposleni(Model p_Model) {

        List<Zaposlen> zaposleni = zaposlenService.findAll();

        p_Model.addAttribute("zaposleni", zaposleni);

        return "zaposleni/lista-zaposleni";
    }

    @GetMapping("/formaDodavanje")
    public String formaDodavanje(Model p_Model) {

        Zaposlen zaposlen = new Zaposlen();

        p_Model.addAttribute("zaposlen", zaposlen);

        return "zaposleni/zaposlen-forma";
    }

    @PostMapping("/formaUpdate")
    public String formaUpdate(@RequestParam("zaposlenId") int p_Id,
                              Model p_Model) {

        Zaposlen zaposlen = zaposlenService.findById(p_Id);

        p_Model.addAttribute("zaposlen", zaposlen);

        return "zaposleni/zaposlen-forma";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("zaposlen") Zaposlen p_Zaposlen) {

        zaposlenService.save(p_Zaposlen);

        return "redirect:/zaposleni/lista";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam("zaposlenId") int p_Id) {

        zaposlenService.deleteById(p_Id);

        return "redirect:/zaposleni/lista";

    }
}









