package vy.com.fa.controller;

import java.time.LocalDate;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vy.com.fa.dto.TTPhiChungCuDTO;
import vy.com.fa.entity.TTPhiChungCu;
import vy.com.fa.entity.ToaNha;
import vy.com.fa.service.TTPhiChungCuService;
import vy.com.fa.service.ToaNhaService;
import vy.com.fa.validate.TTPhiChungCuValidate;

@Controller
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private TTPhiChungCuService chungCuServiceImpl;

	@Autowired
	private ToaNhaService toaNhaService;

	@Autowired
	private TTPhiChungCuValidate chungCuValidate;

	@GetMapping("/show")
	public String show(Model model) {
		model.addAttribute("ttDto", new TTPhiChungCuDTO());
		return "/add/new";
	}

	@PostMapping("/save")
	public String addTT(@ModelAttribute(name = "ttDto") @Valid TTPhiChungCuDTO ttPhiChungCuDTO, BindingResult result,
			Model model) {

		chungCuValidate.validate(ttPhiChungCuDTO, result);

		if (result.hasErrors()) {
			return "/add/new";
		}
		ttPhiChungCuDTO.setTongtien(tongTien(ttPhiChungCuDTO.getDientich(), ttPhiChungCuDTO.getSothang(),
				ttPhiChungCuDTO.getNgaydong(), ttPhiChungCuDTO.getThangbd()));
		ToaNha nha = toaNhaService.getNhaById(ttPhiChungCuDTO.getMatoanha());
		TTPhiChungCu ttPhiChungCu = new TTPhiChungCu(ttPhiChungCuDTO.getMatt(), ttPhiChungCuDTO.getMacanho(),
				ttPhiChungCuDTO.getDientich(), nha, ttPhiChungCuDTO.getTenchuho(), ttPhiChungCuDTO.getSodienthoai(),
				ttPhiChungCuDTO.getThangbd(), ttPhiChungCuDTO.getSothang(), ttPhiChungCuDTO.getNgaydong(),
				ttPhiChungCuDTO.getTongtien());
		chungCuServiceImpl.save(ttPhiChungCu);
		return "redirect:/home/list";
	}

	public double tongTien(int dientich, int sothang, LocalDate thangdong, LocalDate thangbatdau) {
		double tong = 0;
		tong = dientich * 11000 * sothang;
		if (sothang > 3) {
			tong = dientich * 11000 * 3 + dientich * 11000 * 8 - dientich * 11000 * 8 * 0.1;
		} else if (thangdong.getMonthValue() > thangbatdau.getMonthValue()) {
			int d = thangdong.getMonthValue() - thangbatdau.getMonthValue();

			tong = tong + d * 100000;
		}

		return tong;
	}

	@GetMapping("/list")
	public String showList(Model model) {
		model.addAttribute("listTT", chungCuServiceImpl.findAll());
		return "/add/list";
	}

	@GetMapping("/edit/ma={ma}")
	public String edit(@ModelAttribute(name = "ma") String ma, Model model) {
		TTPhiChungCu ttPhiChungCu = chungCuServiceImpl.getById(ma);
		TTPhiChungCuDTO chungCuDTO = new TTPhiChungCuDTO(ttPhiChungCu.getMatt(), ttPhiChungCu.getMacanho(),
				ttPhiChungCu.getDientich(), ttPhiChungCu.getMatoanha().getMatoanha(), ttPhiChungCu.getTenchuho(),
				ttPhiChungCu.getSodienthoai(), ttPhiChungCu.getThangbd(), ttPhiChungCu.getSothang(),
				ttPhiChungCu.getNgaydong(), ttPhiChungCu.getTongtien());
		model.addAttribute("tt", chungCuDTO);
		return "/add/edit";
	}

	@PostMapping("/edit")
	public String showedit(@ModelAttribute(name = "tt") @Valid TTPhiChungCuDTO ttPhiChungCuDTO, BindingResult result) {
		
		chungCuValidate.validate(ttPhiChungCuDTO, result);
		
		if (result.hasErrors()) {
			return "redirect:/home/edit/ma=" + ttPhiChungCuDTO.getMatt();
		}

		ttPhiChungCuDTO.setTongtien(tongTien(ttPhiChungCuDTO.getDientich(), ttPhiChungCuDTO.getSothang(),
				ttPhiChungCuDTO.getNgaydong(), ttPhiChungCuDTO.getThangbd()));

		ToaNha nha = toaNhaService.getNhaById(ttPhiChungCuDTO.getMatoanha());

		TTPhiChungCu ttPhiChungCu = new TTPhiChungCu(ttPhiChungCuDTO.getMatt(), ttPhiChungCuDTO.getMacanho(),
				ttPhiChungCuDTO.getDientich(), nha, ttPhiChungCuDTO.getTenchuho(), ttPhiChungCuDTO.getSodienthoai(),
				ttPhiChungCuDTO.getThangbd(), ttPhiChungCuDTO.getSothang(), ttPhiChungCuDTO.getNgaydong(),
				ttPhiChungCuDTO.getTongtien());
		chungCuServiceImpl.save(ttPhiChungCu);
		return "redirect:/home/list";
	}

}
