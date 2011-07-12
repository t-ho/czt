package net.sourceforge.czt.zeves.response;

import net.sourceforge.czt.z.util.ZString;

public class ZEvesXmlEntities {

	static final String XML_HEADER = 
			"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
			+ getDoctypeHeader();
	
	private static String getDoctypeHeader() {
		
		StringBuilder header = new StringBuilder();
		header.append("<!DOCTYPE zoutput [\n");
		
		// copied from CZT2ZEvesPrinter#translateOperatorWord
		header.append(getEntityDef(ZString.NEQ, "neq"));        
        header.append(getEntityDef(ZString.NOTMEM, "notin"));
//        header.append(getEntityDef(ZString.EMPTYSET, "empty"));        
        header.append(getEntityDef(ZString.SUBSETEQ, "subeq"));        
        header.append(getEntityDef(ZString.SUBSET, "sub"));        
        header.append(getEntityDef(ZString.CUP, "cup"));        
        header.append(getEntityDef(ZString.CAP, "cap"));        
        header.append(getEntityDef(ZString.BIGCUP, "bigcup"));        
        header.append(getEntityDef(ZString.BIGCAP, "bigcap")); 
//        header.append(getEntityDef(ZString.SETMINUS, "\\";
        // Relations
        header.append(getEntityDef(ZString.REL, "lrarr"));        
        header.append(getEntityDef(ZString.MAPSTO, "rtarr"));        
        header.append(getEntityDef(ZString.CIRC, "circ"));        
        header.append(getEntityDef(ZString.DRES, "vltri"));
        header.append(getEntityDef(ZString.NDRES, "vltrib"));
        header.append(getEntityDef(ZString.RRES, "vrtri"));
        header.append(getEntityDef(ZString.NRRES, "vrtrib"));      
        header.append(getEntityDef(ZString.TILDE, "suptilde"));      
        header.append(getEntityDef(ZString.LIMG, "lvparen"));      
        header.append(getEntityDef(ZString.RIMG, "rvparen"));      
        header.append(getEntityDef(ZString.OPLUS, "oplus"));        
        header.append(getEntityDef(ZString.PLUS, "supplus"));                
        header.append(getEntityDef(ZString.MULT, "supstar"));        
        // Functions
        header.append(getEntityDef(ZString.PFUN, "rarrb"));
        header.append(getEntityDef(ZString.FUN, "rarr"));
        header.append(getEntityDef(ZString.PINJ, "raarbtl"));
        header.append(getEntityDef(ZString.INJ, "rarrtl"));
        header.append(getEntityDef(ZString.PSURJ, "Rarrb"));
        header.append(getEntityDef(ZString.SURJ, "Rarr"));
        header.append(getEntityDef(ZString.BIJ, "Rarrtl"));
        // Natural Numbers        
        header.append(getEntityDef(ZString.LESS, "lt"));
        header.append(getEntityDef(ZString.LEQ, "leq"));
        header.append(getEntityDef(ZString.GREATER, "gt"));
        header.append(getEntityDef(ZString.GEQ, "geq"));
        header.append(getEntityDef(ZString.FFUN, "rarrB"));
        header.append(getEntityDef(ZString.FINJ, "rarrBtl"));
        // Sequences
        header.append(getEntityDef(ZString.CAT, "frown"));
        header.append(getEntityDef(ZString.EXTRACT, "uharl"));
        // Bags
//        header.append(getEntityDef(ZString.???, "sharp"));//Bag count
//        header.append(getEntityDef(ZString.???, "otimes"));//Bag scaling
//        header.append(getEntityDef(ZString.???, "sqisin"));//Bag membership
//        header.append(getEntityDef(ZString.???, "sqsubeq"));//sub-bag
//        header.append(getEntityDef(ZString.???, "uplus"));//bag union
//        header.append(getEntityDef(ZString.???, "uminus"));//bag difference
		
		// copied from CZT2ZEvesPrinter#translateWord
        header.append(getEntityDef(ZString.DELTA, "Delta"));
        header.append(getEntityDef(ZString.XI, "Xi"));
        header.append(getEntityDef(ZString.THETA, "theta"));
        header.append(getEntityDef(ZString.NAT, "Nopf"));
        header.append(getEntityDef(ZString.NUM, "Zopf"));
        header.append(getEntityDef(ZString.ARITHMOS, "Aopf"));
        header.append(getEntityDef(ZString.FINSET, "Fopf"));
        header.append(getEntityDef(ZString.POWER, "Popf"));
        header.append(getEntityDef(ZString.EMPTYSET, "empty"));
		
		// adapted from CZT2ZEvesPrinter#getSchExprOpName
        header.append(getEntityDef(ZString.COMP, "fatsemi"));
//        header.append(getEntityDef(ZString.???, "gtgt")); // piping
//        header.append(getEntityDef(ZString.???, "uharr")); // projection
        header.append(getEntityDef(ZString.AND, "wedge"));
        header.append(getEntityDef(ZString.OR, "vee"));
        header.append(getEntityDef(ZString.IMP, "rArr"));
        header.append(getEntityDef(ZString.IFF, "hArr"));
        
        // adapted from CZT2ZEvesPrinter#getQntName
        header.append(getEntityDef(ZString.EXI, "exists"));
//        header.append(getEntityDef(ZString.EXIONE, "&exists;&sub1;")); // two entities, will parse separately
        header.append(getEntityDef(ZString.ALL, "forall"));
        
        
        header.append(getEntityDef(ZString.MEM, "isin"));
        header.append(getEntityDef(ZString.MU, "mu"));
        header.append(getEntityDef(ZString.LAMBDA, "lambda"));
        header.append(getEntityDef(ZString.SPOT, "bullet"));
        header.append(getEntityDef(ZString.CROSS, "cross"));
        header.append(getEntityDef(ZString.NOT, "not"));
        header.append(getEntityDef(ZString.NOT, "not"));
        
		header.append("]>\n");
		return header.toString();
	}
	
	private static String getEntityDef(String value, String entity) {
		return "<!ENTITY " + entity + " \"" + value + "\">\n";
	}
	
}