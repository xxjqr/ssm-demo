package com.xxjqr.ssm_demo_mx.pojo;

public abstract class Page {
	private Integer pageSize = 5;//一页显示信息数(数据库查询用)
	private Integer pageNo = 1;//当前页数
	private Integer startRow = 0;//查询起始页(数据库查询用)
	private Integer pageCount;//总页数
	private Integer infoCount;//总信息条数
	
	public Page(){};
	
	public void initPage(Integer infoCount,Integer pageNo){
		this.infoCount = infoCount;
		this.pageNo = pageNo;
		
		//设置总页数
		pageCount = infoCount/pageSize;
		if(infoCount%pageSize != 0 || infoCount==0)
			pageCount+=1;
		
		//设置当前页和sql查询起始页
		if(pageNo == null || pageNo<1 || infoCount==0)
			this.pageNo=1;
		
		if(pageCount < this.pageNo){
			this.pageNo = pageCount;
		}
		
		//->设置查询起始页
		if (this.pageNo >=1 && infoCount!=0)
			this.startRow = (this.pageNo-1)*pageSize;
	}
	

	@Override
	public String toString() {
		return "Page [pageSize=" + pageSize + ", pageNo=" + pageNo + ", startRow=" + startRow + ", pageCount="
				+ pageCount + ", infoCount=" + infoCount + "]";
	}

	public Integer getPageNo() {
		return pageNo;
	}
	
	public Integer getPageCount() {
		return pageCount;
	}
	
	public Integer getInfoCount() {
		return infoCount;
	}
	
	public Integer getStartRow(){
		return this.startRow;
	}
	
	public Integer getPageSize(){
		return this.pageSize;
	}
}
