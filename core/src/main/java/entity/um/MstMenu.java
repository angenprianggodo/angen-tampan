package entity.um;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import entity.BaseEntity;

@Entity(name = "MstMenu")
@Table(schema = "USER_MANAGEMENT", name = "MST_MENU")
public class MstMenu extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1140619505198156620L;

	@Column(name = "MENU_CODE", length = 5, unique = true, nullable = false)
	private String menuCode;

	@Column(name = "MENU_NAME", length = 25, nullable = false)
	private String menuName;

	@Column(name = "PARENT_CODE", length = 5)
	private String parentCode;

	@Column(name = "TYPE", length = 15, nullable = false)
	private String type;

	@Column(name = "URL", length = 150)
	private String url;

	@Column(name = "SEQ", nullable = false)
	private Integer sequence;

	@Column(name = "ICON", length = 25)
	private String icon;

	@Column(name = "FLAG_ACTIVE", length = 1, nullable = false)
	private String flagActive;

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

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getFlagActive() {
		return flagActive;
	}

	public void setFlagActive(String flagActive) {
		this.flagActive = flagActive;
	}

}
