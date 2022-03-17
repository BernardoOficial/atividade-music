package br.com.fiap.appmusic.music.controllers;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.appmusic.music.model.Music;

@Controller
public class HomeController {

	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView modelView = new ModelAndView("index");
		
		Music music1 = new Music("RIO", "Brasil", "Netshy (Alok & KVSH Remix)", "Eletrônica", "música feita para o Brasil", "20/01/2017", 200);
		Music music2 = new Music("Show Me The Way", "EUA", "Vintage Culture", "Eletrônica", "canção", "20/07/2019", 256);
		Music music3 = new Music("Broken", "EUA", "Jacob Tillberg", "Eletrônica", "free music", "20/05/2022", 324);
		
		List<Music> musics = Arrays.asList(music1, music2, music3);
		modelView.addObject("musics", musics);
		
		return modelView;
	}
}



