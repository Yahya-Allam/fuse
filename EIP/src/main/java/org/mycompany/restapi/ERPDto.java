package org.mycompany.restapi;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
 public class ERPDto {
	  private String birthdate  ;
	  private String coMORACCDEPTName  ;
	  private String coMORACCDEVName   ;
	  private String coMORACCORGANIZATIONNAME  ;
	  private String coMORACCPOSNAME  ;
	  private String employeENAME  ;
	  private String employeENUMBER  ;
	  private String emPMOBILENUM ;
	  private String emPWORKNUM  ;
	  private String empGrade  ;
	  private String empSTEP  ;
	  private String hirEDATE ;
	  private String nationality  ;
	  private String nationaLIDENTIFIER  ;
	  private Integer numberOfEmployees ;
	  private String qualification  ;
	  private String rcjYLOCATION  ;
	  private String supervisoREMAIL  ;
	  private String supervisoRMOBILENUM  ;
	  private String supervisoRNAME ;
	  private String supervisoRWORKNUM  ;
	  private String supervisoRWORKNUMBER  ;
	  private String lev  ;

}
