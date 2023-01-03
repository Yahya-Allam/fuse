package org.mycompany.restapi;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class JSONDto  {
 
	public int pageNumber  ;
	public int rowsPerPage  ;
	public String search  ;
	public String p_DAYE_TYP  ;
	public String p_LANG  ;

}
