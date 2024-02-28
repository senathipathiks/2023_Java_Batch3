package com.crs.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import com.crs.bean.Car;
import com.crs.dao.CarDAO;


public class InsertServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int n = 0;
        CarDAO dao = new CarDAO();
        PrintWriter out = response.getWriter();
        String action = request.getParameter("button");
        System.out.println(action + "  action");
        if (action.equals("Insert")) {

            RequestDispatcher rd = request.getRequestDispatcher("insert.jsp");
            int id = Integer.parseInt(request.getParameter("cid"));
            String brand = request.getParameter("cbrand");
            String model = request.getParameter("cmodel");
            int year = Integer.parseInt(request.getParameter("cyear"));
            Car car = new Car(id, brand, model, year);
            n = dao.insertCar(car);

            if (n == 1) {
                // Set success message as attribute
                request.setAttribute("message", "Record Inserted Successfully");

                // Forward to success JSP page
                RequestDispatcher rd1 = request.getRequestDispatcher("InsertSuccess.jsp");
                rd1.forward(request, response);
            } else {
                // Set failure message as attribute
                request.setAttribute("message", "Record Insertion Failure");

                // Forward to failure JSP page
                RequestDispatcher rd1 = request.getRequestDispatcher("InsertFailure.jsp");
                rd1.forward(request, response);
            }
        } else if (action.equals("Find")) {
            int id = Integer.parseInt(request.getParameter("cid"));

            Car car = new Car();
            car = dao.findCar(id);

            if (car.getId() > 0) {
                request.setAttribute("carId", car.getId());
                request.setAttribute("carBrand", car.getBrand());
                request.setAttribute("carModel", car.getModel());
                request.setAttribute("carYear", car.getYear());

                RequestDispatcher rd = request.getRequestDispatcher("FindCar.jsp");
                rd.forward(request, response);
            } else {
                // If car is not found, forward to NoCar.jsp
                RequestDispatcher rd1 = request.getRequestDispatcher("NoCar.jsp");
                rd1.forward(request, response);
            }
        } else if (action.equals("Find All")) {
            LinkedList<Car> cars = dao.findAllCars();

            if (cars.size() > 0) {
                request.setAttribute("carList", cars);

                RequestDispatcher rd1 = request.getRequestDispatcher("CarList.jsp");
                rd1.forward(request, response);
            }
        } else if (action.equals("update")) {

            int id = Integer.parseInt(request.getParameter("cid"));
            String brand = request.getParameter("cbrand");
            String model = request.getParameter("cmodel");
            int year = Integer.parseInt(request.getParameter("cyear"));
            Car car = new Car(id, brand, model, year);
            n = dao.updateCar(car);

            if (n == 1) {
                RequestDispatcher rd = request.getRequestDispatcher("UpdateSuccess.jsp");
                rd.forward(request, response);
            } else {
                RequestDispatcher rd1 = request.getRequestDispatcher("UpdateFailure.jsp");
                rd1.forward(request, response);
            }
        } else if (action.equals("Delete")) {

            int id = Integer.parseInt(request.getParameter("cid"));
            n = dao.deleteCar(id);

            if (n == 1) {
                RequestDispatcher rd = request.getRequestDispatcher("DeleteSuccess.jsp");
                rd.forward(request, response);
            } else {
                RequestDispatcher rd = request.getRequestDispatcher("DeleteFailure.jsp");
                rd.forward(request, response);
            }
        }

    }
}
