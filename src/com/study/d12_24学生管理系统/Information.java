package study.d12_24学生管理系统;

public class Information {
    private String username;
    private String passwd;
    private String personid;
    private String phonenum;

    public Information() {
    }

    public Information(String username, String passwd, String personid, String phonenum) {
        this.username = username;
        this.passwd = passwd;
        this.personid = personid;
        this.phonenum = phonenum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }
}
