package com.mvc.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.mvc.bean.Ticket;
import com.mvc.dao.Dao;

@Controller
public class TmsController {

	@Autowired
	Dao dao;
	
	
	@RequestMapping("Links")
	public ModelAndView loadLinks() {
		ModelAndView mv=new ModelAndView("Links");
		return mv;
	}
	
	@RequestMapping("Insert")
	public ModelAndView loadInsert() {
		ModelAndView mv=new ModelAndView("InsertTicket");
		return mv;
	}
	
	
	
	@RequestMapping("Insertion")
	public ModelAndView doInsert(@ModelAttribute("bean")Ticket tic) {
		
		int n=dao.insertTicket(tic);
		if(n==1)
		return new  ModelAndView("InsertTicket").addObject("msg","Ticket Inserted");
		else
			return new  ModelAndView("InsertTicket").addObject("msg","failure");
			
	}
	
	@RequestMapping("Delete")
	public ModelAndView loaddel() {		
	List<Integer> list=dao.getIdList();
	ModelAndView mv=new ModelAndView("DeleteTicket");
	mv.addObject("List",list);
	return mv;
	}

	
	@RequestMapping("Deletion")
	public ModelAndView doDelete(@ModelAttribute("bean")Ticket tic) {
		
		int n=dao.deleteTicket(tic);
		if(n==1)
			return new  ModelAndView("DeleteTicket").addObject("Action","Success");
			else
				return new  ModelAndView("DeleteTicket").addObject("Action","Success");
				
		
	}
	
	
	@RequestMapping("Update")
	public ModelAndView loadUpdate() {
		List<Integer> idList =  dao.getIdList();
		ModelAndView mv = new ModelAndView("UpdateTicket");		
		mv.addObject("IdList",idList);
		return mv;
	}
	
	
	@PostMapping("Fetch")
	public ModelAndView loadFetch(@ModelAttribute("bean")Ticket lib){
		
		int id = lib.getTicketID();
		Ticket l = dao.fetchMethod(id);
		ModelAndView mv = new ModelAndView("UpdateTicket");
		mv.addObject("library",l);
		
		return mv;
		
	}
	
	
	@PostMapping("Updation")
	public ModelAndView doUpdate(@ModelAttribute("bean")Ticket tic) {
		
		int n=dao.updateTicket(tic);
		if(n==1)
		return new  ModelAndView("UpdateTicket").addObject("Action","Ticket Updated");
		else
			return new  ModelAndView("UpdateTicket").addObject("Action","Updation Failed");
			
		
	}
	
	
	@RequestMapping("find")
	public ModelAndView loadFind() {		
		List<Integer> list=dao.getIdList();
		ModelAndView mv=new ModelAndView("FindTicket");
		mv.addObject("List",list);
		return mv;
	
	}
	
	@RequestMapping("Findd")
 public ModelAndView doFind(@ModelAttribute("bean") Ticket tic) {
		
		Ticket bean1=dao.findTicket(tic);
		ModelAndView mv=new ModelAndView("FindTicket");
		mv.addObject("print",bean1);
		return mv;	
	}
	
	@RequestMapping("findAll")
	 public ModelAndView doFindAll(@ModelAttribute("bean") Ticket bean) {
	
		List<Ticket> ll=dao.findAll();
		ModelAndView mv=new ModelAndView("FindAllTicket");
		mv.addObject("list",ll);
		return mv;
		
	}
	
	@RequestMapping("action")
	public ModelAndView doAction(@RequestParam("ticketID") Integer id) {
		
		List<Ticket> ll=dao.findAll();
		Ticket tic=new Ticket();
		tic.setTicketID(id);
		Ticket bean1=dao.findTicket(tic);
		ModelAndView mv=new ModelAndView("FindAllTicket");
		mv.addObject("list",ll);
		mv.addObject("bean",bean1);
		return mv;			
		
	}
	
	@RequestMapping("doedit")
	public ModelAndView doFindall(@ModelAttribute("bean1") Ticket tic) {
		dao.updateTicket(tic);
		List<Ticket> ll=dao.findAll();			
		ModelAndView mv=new ModelAndView("FindAllTicket");
		mv.addObject("list",ll);			
		return mv;
	}
	

	@RequestMapping("back")
	public ModelAndView goBack() {
		List<Ticket> ll=dao.findAll();		
		ModelAndView mv=new ModelAndView("FindAllTicket");
		mv.addObject("list",ll);
		 return mv;
	}
	
	@RequestMapping("deletenow")
	public ModelAndView dodeletenow(@RequestParam("bookId") Integer id) {
		Ticket lib=new Ticket();
		lib.setTicketID(id);
		dao.deleteTicket(lib);
		List<Ticket> ll=dao.findAll();		
		ModelAndView mv=new ModelAndView("FindAllTicket");
		mv.addObject("list",ll);
		return mv;
	}
	
		
	
	@RequestMapping("doadd")
	public ModelAndView doAdd(@ModelAttribute("bean1")Ticket tic) {
		dao.insertTicket(tic);
		
		return new ModelAndView("FindAllTicket").addObject("list",dao.findAll());
	}

	
	
	
	
	
	
	
}
