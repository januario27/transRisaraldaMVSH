package com.co.ijpt.transrisaralda;

import javax.servlet.annotation.WebServlet;

import com.co.ijpt.transrisaralda.composites.MainView;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
@Theme("transrisaralda")
@Title("TransRisaralda S.A")
public class TransrisaraldaUI extends UI {

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = TransrisaraldaUI.class)
	public static class Servlet extends VaadinServlet {
	}

	@Override
	protected void init(VaadinRequest request) {
		//request.getAuthType();
		//request.getContentType();
		//request.getContextPath();
		//request.setAttribute("miatributo", "elvalordelatributo");
		
		System.out.println("Miremos que trae el REQUEST: "+request.getContextPath());
		this.setSizeFull();
		VerticalLayout maincontainer = new VerticalLayout();
		maincontainer.setSizeFull();
		setContent(maincontainer);
		
		MainView mv = new MainView(request);
        
        maincontainer.addComponent(mv);
        maincontainer.setComponentAlignment(mv, Alignment.MIDDLE_CENTER);	
	}

}