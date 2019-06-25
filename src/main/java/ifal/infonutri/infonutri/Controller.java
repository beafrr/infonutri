package ifal.infonutri.infonutri;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@org.springframework.stereotype.Controller
public class Controller {
        private Repository infoRepository;

        public Controller(Repository infoRepository){
                this.infoRepository = infoRepository;

        }

        @GetMapping("/novo")
        public String mostrarForm (Model model){
            InformacaoNutricional infoNutri = new InformacaoNutricional();

            model.addAttribute(infoNutri);
            return "formulario";
        }

        @GetMapping("/")
        public String listarInfo(Model model){
            Iterable<InformacaoNutricional> infonutris= infoRepository.findAll();
            model.addAttribute("infonutris", infonutris);
            return "index";
        }
        @PostMapping("/cadastrar")
        public String cadastrarInfo(@ModelAttribute InformacaoNutricional informacaoNutricional){
            infoRepository.save(informacaoNutricional);
            return "index";
        }

        @GetMapping("/excluir")
        public String excluir (Integer id){
            infoRepository.deleteById(id);
            return "redirect:/";
        }

        @GetMapping("/editar")
        public String editar(Integer id, Model model){
            Optional<InformacaoNutricional> informacaoNutricional = infoRepository.findById(id);
            model.addAttribute("informacaoNutricional", informacaoNutricional);

            return "editarInformacao";
        }


}
