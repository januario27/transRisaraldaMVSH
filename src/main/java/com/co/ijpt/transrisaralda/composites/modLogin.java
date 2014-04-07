package com.co.ijpt.transrisaralda.composites;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;

public class modLogin extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,7","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@AutoGenerated
	private AbsoluteLayout mainLayout;
	@AutoGenerated
	private Embedded embtransrisaralda;
	@AutoGenerated
	private AbsoluteLayout lytformlogin;
	@AutoGenerated
	private Button cmdlogin;
	@AutoGenerated
	private HorizontalLayout lytfieldslogin;
	@AutoGenerated
	private PasswordField txtpassword;
	@AutoGenerated
	private TextField txtuser;
	/**
	 * 
	 */
	private static final long serialVersionUID = 7584878441419256664L;
	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public modLogin( MainView mv) {
		buildMainLayout();
		setCompositionRoot(mainLayout);
				
		InitComponents(mv); 
        
	}

	private void InitComponents(final MainView mv) {
		
		cmdlogin.addClickListener(new Button.ClickListener() {		
			public void buttonClick(ClickEvent event) {
			   
				String user = txtuser.getValue();
				String pass = txtpassword.getValue();
				
		 	    [si][registro exitoso]
				
				
				
				mv.successLogin();			   									
			}
		});
		
	}

	@AutoGenerated
	private AbsoluteLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new AbsoluteLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("1024px");
		mainLayout.setHeight("100%");
		
		// top-level component properties
		setWidth("1024px");
		setHeight("100.0%");
		
		// lytformlogin
		lytformlogin = buildLytformlogin();
		mainLayout.addComponent(lytformlogin, "top:385.0px;left:256.0px;");
		
		// embtransrisaralda
		embtransrisaralda = new Embedded();
		embtransrisaralda.setImmediate(false);
		embtransrisaralda.setWidth("336px");
		embtransrisaralda.setHeight("252px");
		embtransrisaralda
				.setSource(new ThemeResource("img/transRisaralda.swf"));
		embtransrisaralda.setMimeType("application/x-shockwave-flash");
		mainLayout.addComponent(embtransrisaralda, "top:147.0px;left:336.0px;");
		
		return mainLayout;
	}

	@AutoGenerated
	private AbsoluteLayout buildLytformlogin() {
		// common part: create layout
		lytformlogin = new AbsoluteLayout();
		lytformlogin.setImmediate(false);
		lytformlogin.setWidth("500px");
		lytformlogin.setHeight("84px");
		
		// lytfieldslogin
		lytfieldslogin = buildLytfieldslogin();
		lytformlogin.addComponent(lytfieldslogin, "top:30.0px;left:20.0px;");
		
		// cmdlogin
		cmdlogin = new Button();
		cmdlogin.setCaption("Login");
		cmdlogin.setImmediate(true);
		cmdlogin.setWidth("-1px");
		cmdlogin.setHeight("-1px");
		lytformlogin.addComponent(cmdlogin, "top:45.0px;left:420.0px;");
		
		return lytformlogin;
	}

	@AutoGenerated
	private HorizontalLayout buildLytfieldslogin() {
		// common part: create layout
		lytfieldslogin = new HorizontalLayout();
		lytfieldslogin.setImmediate(false);
		lytfieldslogin.setWidth("400px");
		lytfieldslogin.setHeight("40px");
		lytfieldslogin.setMargin(false);
		
		// txtuser
		txtuser = new TextField();
		txtuser.setIcon(new ThemeResource("../runo/icons/16/user.png"));
		txtuser.setImmediate(false);
		txtuser.setWidth("100.0%");
		txtuser.setHeight("-1px");
		txtuser.setInputPrompt("USUARIO DEL SISTEMA");
		txtuser.setMaxLength(30);
		lytfieldslogin.addComponent(txtuser);
		
		// txtpassword
		txtpassword = new PasswordField();
		txtpassword.setImmediate(false);
		txtpassword.setWidth("100.0%");
		txtpassword.setHeight("-1px");
		txtpassword.setInputPrompt("CONTRASEÑA");
		txtpassword.setMaxLength(10);
		lytfieldslogin.addComponent(txtpassword);
		lytfieldslogin.setComponentAlignment(txtpassword, new Alignment(10));
		
		return lytfieldslogin;
	}

}
