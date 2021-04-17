package com.techlab.test;

import com.techlab.model.IEmotionable;
import com.techlab.model.ISocialization;
import com.techlab.model.Infant;
import com.techlab.model.Man;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IEmotionable eman,einfant;
		ISocialization sman;
		eman = new Man();
		emotions(eman);
		sman = new Man();
		socialization(sman);
		einfant = new Infant();
		emotions(einfant);
	}

	private static void socialization(ISocialization s) {
		// TODO Auto-generated method stub
		s.depart();
		s.wish();
	}

	private static void emotions(IEmotionable e) {
		// TODO Auto-generated method stub
		e.cry();
		e.laugh();
	}

}
