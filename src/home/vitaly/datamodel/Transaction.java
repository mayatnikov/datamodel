package home.vitaly.datamodel;

import java.io.Serializable;

public interface Transaction extends Serializable {
    public Long getId();
    public void setId(Long id);
    public String getAi();
    public void setAi(String ai);
    public Integer getTtype();
    public void setTtype(Integer ttype);
    public String getCardnum();
	public void setCardnum(String cardnum);
	public String getTtime();
	public void setTtime(String ttime);
	public String getCntry();
	public void setCntry(String cntry);
	public String getAddress();
	public void setAddress(String address);
	public String getMerchname();
	public void setMerchname(String merchname);
	public String getTerminalid();
	public void setTerminalid(String terminalid);
	public String getScode();
	public void setScode(String scode);
	public Integer getMcc();
	public void setMcc(Integer mcc);
	public String getTcur();
	public void setTcur(String tcur);
	public Integer getTsum();
	public void setTsum(Integer tsum);
	public String getAccur();
	public void setAccur(String accur);
	public Integer getAcsum();
	public void setAcsum(Integer acsum);
	public String getAuthc();
	public void setAuthc(String authc);
	public Integer getRc();
	public void setRc(Integer rc);
	public String getPem();
	public void setPem(String pem);
	public Integer getAcqid();
	public void setAcqid(Integer acqid);
	public Integer getRvrsl();
	public void setRvrsl(Integer rvrsl);

	public String toString ();
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
