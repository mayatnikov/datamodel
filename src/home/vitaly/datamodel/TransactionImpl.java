package home.vitaly.datamodel;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tr" )
public class TransactionImpl  implements Transaction {
	private static final long serialVersionUID = 5171705971847030315L;
    /**
	 *  transaction model
	 */
	private Long id;
    private String ai;
    private Integer ttype ;
    private String cardnum;
    private String ttime;
    private String cntry;
    private String address;
    private String merchname;
    private String terminalid;
    private String scode;
    private Integer mcc;
    private String tcur;
    private Integer tsum;
    private String accur;
    private Integer acsum;
    private String authc;
    private Integer rc;
    private String pem;
    private Integer acqid;
    private Integer rvrsl;

    @Id
    @Column(name = "id")
    public Long getId() {
		return id;
	}
	
    public void setId(Long id) {
		this.id = id;
	}
    
    @Column(name = "ai")
    public String getAi() {
		return ai;
	}
    public void setAi(String ai) {
		this.ai = ai;
	}
	
    @Column(name = "ttype")
    public Integer getTtype() {
		return ttype;
	}
    public void setTtype(Integer ttype) {
		this.ttype = ttype;
	}
    @Column(name = "cardnum")
    public String getCardnum() {
		return cardnum;
	}
	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}
    @Column(name = "ttime")
	public String getTtime() {
		return ttime;
	}
	public void setTtime(String ttime) {
		this.ttime = ttime;
	}
    @Column(name = "cntry")
	public String getCntry() {
		return cntry;
	}
	public void setCntry(String cntry) {
		this.cntry = cntry;
	}
    @Column(name = "address")
    public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
    @Column(name = "merchname")
	public String getMerchname() {
		return merchname;
	}
	public void setMerchname(String merchname) {
		this.merchname = merchname;
	}
    @Column(name = "terminalid")
	public String getTerminalid() {
		return terminalid;
	}
	public void setTerminalid(String terminalid) {
		this.terminalid = terminalid;
	}
    @Column(name = "scode")
	public String getScode() {
		return scode;
	}
	public void setScode(String scode) {
		this.scode = scode;
	}
    @Column(name = "mcc")
	public Integer getMcc() {
		return mcc;
	}
	public void setMcc(Integer mcc) {
		this.mcc = mcc;
	}
    @Column(name = "tcur")
	public String getTcur() {
		return tcur;
	}
	public void setTcur(String tcur) {
		this.tcur = tcur;
	}
    @Column(name = "tsum")
	public Integer getTsum() {
		return tsum;
	}
	public void setTsum(Integer tsum) {
		this.tsum = tsum;
	}
    @Column(name = "accur")
	public String getAccur() {
		return accur;
	}
	public void setAccur(String accur) {
		this.accur = accur;
	}
    @Column(name = "acsum")
	public Integer getAcsum() {
		return acsum;
	}
	public void setAcsum(Integer acsum) {
		this.acsum = acsum;
	}
    @Column(name = "authc")
	public String getAuthc() {
		return authc;
	}
	public void setAuthc(String authc) {
		this.authc = authc;
	}
    @Column(name = "rc")
	public Integer getRc() {
		return rc;
	}
	public void setRc(Integer rc) {
		this.rc = rc;
	}
    @Column(name = "pem")
	public String getPem() {
		return pem;
	}
	public void setPem(String pem) {
		this.pem = pem;
	}
    @Column(name = "acqid")
	public Integer getAcqid() {
		return acqid;
	}
	public void setAcqid(Integer acqid) {
		this.acqid = acqid;
	}
    @Column(name = "rvrsl")
	public Integer getRvrsl() {
		return rvrsl;
	}
	public void setRvrsl(Integer rvrsl) {
		this.rvrsl = rvrsl;
	}

	public String toString () {
		String DLMTR = "\n";
		return (
				" ID:"+  id +DLMTR+
				" Acc.curr:"+ accur+DLMTR+
				" Address:"+  address+DLMTR+
				" Ai:"+  ai+DLMTR+
				" Authc:"+  authc+DLMTR+
				" Card Num:"+  cardnum+DLMTR+
				" Country:"+  cntry+DLMTR+
				" Merchant Name:"+  merchname+DLMTR+
				" Pem:"+  pem+DLMTR+
				" Scode:"+  scode+DLMTR+
				" Terminal:"+  terminalid+DLMTR+
				" Trans. Time:"+  ttime+DLMTR+
				" Acaid:"+  acqid+DLMTR+
				" Acc summ:"+  acsum+ DLMTR);			
		}

}

/** 
 * 
| id         | int(10)     | NO   | PRI | NULL    | auto_increment |
| ai         | char(3)     | NO   |     | NULL    |                |
| ttype      | int(3)      | NO   |     | NULL    |                |
| cardnum    | char(16)    | NO   |     | NULL    |                |
| ttime      | char(6)     | NO   |     | NULL    |                |
| cntry      | char(2)     | NO   |     | NULL    |                |
| address    | varchar(80) | NO   |     | NULL    |                |
| merchname  | varchar(80) | NO   |     | NULL    |                |
| terminalid | varchar(10) | NO   |     | NULL    |                |
| scode      | char(3)     | YES  |     | NULL    |                |
| mcc        | int(4)      | NO   |     | NULL    |                |
| tcur       | char(3)     | YES  |     | NULL    |                |
| tsum       | int(10)     | YES  |     | NULL    |                |
| accur      | char(3)     | YES  |     | NULL    |                |
| acsum      | int(10)     | YES  |     | NULL    |                |
| authc      | varchar(10) | YES  |     | NULL    |                |
| rc         | int(3)      | YES  |     | NULL    |                |
| pem        | char(5)     | YES  |     | NULL    |                |
| acqid      | int(4)      | YES  |     | NULL    |                |
| rvrsl      | int(2)      | YES  |     | NULL    |                |
 * 
 id,ai,ttype,cardnum,ttime,cntry,address,merchname,terminalid,scode,mcc,tcur,tsum,accur,acsum,authc,rc,pem,acqid,rvrsl
 * @author vitaly
 *
 */
