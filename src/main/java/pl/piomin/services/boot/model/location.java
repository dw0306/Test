package pl.piomin.services.boot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document(collection="location2")
public class location {
	
	 @Id
	private String id; 
	 
	private String sggNm; 
	private int dSeq; 
	private int cSeq; 
	private int hSeq; 
	private int hSufSeq; 
	private String dNm; 
	private String cNm; 
	private String hNm; 
	private String hSufNm; 
	private int udrDiv; 
	private String buldManaNm; 
	private String bjdCd; 
	private String rnMgtSn; 
    private int udrtYn; 
    private int buldMnnm; 
    private int buldSlno;
    
}
