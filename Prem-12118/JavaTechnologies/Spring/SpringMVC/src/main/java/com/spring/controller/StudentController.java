package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.spring.DAO.StudentDAO;
import com.spring.bean.Student;

@Controller
public class StudentController {

    @Autowired
    StudentDAO dao;

    @RequestMapping("banner")
    public ModelAndView loadBanner() {
        ModelAndView mv = new ModelAndView("banner");
        return mv;
    }

    @RequestMapping("links")
    public ModelAndView loadLinks() {
        ModelAndView mv = new ModelAndView("links");
        return mv;
    }

    @RequestMapping("insert")
    public ModelAndView loadInsertStudent() {
        ModelAndView mv = new ModelAndView("insert");
        return mv;
    }

    @RequestMapping("delete")
    public ModelAndView loadDeleteStudent() {
        ModelAndView mv = new ModelAndView("delete");
        return mv;
    }

    @RequestMapping("update")
    public ModelAndView loadUpdateStudent() {
        ModelAndView mv = new ModelAndView("update");
        return mv;
    }

    @RequestMapping("find")
    public ModelAndView loadFindStudent() {
        ModelAndView mv = new ModelAndView("find");
        return mv;
    }
    @RequestMapping("FindAll")
    public ModelAndView loadFindAllStudent() {
        ModelAndView mv = new ModelAndView("FindAll");
        return mv;
    }

   
    @RequestMapping("Insertion")
    public ModelAndView doInsert(@ModelAttribute("bean") Student bean) {
        int n = dao.insertStudent(bean);
        if (n > 0) {
            ModelAndView mv = new ModelAndView("InsertSuccess");
            mv.addObject("bean", bean);
            return mv;
        } else {
            ModelAndView mv = new ModelAndView("InsertFailure");
            return mv;
        }
    }

    @RequestMapping("Deletion")
    public ModelAndView doDelete(@RequestParam("sid") int studentId) {
        int n = dao.deleteStudent(studentId);
        if (n > 0) {
            ModelAndView mv = new ModelAndView("DeleteSuccess");
            return mv;
        } else {
            ModelAndView mv = new ModelAndView("DeleteFailure");
            return mv;
        }
    }

    @RequestMapping("Updation")
    public ModelAndView doUpdate(@ModelAttribute("bean") Student bean) {
        int n = dao.updateStudent(bean);
        if (n > 0) {
            ModelAndView mv = new ModelAndView("UpdateSuccess");
            mv.addObject("bean", bean);
            return mv;
        } else {
            ModelAndView mv = new ModelAndView("UpdateFailure");
            return mv;
        }
    }

    @RequestMapping("Find")
    public ModelAndView doFind(@RequestParam("sid")int studentId) {
        Student student = dao.getStudentById(studentId);
        if (student != null) {
            ModelAndView mv = new ModelAndView("FindSuccess");
            mv.addObject("bean", student);
            return mv;
        } else {
            ModelAndView mv = new ModelAndView("FindFailure");
            return mv;
        }
    }
    @RequestMapping("findAll")
    public ModelAndView loadFindAllStudents() {
        List<Student> studentList = dao.getAllStudents();
        ModelAndView mv = new ModelAndView("FindAllSuccess");
        mv.addObject("students", studentList);
        return mv;
    }

}
