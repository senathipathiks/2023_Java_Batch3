package com.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hotel.bean.Hotel;
import com.hotel.dao.HotelDAO;

@Controller
public class HotelController {

    @Autowired
    HotelDAO dao;

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
    public ModelAndView doInsert(@ModelAttribute("bean") Hotel h) {
        dao.insertHotel(h);
        ModelAndView mv = new ModelAndView("Success");
        mv.addObject("res", "Insert");
        mv.addObject("bean", h);
        return mv;
    }

    @RequestMapping("Delete")
    public ModelAndView loadDeleteStudent() {
        List<Integer> list = dao.idList();
        ModelAndView mv = new ModelAndView("Delete");
        mv.addObject("idList", list);
        return mv;
    }

    @RequestMapping("Deletion")
    public ModelAndView doDelete(@ModelAttribute("bean") Hotel h) {
        dao.deleteHotel(h);
        ModelAndView mv = new ModelAndView("Success");
        mv.addObject("res", "Delete");
        mv.addObject("bean", h);
        return mv;
    }

    @RequestMapping("Update")
    public ModelAndView loadUpdateStudent() {
        List<Integer> list = dao.idList();
        ModelAndView mv = new ModelAndView("Update");
        mv.addObject("idList", list);
        return mv;
    }

    @RequestMapping("Updation")
    public ModelAndView doUpdate(@ModelAttribute("bean") Hotel h) {
        dao.updateHotel(h);
        ModelAndView mv = new ModelAndView("Success");
        mv.addObject("res", "Update");
        mv.addObject("bean", h);
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
    public ModelAndView doFind(@ModelAttribute("bean") Hotel h) {
        Hotel bean1 = dao.findHotel(h);
        ModelAndView mv = new ModelAndView("Success");
        mv.addObject("res", "Find");
        mv.addObject("bean", bean1);
        return mv;
    }

    @RequestMapping("SearchAll")
    public ModelAndView doFindAll() {
        List<Hotel> list = dao.findallHotel();
        ModelAndView mv = new ModelAndView("Success");
        mv.addObject("res", "FindAll");
        mv.addObject("beanlist", list);
        return mv;
    }

}