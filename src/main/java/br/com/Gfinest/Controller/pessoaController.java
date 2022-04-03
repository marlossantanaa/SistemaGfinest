package br.com.Gfinest.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.source.IterableConfigurationPropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.Gfinest.model.pessoa;
import br.com.Gfinest.repository.pessoaRepository;

@Controller

public class pessoaController {
	@Autowired
	private pessoaRepository PessoaRepository;

	@RequestMapping(method = RequestMethod.GET, value = "/cadastropessoa")
	public ModelAndView inicio() {
		ModelAndView modelAndView = new ModelAndView("cadastro/cadastropessoa");
		modelAndView.addObject("pessoaobj", new pessoa());
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/salvarpessoa")
	public ModelAndView salvar(pessoa Pessoa) {
		PessoaRepository.save(Pessoa);

		ModelAndView andView = new ModelAndView("cadastro/cadastropessoa");
		Iterable<pessoa> pessoaIt = PessoaRepository.findAll();
		andView.addObject("pessoas", pessoaIt);
		andView.addObject("pessoaobj", new pessoa());

		return andView;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/listapessoas")
	public ModelAndView pessoas() {
		ModelAndView andView = new ModelAndView("cadastro/cadastropessoa");
		Iterable<pessoa> pessoaIt = PessoaRepository.findAll();
		andView.addObject("pessoas", pessoaIt);
		return andView;
	}

	@GetMapping("/editarpessoa/{idpessoa}")
	public ModelAndView editar(@PathVariable("idpessoa") Long idpessoa) {
		
		Optional<pessoa> pessoa = PessoaRepository.findById(idpessoa);

		ModelAndView modelAndView = new ModelAndView("cadastro/cadastropessoa");
		modelAndView.addObject("pessoaobj", pessoa.get());
		return modelAndView;
		
	}

}
