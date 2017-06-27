package com.test.hw;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by huangwei on 2017/6/27.
 */
public class CheckServlet extends HttpServlet{

    public void doPost(HttpServletRequest request, HttpServletResponse response){

        doGet(request,response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response){
        String checkNode = request.getParameter("validateCode");
        String severCheckNode = (String) request.getSession().getAttribute("checkNode");
        if (checkNode.equals(severCheckNode)) {
            System.err.println("验证通过");
        }else {
            System.err.println("验证不通过");
        }
    }




}
