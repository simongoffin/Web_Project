package com.sdzee.servlets;

import com.sdzee.beans.Coyote;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;

public class Test extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		
		/* Création et initialisation du message. */
		String paramAuteur = request.getParameter( "auteur" );
		String message = "Transmission de variables : OK ! " + paramAuteur;
			
		/* Création du bean et initialisation de ses propriétés */
		Coyote premierBean = new Coyote();
		premierBean.setNom( "Coyote" );
		premierBean.setPrenom( "Wile E." );
			
		/* Création de la liste et insertion de quatre éléments */
		List<Integer> premiereListe = new ArrayList<Integer>();
		premiereListe.add( 27 );
		premiereListe.add( 12 );
		premiereListe.add( 138 );
		premiereListe.add( 6 );
			
		/* Stockage du message, du bean et de la liste dans l'objet request */
		request.setAttribute( "test", message );
		request.setAttribute( "coyote", premierBean );
		request.setAttribute( "liste", premiereListe );
			
		/* Transmission de la paire d'objets request/response à notre JSP */
		this.getServletContext().getRequestDispatcher( "/WEB-INF/vue.jsp" ).forward( request, response );
	}

}
