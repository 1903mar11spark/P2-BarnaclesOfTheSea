package com.revature.beans;

public class ListItem {
	
	private List listId;
	private int listItemId;
	private String desc;
	private String itemTypeName;
	
	public List getListId() {
		return listId;
	}
	public void setListId(List listId) {
		this.listId = listId;
	}
	public int getListItemId() {
		return listItemId;
	}
	public void setListItemId(int listItemId) {
		this.listItemId = listItemId;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getItemTypeName() {
		return itemTypeName;
	}
	public void setItemTypeName(String itemTypeName) {
		this.itemTypeName = itemTypeName;
	}
	
	public ListItem(List listId, int listItemId, String desc, String itemTypeName) {
		super();
		this.listId = listId;
		this.listItemId = listItemId;
		this.desc = desc;
		this.itemTypeName = itemTypeName;
	}
	
	public ListItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "ListItem [listId=" + listId + ", listItemId=" + listItemId + ", desc=" + desc + ", itemTypeName="
				+ itemTypeName + "]";
	}
	

}
