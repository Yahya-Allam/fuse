package org.mycompany.restapi;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

//  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class InputSearchEmployeePaginationDto {
	
 	  private String pDAYETYP = null;
	  
 	  private String pLANG = null;
	  
 	  private Integer pageNumber = null;
	  
 	  private Integer rowsPerPage = null;
	  
 	  private String search = null;
	 /**
	   * Get pDAYETYP
	   * @return pDAYETYP
	  **/
//	  @JsonProperty("p_DAYE_TYP")
	  public String getPDAYETYP() {
	    return pDAYETYP;
	  }

	  public void setPDAYETYP(String pDAYETYP) {
	    this.pDAYETYP = pDAYETYP;
	  }

	  public InputSearchEmployeePaginationDto pDAYETYP(String pDAYETYP) {
	    this.pDAYETYP = pDAYETYP;
	    return this;
	  }

	 /**
	   * Get pLANG
	   * @return pLANG
	  **/
//	  @JsonProperty("p_LANG")
	  public String getPLANG() {
	    return pLANG;
	  }

	  public void setPLANG(String pLANG) {
	    this.pLANG = pLANG;
	  }

	  public InputSearchEmployeePaginationDto pLANG(String pLANG) {
	    this.pLANG = pLANG;
	    return this;
	  }

	 /**
	   * Get pageNumber
	   * @return pageNumber
	  **/
//	  @JsonProperty("pageNumber")
	  public Integer getPageNumber() {
	    return pageNumber;
	  }

	  public void setPageNumber(Integer pageNumber) {
	    this.pageNumber = pageNumber;
	  }

	  public InputSearchEmployeePaginationDto pageNumber(Integer pageNumber) {
	    this.pageNumber = pageNumber;
	    return this;
	  }

	 /**
	   * Get rowsPerPage
	   * @return rowsPerPage
	  **/
//	  @JsonProperty("rowsPerPage")
	  public Integer getRowsPerPage() {
	    return rowsPerPage;
	  }

	  public void setRowsPerPage(Integer rowsPerPage) {
	    this.rowsPerPage = rowsPerPage;
	  }

	  public InputSearchEmployeePaginationDto rowsPerPage(Integer rowsPerPage) {
	    this.rowsPerPage = rowsPerPage;
	    return this;
	  }

	 /**
	   * Get search
	   * @return search
	  **/
//	  @JsonProperty("search")
	  public String getSearch() {
	    return search;
	  }

	  public void setSearch(String search) {
	    this.search = search;
	  }

	  public InputSearchEmployeePaginationDto search(String search) {
	    this.search = search;
	    return this;
	  }


	  @Override
	  public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("class InputSearchEmployeePagination {\n");
	    
	    sb.append("    pDAYETYP: ").append(toIndentedString(pDAYETYP)).append("\n");
	    sb.append("    pLANG: ").append(toIndentedString(pLANG)).append("\n");
	    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
	    sb.append("    rowsPerPage: ").append(toIndentedString(rowsPerPage)).append("\n");
	    sb.append("    search: ").append(toIndentedString(search)).append("\n");
	    sb.append("}");
	    return sb.toString();
	  }

	  /**
	   * Convert the given object to string with each line indented by 4 spaces
	   * (except the first line).
	   */
	  private static String toIndentedString(java.lang.Object o) {
	    if (o == null) {
	      return "null";
	    }
	    return o.toString().replace("\n", "\n    ");
	  }

}
