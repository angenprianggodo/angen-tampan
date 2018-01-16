package controllers.um;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import common.RestResponse;
import model.um.Product;

@RestController
@RequestMapping(value = "/mstProduct")
public class MstProductCtrl {

	@RequestMapping(value = "/all", method = RequestMethod.POST)
	public RestResponse getProduct() {
		Map<String, Object> map = new HashMap<>();
		List<Product> favLists = new ArrayList<>();
		List<Product> regLists = new ArrayList<>();
		List<Product> syaLists = new ArrayList<>();

		Product fav1 = new Product();
		fav1.setId(1L);
		fav1.setCode("TR001");
		fav1.setName("Permata Tabungan Bebas");
		fav1.setType("GF");
		fav1.setFamily("SavingO");
		fav1.setDesc("Hidup lebih hemat, hidup lebih mudah dengan cashback dan hadiah langsungnya.");
		fav1.setDescEn("");
		fav1.setUrl("");
		fav1.setImageUrl("http://10.87.248.76:8080/publics/asset-product/bebas_01.jpeg");
		fav1.setIsPrioritas("Y");
		fav1.setAccType(1L);
		fav1.setNisbah("");

		Product fav2 = new Product();
		fav2.setId(1L);
		fav2.setCode("TS012");
		fav2.setName("Permata Tabungan iB Bebas");
		fav2.setType("YA");
		fav2.setFamily("SavingO");
		fav2.setDesc("Cashback 5% di supermarket, toko online dan SPBU serta Gratis Tarik Tunai di ATM Bank apa saja.");
		fav2.setDescEn("");
		fav2.setUrl("");
		fav2.setImageUrl("http://10.87.248.76:8080/publics/asset-product/syariah_01.jpeg");
		fav2.setIsPrioritas("Y");
		fav2.setAccType(2L);
		fav2.setNisbah("20:80");

		Product reg = new Product();
		reg.setId(1L);
		reg.setCode("TR006");
		reg.setName("Permata Tabungan Optima");
		reg.setType("RI");
		reg.setFamily("SavingO");
		reg.setDesc("Bunga lebih Optimal, Hasil lebih Menguntungkan.");
		reg.setDescEn("");
		reg.setUrl("");
		reg.setImageUrl("http://10.87.248.76:8080/publics/asset-product/bebas_01.jpeg");
		reg.setIsPrioritas("N");
		reg.setAccType(1L);

		Product sya = new Product();
		sya.setId(1L);
		sya.setCode("TS005");
		sya.setName("PermataTabungan iB Optima");
		sya.setType("YO");
		sya.setFamily("SavingO");
		sya.setDesc("PermataTabungan iB Optima.");
		sya.setDescEn("");
		sya.setUrl("");
		sya.setImageUrl("http://10.87.248.76:8080/publics/asset-product/syariah_01.jpeg");
		sya.setIsPrioritas("N");
		sya.setAccType(2L);

		favLists.add(fav1);
		favLists.add(fav2);
		regLists.add(reg);
		syaLists.add(sya);

		map.put("FAVOURITE", favLists);
		map.put("REGULAR", regLists);
		map.put("SYARIAH", syaLists);

		RestResponse res = new RestResponse();
		res.setCode(0);
		res.setMessage("");
		res.setContent(map);

		return res;
	}
}
