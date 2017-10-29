import com.taotao.common.TaotaoResult;
import com.taotao.pojo.TbItem;

public class Test {
	public static void main(String[] args) {
		String json = "{'status':200,'msg':'OK','data':{'id':1039296,'title':'合约惠机测试手机（请勿下单）','sellPoint':'','price':269900,'num':99999,'barcode':null,'image':'http://image.taotao.com/jd/7f4e1eaf8f06492aaaf7a717f20344c7.jpg','cid':560,'status':1,'created':1425821598000,'updated':1425821598000}}";
		TaotaoResult taotaoResult = TaotaoResult.formatToPojo(json, ItemInfo.class);
		System.out.println(taotaoResult);
	}
}
