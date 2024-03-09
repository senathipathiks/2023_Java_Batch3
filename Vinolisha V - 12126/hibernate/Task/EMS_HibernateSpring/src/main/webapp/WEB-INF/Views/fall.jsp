<% ArrayList<Student> list=(ArrayList<Student>)request.getAttribute("list");
		Student stud1=(Student)request.getAttribute("bean");
		for(Student stud:list){
			
				out.println("<form action='doEdit' method='post' modelAttribute='bean'>");
				
				out.print("<tr>");
				out.print("<td><input type=\"text\" name=\"sid\" value=\""+stud.getSid()+"\" readonly ></td>");
				out.print("<td><input type=\"text\" name=\"sname\" value=\""+stud.getSname()+"\" ></td>");
				out.print("<td><input type=\"text\" name=\"scity\" value=\""+stud.getScity()+"\"  ></td>");
				out.print("<td><a class='btn btn-success' value='Edit&Save'>Edit&Save</a><a class='btn btn-danger' value='delete' href='deletenow?bean="+stud.getSid()+" '>Delete</a></td>");
				out.print("</tr></form>");
				}
		
		out.print("<form action=\"doAdd\" method=\"post\" modelAttribute=\"bean\">");
	    out.print("<tr>");
	    out.print("<td><input type=\"text\" name=\"sid\"></td>");
	    out.print("<td><input type=\"text\" name=\"sname\"></td>");
	    out.print("<td><input type=\"text\" name=\"scity\" ></td>");
	    out.print("<td><input type=\"submit\" name=\"button\" value=\"add\"></td>");
	    out.print("</tr></form>");
 
%>

@RequestMapping("FindAll")
	public ModelAndView loadFindAll() {
		return new ModelAndView("FindAll").addObject("list",dao.getStudentsList());
	}
	
	
	@RequestMapping("doEdit")
	public ModelAndView doFindAll(@ModelAttribute("bean") Student stud) {
		dao.updateStudent(stud);
		return new ModelAndView("FindAll").addObject("list",dao.getStudentsList());
		
	}
	
	@RequestMapping("deletenow")
	public ModelAndView doDeleteNow(@RequestParam("bean") Integer id) {
		Student stud=new Student();
		stud.setSid(id);
		dao.deleteStudent(stud);
		return new ModelAndView("FindAll").addObject("list",dao.getStudentsList());
	}
	
	@RequestMapping("doAdd")
	public ModelAndView doAdd(@ModelAttribute("bean") Student stud) {
		dao.insertStudent(stud);
		return new ModelAndView("FindAll").addObject("list",dao.getStudentsList());
	}
has context menu


has context menu
 