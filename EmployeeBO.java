package in.abc.bo;

public class EmployeeBO {

	private Integer empNo;
	private String empName;
	private String job;
	private Double sal;
	private Integer deptNo;
	private Integer mgrNo;
	
	
	
	@Override
	public String toString() {
		return "EmployeeBO [empNo=" + empNo + ", empName=" + empName + ", job=" + job + ", sal=" + sal + ", deptNo="
				+ deptNo + ", mgrNo=" + mgrNo + "]";
	}

	public Integer getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}

	

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public Integer getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	public Integer getMgrNo() {
		return mgrNo;
	}

	public void setMgrNO(Integer mgrNo) {
		this.mgrNo = mgrNo;
	}
	
	
	
}
