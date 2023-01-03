package org.mycompany.erp;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.mycompany.restapi.JSONDto;
import org.springframework.stereotype.Component;

@Component

public class ERPProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
 		JSONDto dto = new JSONDto(); 		
 		int pageNumber = exchange.getIn().getHeader("pageNumber" , Integer.class);
 		int rowsPerPage= exchange.getIn().getHeader("rowsPerPage" , Integer.class);
 		String search = exchange.getIn().getHeader("search" , String.class);
 		String p_DAYE_TYP = exchange.getIn().getHeader("p_DAYE_TYP" , String.class);
 		String p_LANG  = exchange.getIn().getHeader("p_LANG" , String.class);
  			
 		dto.setPageNumber(pageNumber);
 		dto.setRowsPerPage(rowsPerPage);
 		dto.setSearch(search);
 		dto.setP_DAYE_TYP(p_DAYE_TYP);
 		dto.setP_LANG(p_LANG);
 		
  		exchange.getOut().setBody(dto);
 
	}

}
