package com.cms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cms.bean.*;
import com.cms.dao.CMSDAO;

@Controller
public class CMSController {
	@Autowired
	CMSDAO dao;
	@RequestMapping("Banner")
    public ModelAndView loadbanner() {
        ModelAndView mv = new ModelAndView("Banner");
        return mv;
    }

    @RequestMapping("Link")
    public ModelAndView loadlink() {
        ModelAndView mv = new ModelAndView("Link");
        return mv;
    }

    @RequestMapping("Insert")
    public ModelAndView loadinsert() {
        ModelAndView mv = new ModelAndView("Insert");
        return mv;
    }
    
    @RequestMapping("Insertion")
    public ModelAndView doInsert(@ModelAttribute("bean") CoffeeShopManagementSystem c) {
        dao.insert(c);
        ModelAndView mv = new ModelAndView("Success");
        mv.addObject("res", "Insert");
        mv.addObject("bean", c);
        return mv;
    }
    @RequestMapping("Delete")
    public ModelAndView loadDelete() {
    	 List<Integer> list = dao.idList();
         ModelAndView mv = new ModelAndView("Delete");
         mv.addObject("idList", list);
         return mv;
    }
    @RequestMapping("Deletion")
    public ModelAndView doDelete(@ModelAttribute("bean") CoffeeShopManagementSystem c) {
        dao.delete(c);
        ModelAndView mv = new ModelAndView("Success");
        mv.addObject("res","Delete");
        mv.addObject("bean", c);
        return mv;
    }

    @RequestMapping("Update")
    public ModelAndView loadUpdate() {
        List<Integer> list = dao.idList();
        ModelAndView mv = new ModelAndView("Update");
        mv.addObject("idList", list);
        return mv;
    }

    @RequestMapping("Updation")
    public ModelAndView doUpdate(@ModelAttribute("bean") CoffeeShopManagementSystem c) {
        dao.update(c);
        ModelAndView mv = new ModelAndView("Success");
        mv.addObject("res", "Update");
        mv.addObject("bean", c);
        return mv;
    }

    @RequestMapping("Search")
    public ModelAndView loadFindHotel() {
        List<Integer> list = dao.idList();
        ModelAndView mv = new ModelAndView("Search");
        mv.addObject("idList1", list);
        return mv;
    }

    @RequestMapping("Find")
    public ModelAndView doFind(@ModelAttribute("bean") CoffeeShopManagementSystem c) {
    	CoffeeShopManagementSystem bean1 = dao.find(c);
        ModelAndView mv = new ModelAndView("Success");
        mv.addObject("res", "Search");
        mv.addObject("bean", bean1);
        return mv;
    }

    @RequestMapping("SearchAll")
    public ModelAndView doFindAll() {
        List<CoffeeShopManagementSystem> list = dao.findall();
        ModelAndView mv = new ModelAndView("Success");
        mv.addObject("res", "FindAll");
        mv.addObject("beanlist", list);
        return mv;
    }

}

