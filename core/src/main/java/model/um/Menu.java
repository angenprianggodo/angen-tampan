package model.um;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import entity.BaseEntity;

public class Menu extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1140619505198156620L;

	private String menuCode;
	private String menuName;
	private String parentCode;
	private String type;
	private String url;
	private int sequence;
	private String icon;
	private int lvl;
	private List<Menu> submenu = new ArrayList<>();
	
	public Menu(){
	}
	
	public Menu(Menu m){
		this.menuCode = m.getMenuCode();
		this.menuName = m.getMenuName();
		this.parentCode = m.getParentCode();
		this.type = m.getType();
		this.url = m .getUrl();
		this.sequence = m.getSequence();
		this.icon = m.getIcon();
		this.lvl = m.getLvl();
		this.submenu = m.getSubmenu();
	}

	public String getMenuCode() {
		return menuCode;
	}

	public void setMenuCode(String menuCode) {
		this.menuCode = menuCode;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getParentCode() {
		return parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	public List<Menu> getSubmenu() {
		return submenu;
	}

	public void setSubmenu(List<Menu> submenu) {
		this.submenu = submenu;
	}

}
