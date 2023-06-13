package mvc01;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.Adao;
import dto.Adto;

@Controller
public class Load {


	@RequestMapping("/insert")
	public ModelAndView insertMvc(@ModelAttribute Adto dto, Adao adao) {
//		System.out.println(dto.getId());
//		System.out.println(dto.getName());
//		System.out.println(dto.getMail());
//		System.out.println(dto.getPwd());
//		System.out.println(dto.getGender());
//		System.out.println(dto.getTerms());
//		System.out.println(dto.getCountry());

		Adao dao = new Adao();
		String msg = adao.insert(dto);
//		
		ModelAndView andView = new ModelAndView("home.jsp");
		andView.addObject("msg", msg);
		return andView;
	}
	
	@RequestMapping("/fetchall")
	public ModelAndView fetchall(Adao ado) {
		List<Adto> li = ado.fetchall();
		ModelAndView andView = new ModelAndView("fetchall.jsp");
		andView.addObject("list", li);
		return andView;
	}
	
	@RequestMapping("/delete")
	public ModelAndView delete(@ModelAttribute Adto dto,Adao dao) {
		
		String msg = dao.delete(dto.getId());
		ModelAndView andView = new ModelAndView("home.jsp");
		andView.addObject("msg", msg);
		return andView;
	}

	
	
	
}
