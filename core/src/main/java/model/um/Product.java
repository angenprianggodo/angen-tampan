package model.um;

import java.io.Serializable;

public class Product implements Serializable {
	private static final long serialVersionUID = -3403284243932312874L;

	private Long id;
	private String code;
	private String name;
	private String type;
	private String family;
	private String desc;
	private String descEn;
	private String url;
	private String imageUrl;
	private String isPrioritas;
	private Long accType;
	private String nisbah;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDescEn() {
		return descEn;
	}

	public void setDescEn(String descEn) {
		this.descEn = descEn;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getIsPrioritas() {
		return isPrioritas;
	}

	public void setIsPrioritas(String isPrioritas) {
		this.isPrioritas = isPrioritas;
	}

	public Long getAccType() {
		return accType;
	}

	public void setAccType(Long accType) {
		this.accType = accType;
	}

	public String getNisbah() {
		return nisbah;
	}

	public void setNisbah(String nisbah) {
		this.nisbah = nisbah;
	}

}
