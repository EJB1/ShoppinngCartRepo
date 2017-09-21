package com.jobfer.jee;

import javax.ejb.Stateless;

//Creamos este EJB para que no salga el error: "A valid ejb jar requires at least one session,
//entity (1.x/2.x style), or message-driven bean. "
@Stateless  
public class CompraApp {

	String a = Constantes.nombre_app;

}
