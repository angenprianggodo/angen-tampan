package entity.um;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import entity.BaseEntity;

@Entity(name = "MstMenu")
@Table(name = "MST_MENU")
public class MstMenu extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1140619505198156620L;

	@Column(name = "MENU_CODE", length = 5, unique = true, nullable = false)
	private String menuCode;

	@Column(name = "MENU_NAME", length = 15, nullable = false)
	private String menuName;

	@Column(name = "MENU_TYPE", length = 15, nullable = false)
	private String menuType;

	@Column(name = "MENU_PARENT", length = 15, nullable = false)
	private String menuParent;

	@Column(name = "URL", length = 100, nullable = false)
	private String url;

	@Column(name = "SEQ", length = 15, nullable = false)
	private String sequence;

	@Column(name = "FLAG_ACTIVE", length = 1, nullable = false)
	private String flagActive;

}
