package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.DAO.HotelDAO;
import com.spring.bean.Hotel;

@Controller
public class HotelController {
	
	
	
	@Autowired
	HotelDAO dao ;
	
	@RequestMapping("Banner")
	public ModelAndView loadbanner() {
		ModelAndView mv = new ModelAndView("Banner");
		return mv;
		
	}
	
	@RequestMapping("Mainpage")
	public ModelAndView loadlinks() {
		ModelAndView mv = new ModelAndView("Mainpage");
		return mv;
		
	}
	
	@RequestMapping("Insert")
	public ModelAndView loadInsertHotel() {
		ModelAndView mv = new ModelAndView("Insert");
		return mv;
	}
	
	@RequestMapping("Insertion")
	public  ModelAndView doInsert(@ModelAttribute("bean") Hotel bean) {
		
		dao.insertHotel(bean);
		ModelAndView mv = new ModelAndView("Insuccess");
		mv.addObject("bean",bean);
		return mv;
	}
	
	@RequestMapping("Delete")
	public ModelAndView loadDeleteHotel() {
		List<Integer> list = dao.idList();
		ModelAndView mv = new ModelAndView("delete");
		mv.addObject("idlist",list);
		return mv;
	}
	
	@RequestMapping("Deletion")
	public ModelAndView doDelete(@ModelAttribute("bean")Hotel bean) {
		
		dao.deleteHotel(bean);
		ModelAndView mv = new ModelAndView("delsuccess");
		mv.addObject("bean",bean);
		return mv;
	}
	
	@RequestMapping("Update")
	public ModelAndView loadUpdateHotel() {
		List<Integer> list = dao.idList();
		ModelAndView mv = new ModelAndView("Update");
		mv.addObject("idlist",list);
		return mv;
		
	}
	
	@RequestMapping("Updation")
	public ModelAndView doUpdate(@ModelAttribute("bean")Hotel bean) {
		
		dao.updateHotel(bean);
		ModelAndView mv = new ModelAndView("Upsuccess");
		return mv;
		
		
	}
	
	@RequestMapping("Find")
	public ModelAndView loadFindHotel() {
		
		List<Integer> list = dao.idList();
		ModelAndView mv = new ModelAndView("Find");
		mv.addObject("idlist",list);
		return mv;
	}
	
	@RequestMapping("Findation")
	public ModelAndView doFind(@ModelAttribute("bean")Hotel bean) {
		
		Hotel htl = dao.findHotel(bean);
		ModelAndView mv = new ModelAndView("Find");
		mv.addObject("rmid",htl.getRmid());
		mv.addObject("rmtype",htl.getRmtype());
		mv.addObject("rmtariff",htl.getRmtariff());
		mv.addObject("rmdesc",htl.getRmdesc());
		mv.addObject("rmoccup",htl.getRmoccup());
		return mv;
		
	}
	
	@RequestMapping("FindAll")
	public ModelAndView loadFindAll() {
		
		List<Hotel> list = dao.findAllHotel();
		ModelAndView mv = new ModelAndView("FindAll");
		mv.addObject("all",list);
		return mv;
	}

	
	

}
